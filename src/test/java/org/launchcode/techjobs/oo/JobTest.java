package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {

    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId()
    {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1,job2);

    }

    @Test
    public void testJobConstructorSetsAllFields()
    {
        Job theJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(theJob.getName() instanceof String);
        assertEquals("Product tester", theJob.getName());

        assertTrue(theJob.getEmployer() instanceof Employer);
        assertEquals("ACME", theJob.getEmployer().getValue());

        assertTrue(theJob.getLocation() instanceof Location);
        assertEquals("Desert", theJob.getLocation().getValue());

        assertTrue(theJob.getPositionType() instanceof PositionType);
        assertEquals("Quality control", theJob.getPositionType().getValue());

        assertTrue(theJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", theJob.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality()
    {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        job1.equals(job2);
    }
}
