package se.groupfish.casemanagement;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import se.groupfish.casemanagement.model.User;
import se.groupfish.casemanagement.model.WorkItem;
import se.groupfish.casemanagement.service.IssueService;
import se.groupfish.casemanagement.service.ServiceException;
import se.groupfish.casemanagement.service.TeamService;
import se.groupfish.casemanagement.service.UserService;
import se.groupfish.casemanagement.service.WorkItemService;

@SpringBootApplication
public class SpringCaseManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCaseManagementApplication.class, args);
	}
		
				@Bean
				public CommandLineRunner run(ApplicationContext context){
					return args -> {
						UserService userService = context.getBean(UserService.class);
						TeamService teamService = context.getBean(TeamService.class);
						WorkItemService workItemService = context.getBean(WorkItemService.class);
						IssueService issueService = context.getBean(IssueService.class);
						

							userService.addUser(new User("Bald Eagle").setActive(true).setFirstName("Emil").setLastName("Lordman"));
					};		
		
	}
}
