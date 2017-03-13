package repository;


import model.HasId;

import java.sql.SQLException;
import java.util.Collection;


/**
 * @param <Id> The primary key.
 * @param <T>  The type of object.
 */
public interface RepositoryContract<Id, T extends HasId<Id>> {
    /**
     * @param item The object.
     * @throws RepositoryException
     */
    int add(T item) throws RepositoryException, SQLException;

    /**
     * @param item The object.
     * @throws RepositoryException
     */
    int remove(T item) throws RepositoryException, SQLException;

    /**
     * @param item The object.
     * @throws RepositoryException
     */
    void update(T item) throws RepositoryException, SQLException;

    /**
     * @param id The seeking id.
     * @return An object of type T.
     */
    T getById(Id id) throws RepositoryException, SQLException;

    /**
     * @param id The seeking id.
     * @return bool
     */
    boolean existId(Id id) throws SQLException;

    /**
     * @return Collection<T>
     */
    Collection<T> all() throws SQLException;
}
