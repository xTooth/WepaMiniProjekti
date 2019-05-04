/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti.repositories;

/**
 *
 * @author Toothy
 */
import org.springframework.data.jpa.repository.JpaRepository;
import projekti.types.Person;

public interface PersonRepository extends JpaRepository<Person,Long>{
    Person findByUsername(String username);
    Person findByUsernameOrCustomURL(String username, String customURL);
    Person findByCustomURL(String customURL);
}
