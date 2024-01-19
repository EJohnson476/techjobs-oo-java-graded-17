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

        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine()
    {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String expected = job1.toString();

        assertEquals(true, expected.startsWith("\n"));

        assertEquals(true, expected.endsWith("\n"));
    }

    @Test
   public void testToStringContainsCorrectLabelsAndData()
    {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expected =  '\n' +
                "ID: " + job1.getId() + '\n' +
                "Name: "  + "Product tester" + '\n' +
                "Employer: " + "ACME" + '\n' +
                "Location: " + "Desert" + '\n' +
                "Position Type: " + "Quality control"  + '\n' +
                "Core Competency: " + "Persistence" +
                '\n';
            assertEquals(job1.toString(),expected);
    }

    @Test
    public void testToStringHandlesEmptyField ()
    {
        Job job1 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String expected = '\n' +
                "ID: " + job1.getId() + '\n' +
                "Name: "  + "Data not available" + '\n' +
                "Employer: " + "Data not available" + '\n' +
                "Location: " + "Data not available" + '\n' +
                "Position Type: " + "Data not available"  + '\n' +
                "Core Competency: " + "Data not available" +
                '\n';
        assertEquals(job1.toString(),expected);
    }
}

