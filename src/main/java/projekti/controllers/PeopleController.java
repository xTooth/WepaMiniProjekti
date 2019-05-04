/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti.controllers;

import java.time.LocalDateTime;
import projekti.services.FriendRequestService;
import projekti.services.PersonService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import projekti.types.FriendRequest;
import projekti.types.Person;

/**
 *
 * @author Toothy
 */
@Controller
public class PeopleController {

    @Autowired
    PersonService service;
    
    @Autowired
    FriendRequestService fservice;
    
    @GetMapping("/people")
    public String getAllNonFriends(Authentication auth, Model model) {
        Person person = service.findByUserName(auth.getName());
        List<Person> people = service.getAll().stream().filter((p) -> (!person.getFriends().contains(p) && !person.getFriendsRequests().contains(p) && !p.getFriendsRequests().contains(person) && !person.getBlocked().contains(p))).collect(Collectors.toList());
        
  
        model.addAttribute("people", people);
        model.addAttribute("person", person);
        //work in progress
        return "people";
    }
    
    @PostMapping("/people")
    public String sendFriendRequest(Authentication auth,@RequestParam String username){
        Person sender = service.findByUserName(auth.getName());
        Person reciever = service.findByUserName(username);
        FriendRequest f = new FriendRequest(reciever,sender, 0, LocalDateTime.now());
        fservice.save(f);
        return "redirect:/people";
    }
    

}
