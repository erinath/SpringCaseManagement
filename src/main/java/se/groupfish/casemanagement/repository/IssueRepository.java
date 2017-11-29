package se.groupfish.casemanagement.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import se.groupfish.casemanagement.model.Issue;

public interface IssueRepository  extends PagingAndSortingRepository<Issue, Long> {

}
