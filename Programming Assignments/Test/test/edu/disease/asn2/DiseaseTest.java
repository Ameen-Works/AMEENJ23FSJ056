package edu.disease.asn2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DiseaseTest {
	private Disease disease;

    @Before
    public void setUp() {
        disease = new InfectiousDisease();
    }

    @Test
    public void testSetAndGetDiseaseId() {
        UUID uuid = UUID.randomUUID();
        disease.setDiseaseId(uuid);
        assertEquals(uuid, disease.getDiseaseId());
    }

    @Test
    public void testSetNameAndGetDiseaseName() {
        String name = "Influenza";
        disease.setName(name);
        assertEquals(name, disease.getName());
    }

    @Test
    public void testEqualsAndHashCode() {
        Disease disease1 = new InfectiousDisease();
        Disease disease2 = new InfectiousDisease();

        assertEquals(disease1, disease2);
        assertEquals(disease1.hashCode(), disease2.hashCode());

        disease2.setDiseaseId(UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479"));
        assertNotEquals(disease1, disease2);
        assertNotEquals(disease1.hashCode(), disease2.hashCode());
    }

    @Test
    public void testToString() {
        disease.setDiseaseId(UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479"));
        disease.setName("COVID-19");

        String expected = "Disease [diseaseId=f47ac10b-58cc-4372-a567-0e02b2c3d479, name=COVID-19]";
        assertEquals(expected, disease.toString());
    }
	
	@Test
	public void TestOverrides() {
		InfectiousDisease infectDisease=new InfectiousDisease();
		String[] expected= {"Common cold","Stomach Flu","COVID-19","Hepatitis"};
		Assert.assertArrayEquals(expected, infectDisease.getExamples()); 
		
		NonInfectiousDisease nonInfectDisease=new NonInfectiousDisease();
		String[] expected1={"Diabetes","Injuries","Cancer","Respiratory Disease"};
		Assert.assertArrayEquals(expected1, nonInfectDisease.getExamples()); 
		
	}
}
