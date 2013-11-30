package jesg.to;

public class EmployeeBenefit {
	private Long id;
	private Long money;
	private Employee employee;
	
	public EmployeeBenefit(){}

	public EmployeeBenefit(Long money) {
		super();
		this.money = money;
	}

	public Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
	}

	public Long getMoney() {
		return money;
	}

	public void setMoney(Long money) {
		this.money = money;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "EmployeeBenefit [id=" + id + ", money=" + money + "]";
	}
	
	
}
