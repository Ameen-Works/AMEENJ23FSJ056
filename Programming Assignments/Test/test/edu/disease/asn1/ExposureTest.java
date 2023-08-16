package edu.disease.asn1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExposureTest {

	private Exposure exposure;

    @Before
    public void setUp() {
        exposure = new Exposure(null);
    }

    @Test
    public void testGetPatientId() {
    	Patient patient=new Patient(2,3);
    	patient.setPatientId(UUID.randomUUID());
    	Exposure exposure1= new Exposure(patient.getPatientId());
		patient.addExposure(exposure1);
        assertNotNull(exposure1.getPatientId());
    }

    @Test
    public void testSetAndGetDateTime() {
        LocalDateTime dateTime = LocalDateTime.now();
        exposure.setDateTime(dateTime);
        assertEquals(dateTime, exposure.getDateTime());
    }

    @Test
    public void testSetAndGetExposureType() {
        exposure.setExposureType("D");
        assertEquals("D", exposure.getExposureType());

        exposure.setExposureType("I");
        assertEquals("I", exposure.getExposureType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetExposureTypeInvalid() {
        exposure.setExposureType("X");
    }

    @Test
    public void testEqualsAndHashCode() {
    	Patient patient=new Patient(2,3);
    	patient.setPatientId(UUID.randomUUID());
        Exposure exposure1 = new Exposure(patient.getPatientId());
        Exposure exposure2 = new Exposure(patient.getPatientId());

        Assert.assertTrue(exposure1.hashCode()==exposure2.hashCode());
        assertEquals(true, exposure1.equals(exposure2));
        assertEquals(exposure1.hashCode(), exposure2.hashCode());
//
        exposure2.setDateTime(LocalDateTime.now());
        assertEquals(false, exposure1.equals(exposure2));
        assertNotEquals(exposure1, exposure2);
        assertNotEquals(exposure1.hashCode(), exposure2.hashCode());
    }

    @Test
    public void testToString() {
        exposure.setExposureType("D");
        exposure.setDateTime(LocalDateTime.now());

        String expected = "Exposure [patientId=" + exposure.getPatientId() + ", dateTime=" + exposure.getDateTime() +
                          ", exposureType=D]";
        assertEquals(expected, exposure.toString());
    }
}
