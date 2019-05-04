/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti.controllers;

import java.time.LocalDateTime;
import projekti.services.FriendRequestService;
import projekti.services.PersonService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
public class FriendsController {

    @Autowired
    private PersonService service;

    @Autowired
    private FriendRequestService fservice;

    @GetMapping("/friends")
    public String friends(Model model, Authentication auth) {
        Person person = service.findByUserName(auth.getName());

        List<Person> friends = person.getFriends();
        List<Person> requesters = new ArrayList<>();
        List<FriendRequest> friendRequests = fservice.getAll();
        HashMap<Person, LocalDateTime> times = new HashMap<>();
        
            for (FriendRequest r : friendRequests) {
                if (r.getRecipient().getUsername().equals(person.getUsername()) && r.getStatus()== 0) {
                    requesters.add(r.getSender());
                    times.put(r.getSender(), r.getTime());
                }
            }
        
        model.addAttribute("times", times);
        model.addAttribute("person", person);
        model.addAttribute("friends", friends);
        model.addAttribute("friendrequests", requesters);
        return "friends";
    }

    @PostMapping("/friends")
    public String add(Authentication auth, @RequestParam String sender, @RequestParam String action) {
        Person p = service.findByUserName(auth.getName());
        Person s = service.findByUserName(sender);
        FriendRequest r = fservice.findBySenderAndRecipient(p, s);
//        if(r == null){           
//            r = fservice.findBySenderAndRecipient(p, s);
//            if(r== null){             
//            }
//        }
        if (action.equals("add")) {
            FriendRequest newf = new FriendRequest(s,p,1,LocalDateTime.now());
            r.setStatus(1);
            fservice.save(r);
            fservice.save(newf);
        } else if (action.equals("ignore")) {
            fservice.delete(r);            
        }else{
            r.setStatus(2);
            FriendRequest newf = new FriendRequest(s,p,2, LocalDateTime.now());
            fservice.save(r);
            fservice.save(newf);
        }
        return "redirect:/friends";
    }
    
    
    @PostMapping("/ctrl")
    public String removeOrBlock(Authentication auth, @RequestParam String friend, @RequestParam String action){
        Person person = service.findByUserName(auth.getName());
        Person exfriend = service.findByUserName(friend);
        FriendRequest r1 = fservice.findBySenderAndRecipient(person, exfriend);
        FriendRequest r2 = fservice.findBySenderAndRecipient(exfriend, person);
        
        if(action.equals("block")){
            r1.setStatus(2);
            r2.setStatus(2);
            fservice.save(r2);
            fservice.save(r1);
        }else{
            fservice.delete(r2);
            fservice.delete(r1);
        }
        return "redirect:/friends";
    }
}
