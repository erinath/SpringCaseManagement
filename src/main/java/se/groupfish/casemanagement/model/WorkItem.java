package se.groupfish.casemanagement.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "workItem")
public class WorkItem {

	@Id
	@GeneratedValue
	private Long id;

	private String description;

	@ManyToOne
	private User user;

	@OneToOne(cascade = CascadeType.REMOVE)
	private Issue issue;

	private Status status;

	public enum Status {
		UNSTARTED, STARTED, DONE
	}

	protected WorkItem() {
	}

	public WorkItem(String description, Status status) {
		this.user = null;
		this.issue = null;
		this.description = description;
		this.status = status;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof WorkItem) {
			WorkItem otherWorkItem = (WorkItem) obj;
			return description.equals(otherWorkItem.description) && status.equals(otherWorkItem.status);
		}
		return false;
	}

	@Override
	public int hashCode() {
		int result = 17;
		result += 31 * description.hashCode();
		return result;
	}

	public User getUser() {
		return user;
	}

	public Issue getIssue() {
		return issue;
	}

	public String getDescription() {
		return description;
	}

	public Status getStatus() {
		return status;
	}

	public WorkItem setDescription(String description) {
		this.description = description;
		return this;
	}

	public WorkItem setUser(User user) {
		this.user = user;
		return this;
	}

	public WorkItem setIssue(Issue issue) {
		this.issue = issue;
		return this;
	}

	public WorkItem setStatus(Status status) {
		this.status = status;
		return this;
	}

}
