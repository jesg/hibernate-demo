package jesg.dao;

import static org.junit.Assert.*;

import javax.inject.Inject;

import jesg.to.Person;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:META-INF/spring/application-context.xml")
@TransactionConfiguration
public class PersonDAOTest {
	
	@Inject
	private PersonDAO personDAO;

	@Test
	public void canCreateAndFindPerson() {
		Person person = new Person();
		person.setFirstName("Markus");
		person.setLastName("Persson");
		
		personDAO.create(person);
		person = personDAO.findByName("Markus", "Persson");
		System.out.println(person);
	}

}
