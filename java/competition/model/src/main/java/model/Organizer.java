package model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by claudiu on 11.03.2017.
 */
@DatabaseTable(tableName = "organizers")
public class Organizer extends Model {

    public static final String USERNAME_FIELD_NAME = "username";
    public static final String PASSWORD_FIELD_NAME = "password";

    @DatabaseField(columnName = USERNAME_FIELD_NAME, canBeNull = false, unique = true)
    private String username;
    @DatabaseField(columnName = PASSWORD_FIELD_NAME, canBeNull = false)
    private String password;

    public Organizer() {
    }

    public Organizer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Organizer(Integer id, String username, String password) {
        super(id);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Organizer{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
