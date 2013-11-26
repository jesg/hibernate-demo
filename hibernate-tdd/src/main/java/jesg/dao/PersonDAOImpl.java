package jesg.dao;

import javax.inject.Inject;

import jesg.to.Person;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(propagation=Propagation.REQUIRED)
public class PersonDAOImpl implements PersonDAO {
	
	@Inject
	private SessionFactory personSessionFactory;

	public Person findByName(String firstName, String lastName) {
		
		return (Person) personSessionFactory
				.getCurrentSession()
				.getNamedQuery("Person.findByFirstNameAndLastName")
				.setParameter("firstName", firstName)
				.setParameter("lastName", lastName)
				.uniqueResult();
	}

	public Long create(Person person) {
		return (Long) personSessionFactory
				.getCurrentSession()
				.save(person);
	}
	
	public void delete(Person person) {
		personSessionFactory
			.getCurrentSession()
			.delete(person);
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.personSessionFactory = sessionFactory;
	}

}
