package model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by claudiu on 12.03.2017.
 */
@DatabaseTable(tableName = "teams")
public class Team extends Model {
    public static final String NAME_FIELD_NAME = "name";

    @DatabaseField(columnName = NAME_FIELD_NAME, canBeNull = false, unique = true)
    private String name;

    public Team() {
    }

    public Team(String name) {
        this.name = name;
    }

    public Team(Integer id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                "name='" + name + '\'' +
                '}';
    }
}
