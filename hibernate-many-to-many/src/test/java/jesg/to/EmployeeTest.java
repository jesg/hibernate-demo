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
	
	@Inject
	private SessionFactory sessionFactory;
	private Employee employee_2;
	private Project awseme;
	private Project space_flight;

	@Before
	public void setUp(){
		employee = new Employee(firstName, lastName, joinDate, cellPhone);
		employee_2 = new Employee(firstName, lastName, joinDate, "911");
		awseme = new Project("Awseme");
		space_flight = new Project("Space Flight");
		
	}
	
	@Test
	public void canCreateAndFindEmployee() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		employee.getProjects().add(awseme);
		employee.getProjects().add(space_flight);
		employee_2.getProjects().add(space_flight);
		
		session.save(employee);
		session.save(employee_2);
		
		session.getTransaction().commit();
		
	}

}
