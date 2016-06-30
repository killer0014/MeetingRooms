package com.github.killer0014.rfmas;

public class Facility {
	public static final String MAG_NIET_EMPTY_ZIJN = "Mag niet empty zijn";
	private String facilityName;

	// Creating Constructor
	public Facility(String facilityName) {
		if (facilityName == null) {
			throw new IllegalArgumentException(MAG_NIET_EMPTY_ZIJN);
		}

		this.facilityName = facilityName;

	}

	public String getName() {
		return facilityName;
	}

}
