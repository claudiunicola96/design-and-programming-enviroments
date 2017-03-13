package util;

import com.j256.ormlite.support.ConnectionSource;

import java.sql.Connection;

public interface ConnectionManagerContract {
    public ConnectionSource getConnection() throws Exception;
}
