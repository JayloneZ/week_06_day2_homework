package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 31/10/2017.
 */

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director(1, "Frank", "AB123456C", 30000.00, "Finance", 5000000.00);
    }

    @Test
    public void testGetBudget() {
        assertEquals(5000000.00, director.getBudget(), 0.01);
    }


}
