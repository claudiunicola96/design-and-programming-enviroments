package util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by claudiu on 12.03.2017.
 */
public class SqliteConnectionManagerTest {

    SqliteConnectionManager sqliteConnectionManager;

    @Before
    public void setUp() throws Exception {
        sqliteConnectionManager = new SqliteConnectionManager("bd.config");
    }

    @Test
    public void getConnection() throws Exception {
        assertNotNull(sqliteConnectionManager.getConnection());
    }

}