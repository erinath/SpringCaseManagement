package se.groupfish.casemanagement.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import se.groupfish.casemanagement.model.User;
import se.groupfish.casemanagement.repository.UserRepository;
import se.groupfish.casemanagement.repository.WorkItemRepository;

@Component
public class UserService {

	private final UserRepository userRepository;
	private final WorkItemRepository workItemRepository;

	@Autowired
	public UserService(UserRepository userRepository, WorkItemRepository workItemRepository) {
		this.userRepository = userRepository;
		this.workItemRepository = workItemRepository;
	}

	@Transactional
	public User addUser(User user) throws ServiceException {

		if (user.getUsername().length() <= 10) {
			throw new ServiceException("Username must be 10 letter minimum !!!  " + user.getUsername());
		}
		return userRepository.save(user);

	}

	// @Transactional
	// public void updateUser(String firstName, String lastName, String
	// userName, long id) throws ServiceException {
	//
	// if (userName.length() <= 10) {
	// throw new ServiceException("Username must be 10 letter minimum !!! " +
	// userName);
	// }
	// userRepository.findOne(id);
	// userRepository.updateUser(firstName, lastName, userName, id);
	//
	// }
	//
	// @Modifying
	// @Transactional
	// public void disableUser(long id) throws ServiceException {
	//
	// for (String temp : userRepository.getUsersState(id)) {
	// if (temp.equals("Inactive")) {
	// throw new ServiceException("User is inactive... it's not going to
	// disable...");
	// } else {
	// workItemRepository.disableWorkItem(userRepository.findUserById(id).getWorkItems().iterator().next().getId());
	// userRepository.disableUser(id);
	// }
	// }
	//
	// }
	//
	// @Transactional
	// public User findByFirstName(String firstName) {
	// return userRepository.findByFirstName(firstName);
	// }
}