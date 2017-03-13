package util;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

import java.io.FileReader;
import java.sql.SQLException;
import java.util.Properties;

public class SqliteConnectionManager implements ConnectionManagerContract {
    private String dbConfigFile;
    private Properties serverProps = new Properties();
    private ConnectionSource instance = null;

    public SqliteConnectionManager(String dbConfigFile) {
        try {
            this.serverProps.load(new FileReader(dbConfigFile));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private ConnectionSource getNewConnection() {
        try {
            return new JdbcConnectionSource(serverProps.getProperty("model.jdbc.url"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ConnectionSource getConnection() throws Exception {
        if (this.instance == null) {
            this.instance = this.getNewConnection();
        }
        return instance;
    }
}
