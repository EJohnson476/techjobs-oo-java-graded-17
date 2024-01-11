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

        assertTrue(theJob.getName() == "Product Tester");
        assertEquals(Job.class, theJob.getName().getClass());

        assertTrue(theJob.getEmployer() instanceof Employer);
        assertEquals("ACME", theJob.getEmployer());

        assertTrue(theJob.getLocation() instanceof Location);
        assertEquals("Desert", theJob.getLocation());

        assertTrue(theJob.getPositionType() instanceof PositionType);
        assertEquals("Quality control", theJob.getPositionType());

        assertTrue(theJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", theJob.getCoreCompetency());
    }
}
