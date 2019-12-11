package com.umurcanemre.services.equivalent.enumaration;

import lombok.Getter;

@Getter
public enum CategoryStrength {
	WEAK(1),
	STRONG(2),
	PRIORITY(3);
	
	private int value;
	
	CategoryStrength(int value) {
		this.value = value;
	}
}
