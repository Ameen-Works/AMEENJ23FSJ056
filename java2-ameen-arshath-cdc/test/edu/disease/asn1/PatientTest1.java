package edu.disease.asn1;

import static org.junit.Assert.assertEquals;

import java.util.UUID;

import org.junit.Before;
import org.junit.Test;

public class PatientTest1 {
	private Patient patient;

    @Before
    public void setUp() {
        patient = new Patient(3, 5);
    }

    @Test
    public void testAddDiseaseId() {
    	Patient patient1=new Patient(3, 5);
    	
    	patient1.setDiseaseIds(new UUID[3]);
    	
    	Disease diseaseId1=new Disease();
    	diseaseId1.setDiseaseId();
    	Disease diseaseId2=new Disease();
    	diseaseId2.setDiseaseId();
//        UUID diseaseId1 = Disease.;
//        UUID diseaseId2 = UUID.randomUUID();

        patient1.addDiseaseId(diseaseId1.getDiseaseId());
        patient1.addDiseaseId(diseaseId2.getDiseaseId());
        
        UUID[] ids=patient1.getDiseaseIds();
        
        assertEquals(diseaseId1.getDiseaseId(), ids[0]);
        assertEquals(diseaseId2.getDiseaseId(), ids[1]);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddDiseaseIdThrowsException() {
        for (int i = 0; i < 4; i++) {
            patient.addDiseaseId(UUID.randomUUID());
        }
    }

    @Test
    public void testAddExposure() {
    	Patient patient=new Patient(2,4);
    	patient.setPatientId(UUID.randomUUID());
    	
    	patient.setExposures(new Exposure[4]);
    	
        Exposure exposure1 = new Exposure(patient.getPatientId());
        Exposure exposure2 = new Exposure(patient.getPatientId());
        
        patient.addExposure(exposure1);
        patient.addExposure(exposure2);

        assertEquals(exposure1, patient.exposures[0]);
        assertEquals(exposure2, patient.exposures[1]);
    }
    @Test
    public void setAndGetPatientName() {
    	Patient patient=new Patient(2,4);
    	patient.setPatientId(UUID.randomUUID());
    	
    	patient.setFirstName("Arshath");
    	patient.setLastName("Ameen");
    	
    	assertEquals("Arshath", patient.getFirstName());
    	assertEquals("Ameen", patient.getLastName());
    }
    
    @Test 
    public void setAndGetExposures() {
    	Patient patient=new Patient(2,4);
    	patient.setPatientId(UUID.randomUUID());
    	
    	patient.setExposures(new Exposure[4]);
    	
    	assertEquals(4, patient.getExposures().length);
    }
    
    @Test
    public void setAndGetDiseaseIds() {
    	Patient patient=new Patient(2,4);
    	patient.setPatientId(UUID.randomUUID());
    	
    	patient.setDiseaseIds(new UUID[2]);
    	
    	assertEquals(2, patient.getDiseaseIds().length);
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddExposureThrowsException() {
    	Patient patient=new Patient(2,3);
    	patient.setPatientId(UUID.randomUUID());
        for (int i = 0; i < 6; i++) {
            patient.addExposure(new Exposure(patient.getPatientId()));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentException() {
        new Patient(0, 0);
    }
}

