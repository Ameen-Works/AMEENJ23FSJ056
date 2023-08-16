package edu.disease.asn2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

import org.junit.Test;

import edu.disease.asn1.Exposure;

public class PatientTest {
	public void main(String[] args) {
		testPatient();
		testPatient2();
		testPatient3();
        testAddDiseaseId();
        testAddDiseaseId2();
        testAddExposure();
    }
	@Test (expected=IllegalArgumentException.class)
	public  void testPatient() {
		// TODO Auto-generated method stub
        new Patient(0, 3);

		
	}
	@Test (expected=IllegalArgumentException.class)
	public  void testPatient2() {
		// TODO Auto-generated method stub
        new Patient(0, 0);

		
	}
	@Test (expected=IllegalArgumentException.class)
	public  void testPatient3() {
		// TODO Auto-generated method stub
        new Patient(2, 0);

		
	}
	@Test 
    public  void testAddDiseaseId() {
        Patient patient = new Patient(5, 3);
        UUID diseaseId1 = UUID.randomUUID();
        UUID diseaseId2 = UUID.randomUUID();

        patient.addDiseaseId(diseaseId1);
        patient.addDiseaseId(diseaseId2);

       
    }
	@Test (expected=IndexOutOfBoundsException.class)
	public  void testAddDiseaseId2() {
		Patient patient = new Patient(2, 3);
        UUID diseaseId1 = UUID.randomUUID();
        UUID diseaseId2 = UUID.randomUUID();
        UUID diseaseId3 = UUID.randomUUID();

        patient.addDiseaseId(diseaseId1);
        patient.addDiseaseId(diseaseId2);
        patient.addDiseaseId(diseaseId3);
	}
	@Test 
    public  void testAddExposure() {
        Patient patient = new Patient(3, 5);
        patient.setPatientId(UUID.randomUUID());
        Exposure exposure1 = new Exposure(patient.getPatientId());
        Exposure exposure2 = new Exposure(patient.getPatientId());

        patient.addExposure(exposure1);
        patient.addExposure(exposure2);

        Exposure[] exposures = patient.exposures;
        for (Exposure exposure : exposures) {
            System.out.println("Exposure: " + exposure);
        }
    }
	
	@Test (expected=IndexOutOfBoundsException.class)
    public  void testAddExposure1() {
        Patient patient = new Patient(3, 1);
        patient.setPatientId(UUID.randomUUID());
        Exposure exposure1 = new Exposure(patient.getPatientId());
        Exposure exposure2 = new Exposure(patient.getPatientId());

        patient.addExposure(exposure1);
        patient.addExposure(exposure2);
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
	    
	    @Test
	    public void TesthashCode() {
	    	UUID id1=UUID.randomUUID();

	    	Patient patient=new Patient(2,4);
	    	patient.setPatientId(id1);
	    	
	    	Patient patient1=new Patient(2,4);
	    	patient.setPatientId(id1);
	    	
//	    	assertEquals(true,patient.getPatientId().equals(patient1.getPatientId()));

	    	assertEquals(Objects.hash(id1),patient.hashCode());
	    }
	    @Test
	    public void testEquals() {
	    	Patient patient=new Patient(2,4);
	    	Patient patient1=new Patient(2,4);

	    	assertEquals(true,patient.equals(patient1));
	    }
	    
	    @Test
	    public void testToString() {
	    	Patient patient=new Patient(2,4);
	    	patient.setPatientId(UUID.randomUUID());
	    	patient.setFirstName("Arshath");
	    	patient.setLastName("Ameen");
	    	Exposure exposure=new Exposure(patient.getPatientId());
	    	exposure.setExposureType("D");
	        exposure.setDateTime(LocalDateTime.now());
	    	patient.addExposure(exposure);
	    	
	        String expected = "Patient [patientId=" + patient.getPatientId() + ", firstName=" + patient.getFirstName() + ", lastName=" + patient.getLastName()
					+ ", exposures=" + Arrays.toString(patient.getExposures()) + ", diseaseIds=" + Arrays.toString(patient.getDiseaseIds()) + "]";
	        assertEquals(expected, patient.toString());
	    }
	@Test
	public void testSort() {
		Patient patient1 = new Patient(2, 3);
        patient1.setFirstName("Ram");
        patient1.setLastName("Charan");

        Patient patient2 = new Patient(2, 3);
        patient2.setFirstName("Mani");
        patient2.setLastName("Kandan");
        
        Patient[] patients = {patient1, patient2};

        Arrays.sort(patients);
        
        assertEquals("Mani", patients[1].getFirstName());
	}
	
	@Test
	public void testSort2() {
		Patient patient1 = new Patient(2, 3);
        patient1.setFirstName("Ram");
        patient1.setLastName("Charan");

        Patient patient2 = new Patient(2, 3);
        patient2.setFirstName("Arshath");
        patient2.setLastName("Ameen");
        
        Patient[] patients = {patient1, patient2};

        Arrays.sort(patients);
//        System.out.println(patients[1].getLastName());
        
        assertEquals("Ameen", patients[0].getLastName());
	}
}
