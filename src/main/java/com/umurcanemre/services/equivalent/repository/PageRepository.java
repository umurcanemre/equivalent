package com.umurcanemre.services.equivalent.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.umurcanemre.services.equivalent.domain.Page;

@RepositoryRestResource(collectionResourceRel = "pages", path = "pages")
public interface PageRepository extends PagingAndSortingRepository<Page, Long> {
	Page findOneById(Long id);
}
