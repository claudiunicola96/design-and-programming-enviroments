package model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by claudiu on 12.03.2017.
 */
@DatabaseTable(tableName = "participants")
public class Participant extends Model {
    public static final String NAME_FIELD_NAME = "name";
    public static final String CAPACITY_FIELD_NAME = "capacity";

    @DatabaseField(columnName = NAME_FIELD_NAME, canBeNull = false, unique = true)
    private String name;

    @DatabaseField(columnName = CAPACITY_FIELD_NAME, canBeNull = false)
    private Integer capacity;

    public Participant() {
    }

    public Participant(String name, Integer capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public Participant(Integer id, String name, Integer capacity) {
        super(id);
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "id=" + id +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
