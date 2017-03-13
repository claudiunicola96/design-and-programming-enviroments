package repository;

import model.Team;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import util.SqliteConnectionManager;

import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by claudiu on 12.03.2017.
 */
public class RepositoryTest {
    RepositoryContract<Integer, Team> repository;

//    @Before
//    public void setUp() throws Exception {
//        SqliteConnectionManager sqliteConnectionManager = new SqliteConnectionManager("test-bd.config");
//        repository = new Repository<Integer, Team>(sqliteConnectionManager.getConnection(), Team.class);
//        this.repository.add(new Team(1, "one"));
//        this.repository.add(new Team(2, "two"));
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        this.repository.remove(this.repository.getById(1));
//        this.repository.remove(this.repository.getById(2));
//    }
//
//    @Test
//    public void add() throws Exception {
//        Team team = new Team(3, "test");
//        int result = this.repository.add(team);
//        assertEquals(1, result);
//    }
//
//    @Test
//    public void remove() throws Exception {
//        int result = this.repository.remove(new Team(1, "one"));
//        assertEquals(1, result);
//    }
//
//    @Test
//    public void update() throws Exception {
//
//    }
//
//    @Test
//    public void getById() throws Exception {
//        assertEquals("one", this.repository.getById(1).getName());
//        assertNotEquals("one", this.repository.getById(1).getName());
//    }
//
//    @Test
//    public void existId() throws Exception {
//        assertTrue(this.repository.existId(1));
//        assertFalse(this.repository.existId(12));
//    }
//
//    @Test
//    public void all() throws Exception {
//
//    }

}