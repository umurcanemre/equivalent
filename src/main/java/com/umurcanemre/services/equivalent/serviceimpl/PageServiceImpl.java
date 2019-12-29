package com.umurcanemre.services.equivalent.serviceimpl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umurcanemre.services.equivalent.domain.Page;
import com.umurcanemre.services.equivalent.enumaration.CategoryStrength;
import com.umurcanemre.services.equivalent.repository.PageRepository;
import com.umurcanemre.services.equivalent.service.PageService;

import lombok.Setter;

@Service
@Setter
public class PageServiceImpl implements PageService {
	@Autowired
	private PageRepository repository;

	@Override
	public List<Page> getEquivalentPageForCountry(long sourcePageId, String desiredCountryCode) {
		return getEquivalentPageForCountry(sourcePageId, desiredCountryCode, CategoryStrength.PRIORITY);
	}

	@Override
	public List<Page> getEquivalentPageForCountry(long sourcePageId, String desiredCountryCode,
			CategoryStrength categoryStrength) {
		Page sourcePage = repository.findOneById(sourcePageId);

		// TODO: query page by id, get most relevant category, query possibilities

		return Collections.emptyList();
	}
}
