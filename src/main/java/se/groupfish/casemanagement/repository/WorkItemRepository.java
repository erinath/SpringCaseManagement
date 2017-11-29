package se.groupfish.casemanagement.repository;

import java.util.Collection;

import org.springframework.data.repository.PagingAndSortingRepository;

import se.groupfish.casemanagement.model.WorkItem;

public interface WorkItemRepository extends PagingAndSortingRepository<WorkItem, Long> {

	WorkItem findById(Long id);
	
	Collection<WorkItem> findByState(String state);

	Collection<WorkItem> findByUserId(Long id);

	
	
}
