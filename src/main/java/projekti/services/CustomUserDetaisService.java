/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti.services;

import projekti.repositories.PersonRepository;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import projekti.types.Person;

/**
 *
 * @author Toothy
 */
@Service
public class CustomUserDetaisService implements UserDetailsService {

    @Autowired
    private PersonRepository repo;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Person person = repo.findByUsername(username);
         if(person == null) {
             throw new UsernameNotFoundException("No such user: " + username);
         }
          return new org.springframework.security.core.userdetails.User(
                  person.getUsername(),
                  person.getPassword(),
                  true, 
                  true,
                  true, 
                  true, 
                  Arrays.asList(new SimpleGrantedAuthority("USER")));
    }
    
}
