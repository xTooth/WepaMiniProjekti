/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti.controllers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import projekti.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import projekti.services.ImageService;
import projekti.services.PostService;
import projekti.types.FileObject;
import projekti.types.Person;
import projekti.types.Post;

/**
 *
 * @author Toothy
 */
@Controller
public class ImageController {

    @Autowired
    private PersonService personService;

    @Autowired
    private PostService postService;

    @Autowired
    private ImageService imageService;

    @GetMapping("/images")
    public String images(Model model, Authentication auth) {
        Person person = personService.findByUserName(auth.getName());
        List<Post> posts = person.getPosts();
        List<Post> images = new ArrayList<>();
        posts.stream().filter((post) -> (post.getImage() != null)).forEachOrdered((post) -> {
            images.add(post);
        });
        model.addAttribute("images", images);
        model.addAttribute("nrOfimages", images.size());
        model.addAttribute("person", person);
        return "images";
    }

    @GetMapping(path = "/images/{id}/content", produces = "image/gif")
    @ResponseBody
    public byte[] content(@PathVariable Long id) {
        return imageService.findById(id).getImage();
    }

    @PostMapping("/newImage")
    public String newImage(@RequestParam MultipartFile file, @RequestParam String desc, Authentication auth) {
        FileObject fO = new FileObject();
        try {
            fO.setImage(file.getBytes());
            imageService.save(fO);
        } catch (Exception ex) {
            return "redirect:/images";
        }
        
        Person person = personService.findByUserName(auth.getName());
        LocalDateTime time = LocalDateTime.now();
        Post post = new Post(desc, time, 0, new ArrayList<>(), person, fO, new ArrayList<>());
        postService.save(post);
        return "redirect:/images";
    }
    
    @PostMapping("/imageEdit")
    public String edit(@RequestParam String action, @RequestParam Long imageID, Authentication auth){        
        if(action.equals("profilePic")){
            Person p = personService.findByUserName(auth.getName());
            Long id = postService.findById(imageID).getImage().getId();
            p.setProfilepic(imageService.findById(id));
            personService.save(p);
        }else{
            Post post = postService.findById(imageID);
            postService.delete(post);
        }
        return "redirect:/images";
    }
}
