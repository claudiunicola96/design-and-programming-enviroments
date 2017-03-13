package repository;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;
import model.HasId;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by claudiu on 11.03.2017.
 */
public class Repository<Id, T extends HasId<Id>> implements RepositoryContract<Id, T> {
    /**
     * The Data Access object.
     */
    Dao<T, Id> dao;

    public Repository(ConnectionSource connectionSource, Class<T> tClass) {
        try {
            this.dao = DaoManager.createDao(connectionSource, tClass);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int add(T item) throws RepositoryException, SQLException {
        T objectFromDb = this.dao.queryForId(item.getId());
        if (objectFromDb != null) {
            throw new RepositoryException("Duplicate id");
        }
        return this.dao.create(item);
    }

    public int remove(T item) throws RepositoryException, SQLException {
        T object = this.getById(item.getId());
        return this.dao.delete(object);
    }

    public void update(T item) throws RepositoryException, SQLException {
        this.dao.update(item);
    }

    public T getById(Id id) throws RepositoryException, SQLException {
        if (!this.existId(id)) {
            throw new RepositoryException("Could not found the object with id " + id);
        }
        return this.dao.queryForId(id);
    }

    public boolean existId(Id id) throws SQLException {
        if (this.dao.queryForId(id) == null)
            return false;
        return true;
    }

    public Collection all() throws SQLException {
        return this.dao.queryForAll();
    }
}
