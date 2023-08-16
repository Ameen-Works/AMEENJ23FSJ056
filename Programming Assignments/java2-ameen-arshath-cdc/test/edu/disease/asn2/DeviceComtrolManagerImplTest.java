package edu.disease.asn2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class DeviceComtrolManagerImplTest {

	private DiseaseControlManagerImpl manager;

    @Before
    public void setUp() {
        manager = new DiseaseControlManagerImpl(5, 5) {
            // You can override any abstract methods here if needed
        };
    }

    @Test
    public void testAddDisease() {
        Disease disease = manager.addDisease("COVID-19", true);
        assertNotNull(disease);
        assertEquals("COVID-19", disease.getName());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddDiseaseThrowsIndexOutOfBoundsException() {
        for (int i = 0; i < 6; i++) {
            manager.addDisease("Disease " + i, true);
        }
    }

    @Test
    public void testGetDisease() {
        Disease disease = manager.addDisease("Influenza", false);
        assertNotNull(disease);

        Disease retrievedDisease = manager.getDisease(disease.getDiseaseId());
        assertNotNull(retrievedDisease);
        assertEquals(disease.getDiseaseId(), retrievedDisease.getDiseaseId());
    }

    @Test
    public void testAddPatient() {
        Patient patient = manager.addPatient("John", "Doe", 3, 5);
        assertNotNull(patient);
        assertEquals("John", patient.getFirstName());
        assertEquals("Doe", patient.getLastName());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddPatientThrowsIndexOutOfBoundsException() {
        for (int i = 0; i < 6; i++) {
            manager.addPatient("First", "Last", 3, 5);
        }
    }

}
