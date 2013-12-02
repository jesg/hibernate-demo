package jesg.to;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Employee extends Person {
	private Date joinDate;
	private String cellPhone;
	
	public Employee(){}

	public Employee(String firstName, String lastName, Date joinDate,
			String cellPhone) {
		super(firstName, lastName);
		this.joinDate = joinDate;
		this.cellPhone = cellPhone;
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



	@Override
	public String toString() {
		return "Employee [joinDate=" + joinDate + ", cellPhone=" + cellPhone
				+ "]";
	}
	
}
