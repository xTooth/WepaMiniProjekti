/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projekti.types.Person;
import projekti.repositories.PersonRepository;

/**
 *
 * @author Toothy
 */
@Service
public class PersonService implements DBService<Person> {

    @Autowired
    private PersonRepository repo;

    public Person findByUserName(String username) {
        return repo.findByUsername(username);
    }

    public Person findByUsernameOrURL(String username, String CustomURL) {
        return repo.findByUsernameOrCustomURL(username, CustomURL);
    }

    public Person findByCustomURL(String CustomURL) {
        return repo.findByCustomURL(CustomURL);
    }

    @Override
    public Person findById(Long id) {
        return repo.getOne(id);
    }

    @Override
    public List<Person> getAll() {
        return repo.findAll();
    }

    public void save(Person person) {
        repo.save(person);
    }

}
