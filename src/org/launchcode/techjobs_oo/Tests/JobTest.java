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

    @Test
    public void testForToStringBlankLine() {

        Job test_job6 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobString = test_job6.toString();
        int endOfString = jobString.length() - 1;


        assertEquals(jobString.indexOf("\n"), 0);
        assertEquals(jobString.indexOf("\n", jobString.length() - 2), endOfString);
    }

    @Test
    public void testForLabelAndNewLine() {

        Job test_job7 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobString = test_job7.toString();

        assertTrue(jobString.contains("ID: " + test_job7.getId()));
        assertTrue(jobString.contains("Name: " + test_job7.getName()));
        assertTrue(jobString.contains("Employer: " + test_job7.getEmployer()));
        assertTrue(jobString.contains("Location: " + test_job7.getLocation()));
        assertTrue(jobString.contains("Position Type: " + test_job7.getPositionType()));
        assertTrue(jobString.contains("Core Competency: " + test_job7.getCoreCompetency()));
    }

    @Test
    public void testForEmptyField() {

        Job test_job8 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobString = test_job8.toString();

        assertTrue(jobString.contains("Employer: " + "Data not available"));
    }

//    @Test
//    public void testForEmptyJob() {
//
//        Job test_job9 = new Job();
//        System.out.println(test_job9.toString());
//        String jobString = test_job9.toString();
//
//        assertEquals(jobString, "OOPS! This job does not seem to exist.");
//    }

}
