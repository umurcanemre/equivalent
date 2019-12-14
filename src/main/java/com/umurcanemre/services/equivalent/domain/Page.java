package com.umurcanemre.services.equivalent.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Page {

	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE)
	private long id;
	private String name;
	private String url;
	private String description;
	private String countryCode;
	
	@OneToMany
	private Set<PageCategoryConnection> categories;

	
	@Override
	public String toString() {
		return id + "." + name;
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Page))
			return false;
		if(o == this)
			return true;
		Page c = (Page)o;
		
		return this.id == c.getId();
	}
	
	@Override
	public int hashCode() {
		return (int)(id < Integer.MAX_VALUE ? id : id % Integer.MAX_VALUE);
	}
}
