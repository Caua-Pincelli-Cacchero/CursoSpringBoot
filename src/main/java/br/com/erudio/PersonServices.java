package br.com.erudio;

import br.com.erudio.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();

    private Logger logger = Logger.getLogger(PersonServices.class.getName());

   public List<Person> findAll() {
        List<Person> persons = new ArrayList<Person>();
        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }


    public Person findById(String id) {
        logger.info("Finding one Person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirsName("Cauã");
        person.setLastName("Cacchero");
        person.setAddress("São Paulo - SP");
        person.setGender("Male");
        return person;

    }

    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirsName("First Name " + i);
        person.setLastName("Last Name " + i);
        person.setAddress("Some Adress in Brazil");
        person.setGender("Male");
        return person;
    }
}
