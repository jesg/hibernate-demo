package jesg.to;

import java.util.Set;

public class Department {
	private Long departmentId;
	private String departmentName;
	private Set<Employee> employees;
	
	public Long getDepartmentId() {
		return departmentId;
	}
	private void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName="
				+ departmentName + "]";
	}
	
}
