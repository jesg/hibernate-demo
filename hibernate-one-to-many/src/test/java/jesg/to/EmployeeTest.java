package jesg.to;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;

import javax.inject.Inject;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:META-INF/spring/application-context.xml")
public class EmployeeTest {
	private String firstName = "Markus";
	private String lastName = "Persson";
	private Date joinDate = new Date();
	private String cellPhone = "119";
	private Employee employee;
	private Department department;
	
	@Inject
	private SessionFactory sessionFactory;

	@Before
	public void setUp(){
		department = new Department();
		department.setDepartmentName("Sales");
		employee = new Employee(firstName, lastName, joinDate, cellPhone);
		
	}
	
	@Test
	public void canCreateAndFindEmployee() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(department);
		
		employee.setDepartment(department);
		
		Long id = (Long) session.save(employee);
		
		employee = (Employee) session.get(Employee.class, id);
		System.out.println(employee);
		
		session.getTransaction().commit();
		
	}

}
