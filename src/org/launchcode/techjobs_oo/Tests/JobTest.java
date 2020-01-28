package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job test_job1;
    Job test_job2;

    @Before
    public void createJobObject() {
        test_job1 = new Job();
        test_job2 = new Job();

    }

    @Test
    public void testSettingJobId() {

        assertFalse(test_job1 == test_job2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(test_job3.getName() instanceof String);
        assertEquals(test_job3.getName(), "Product tester");
        assertTrue(test_job3.getEmployer() instanceof Employer);
        assertEquals(test_job3.getEmployer().getValue(), "ACME");
        assertTrue(test_job3.getLocation() instanceof Location);
        assertEquals(test_job3.getLocation().getValue(), "Desert");
        assertTrue(test_job3.getPositionType() instanceof PositionType);
        assertEquals(test_job3.getPositionType().getValue(), "Quality control");
        assertTrue(test_job3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(test_job3.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {

        Job test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(test_job4.equals(test_job5));
    }

}
