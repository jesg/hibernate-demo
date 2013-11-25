package jesg.dao;

import jesg.to.Person;

public interface PersonDAO {
	Person findByName(String firstName, String lastName);
	Long create(Person person);
	void delete(Person person);
}
