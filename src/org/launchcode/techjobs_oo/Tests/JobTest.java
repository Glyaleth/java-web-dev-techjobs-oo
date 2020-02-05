package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;



public class JobTest {

    Job bop;
    Job bap;
    Job seriousJob;
    Job seriousJob2;
    @Before
    public void createObjects(){
        bop = new Job();
        bap = new Job();
        seriousJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        seriousJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId(){
        assertEquals("IDs are the same", bop.getId(), bap.getId(),1);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertTrue(seriousJob.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(seriousJob.getName() instanceof String);
        assertTrue(seriousJob.getLocation() instanceof Location);
        assertTrue(seriousJob.getPositionType() instanceof PositionType);
        assertTrue((seriousJob.getEmployer() instanceof Employer));
    }

    @Test
    public void testJobsForEquality(){
        assertFalse(seriousJob == seriousJob2);
    }

}
