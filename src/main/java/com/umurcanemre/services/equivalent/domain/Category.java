package com.umurcanemre.services.equivalent.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Category {
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE)
	private long id;
	private String name;
	private String description;
	
	@Override
	public String toString() {
		return id + "." + name;
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Category))
			return false;
		if(o == this)
			return true;
		Category c = (Category)o;
		
		return this.id == c.getId();
	}
	
	@Override
	public int hashCode() {
		return (int)(id < Integer.MAX_VALUE ? id : id % Integer.MAX_VALUE);
	}
}
