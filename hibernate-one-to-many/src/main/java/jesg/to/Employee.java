package jesg.to;

import java.util.Date;

public class Employee {
	private Long id;
	private String firstName;
	private String lastName;
	private Date joinDate;
	private String cellPhone;
	private Department department;
	
	public Employee(){}

	public Employee(String firstName, String lastName, Date joinDate,
			String cellPhone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.joinDate = joinDate;
		this.cellPhone = cellPhone;
	}

	public Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", joinDate=" + joinDate
				+ ", cellPhone=" + cellPhone + ", department=" + department
				+ "]";
	}
	
}
