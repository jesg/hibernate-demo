package jesg.to;

import java.util.HashSet;
import java.util.Set;

public class Project {
	private Long projectId;
	private String codeName;
	private Set<Employee> employees = new HashSet<Employee>();
	
	public Project(String codeName) {
		super();
		this.codeName = codeName;
	}
	public Long getProjectId() {
		return projectId;
	}
	private void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
	public String getCodeName() {
		return codeName;
	}
	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codeName == null) ? 0 : codeName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		if (codeName == null) {
			if (other.codeName != null)
				return false;
		} else if (!codeName.equals(other.codeName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", codeName=" + codeName
				+ "]";
	}
	
}
