package com.umurcanemre.services.equivalent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.umurcanemre.services.equivalent.domain.Page;
import com.umurcanemre.services.equivalent.service.PageService;

import lombok.Setter;

@RestController
@RequestMapping("/page")
@Setter
public class EquivalentPagesController {
	@Autowired
	private PageService service;
	
	@GetMapping
	public List<Page> getEquivalentPageForCountry(
			@RequestParam long sourcePageId, @RequestParam String targetCountryCode){
		return service.getEquivalentPageForCountry(sourcePageId, targetCountryCode);
	}
}
