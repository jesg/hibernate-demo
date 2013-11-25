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
	private String firstName = "Markus";
	private String lastName = "Persson";
	private Person person;
	
	@Inject
	private PersonDAO personDAO;

	@Before
	public void setUp(){
		person = new Person();
		person.setFirstName(firstName);
		person.setLastName(lastName);	
	}
	
	@Test
	public void canCreateAndFindPerson() {
		
		personDAO.create(person);
		person = personDAO.findByName(firstName, lastName);
		assertNotNull(person);
		assertEquals(firstName, person.getFirstName());
		assertEquals(lastName, person.getLastName());
		
		personDAO.delete(person);
		person = personDAO.findByName(firstName, lastName);
		assertNull(person);
	}

}
