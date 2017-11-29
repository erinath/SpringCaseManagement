package se.groupfish.casemanagement.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import se.groupfish.casemanagement.model.Team;

public interface TeamRepository  extends PagingAndSortingRepository<Team, Long> {

}
