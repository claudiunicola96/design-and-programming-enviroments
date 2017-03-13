package model;

import com.j256.ormlite.field.DatabaseField;

import java.io.Serializable;

public abstract class Model implements HasId<Integer>, Serializable {
    @DatabaseField(generatedId = true)
    protected Integer id;

    public Model() {
    }

    /**
     * @param id The id of model.
     */
    public Model(Integer id) {
        this.id = id;
    }

    /**
     * @return Integer
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id of object.
     * @return Model
     */
    public Model setId(Integer id) {
        this.id = id;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Model model = (Model) o;

        return id != null ? id.equals(model.id) : model.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
