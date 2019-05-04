/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti.controllers;

import projekti.services.PersonService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import projekti.services.PostService;
import projekti.types.Person;
import projekti.types.Post;

/**
 *
 * @author Toothy
 */
@Controller
public class PersonController {

    @Autowired
    private PersonService service;

    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private PostService postService;

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String newAccount(@RequestParam String name,
            @RequestParam String password,
            @RequestParam String username,
            @RequestParam String customURL) {
        if (service.findByUsernameOrURL(username, customURL) != null) {
            return "redirect:/register";
        }
        service.save(new Person(name,
                username,
                encoder.encode(password),
                customURL,
                null,    // profilePicture  <- has to be added later on.
                new ArrayList<>(), //friends
                new ArrayList<>(), //friendRequests
                new ArrayList<>(), //blockedUsers
                new ArrayList<>())); //posts
        return "login";
    }

    @GetMapping("/person/{customURL}")
    public String personsPage(Authentication auth, @PathVariable String customURL, Model model) {

        Person visitedPage = service.findByCustomURL(customURL);
        Person person = service.findByUserName(auth.getName());
        model.addAttribute("person", person);
        List<Post> posts = visitedPage.getPosts();
        model.addAttribute("visitedPage", visitedPage);
        model.addAttribute("posts", posts);
        return "person";
    }


}
