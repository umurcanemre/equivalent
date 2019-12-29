package com.umurcanemre.services.equivalent.service;

import java.util.List;

import com.umurcanemre.services.equivalent.domain.Page;
import com.umurcanemre.services.equivalent.enumaration.CategoryStrength;

public interface PageService {
	List<Page> getEquivalentPageForCountry(long sourcePageId, String desiredCountryCode);
	List<Page> getEquivalentPageForCountry(long sourcePageId, String desiredCountryCode, CategoryStrength categoryStrength);
}
