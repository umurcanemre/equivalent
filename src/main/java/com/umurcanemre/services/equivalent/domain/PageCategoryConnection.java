package com.umurcanemre.services.equivalent.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.umurcanemre.services.equivalent.enumaration.CategoryStrength;

import lombok.Data;

@Data
@Entity
public class PageCategoryConnection {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	@ManyToOne
	private Page page;
	private CategoryStrength categoryStrength;
	@ManyToOne
	private Category category;
}
