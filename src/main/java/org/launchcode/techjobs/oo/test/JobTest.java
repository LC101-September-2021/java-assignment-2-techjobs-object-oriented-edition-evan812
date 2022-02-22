package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    private Job test_job;
    private Job test_job2;
    private Job test_job3;
    private Job test_job4;
    private Job test_job5;


    @Before
    public void JobTest() {
        test_job = new Job();
        test_job2 = new Job();
        test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job4 = new Job("Senior Dev", new Employer("Google"), new Location("Mountain"), new PositionType("Oversee"), new CoreCompetency("Patience"));
        test_job5 = new Job("Senior Dev", new Employer("Google"), new Location("Mountain"), new PositionType("Oversee"), new CoreCompetency("Patience"));
    }

    @Test
    public void testSettingJobId(){
        assertTrue(test_job.getId() != test_job2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals("Product tester", test_job3.getName());
        assertEquals("ACME", test_job3.getEmployer().getValue());
        assertEquals("Desert", test_job3.getLocation().getValue());
        assertEquals("Quality control", test_job3.getPositionType().getValue());
        assertEquals("Persistence", test_job3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        assertFalse(test_job4.equals(test_job5));
    }

    @Test
    public void testToString(){
        char zeroIndex = test_job3.toString().charAt(0);
        char lastIndex = test_job3.toString().charAt(test_job3.toString().length() - 1);
        assertEquals(zeroIndex, lastIndex);
    }


}
