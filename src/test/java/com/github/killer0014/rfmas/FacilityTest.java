package com.github.killer0014.rfmas;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FacilityTest {
	@Rule
	public ExpectedException exception = ExpectedException.none();


	@Test
	public void createComputer() throws Exception {
		assertEquals ("Computer", new Facility("Computer").getName());
	}
	
	@Test
	public void createBeamer() throws Exception {
		assertEquals ("Beamer", new Facility("Beamer").getName());
	}

	@Test
	public void createNameNull() throws Exception {
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("Mag niet empty zijn");
		
		new Facility(null);		
	}
	

}
