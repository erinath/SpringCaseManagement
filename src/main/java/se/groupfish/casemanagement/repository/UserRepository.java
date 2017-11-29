package se.groupfish.casemanagement.repository;

import java.util.Collection;

import org.springframework.data.repository.PagingAndSortingRepository;

import se.groupfish.casemanagement.model.User;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {

	public User findByFirstName(String firstName);

	public User findUserById(long id);
	
	Collection<User> findByWorkItemsId(Long id);
	
}
