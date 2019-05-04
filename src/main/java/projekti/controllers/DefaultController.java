package projekti.controllers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import projekti.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import projekti.services.CommentService;
import projekti.services.CommentVoteService;
import projekti.services.PostService;
import projekti.services.PostVoteService;
import projekti.types.Comment;
import projekti.types.CommentVote;
import projekti.types.Person;
import projekti.types.Post;
import projekti.types.PostVote;

@Controller
public class DefaultController {

    @Autowired
    private PersonService personService;
    
    @Autowired
    private PostService postService;
    
    @Autowired
    private PostVoteService pVoteService;
    
    @Autowired
    private CommentService commentService;
    
    @Autowired
    private CommentVoteService cVoteService;
    
    @GetMapping("/")
    public String feed(Model model, Authentication auth) {
        Person person = personService.findByUserName(auth.getName());
        model.addAttribute("person", person);      
        List<Post> posts = person.getPosts();
        
        person.getFriends().forEach((p) -> {
            posts.addAll(p.getPosts());
        });
        
        posts.sort((Object t1, Object t) -> {
            Post two = (Post) t1;
            Post one = (Post) t;
            return  one.getTime().compareTo(two.getTime());
        });
        
        List<Post> needed = posts.subList(0, Math.min(posts.size(), 25));      
        model.addAttribute("posts", needed);
        
        return "index";
    }

    @PostMapping("/newpost")
    public String createNewPost(@RequestParam String content, Authentication auth) {
        LocalDateTime time = LocalDateTime.now();
        Person person = personService.findByUserName(auth.getName());
        Post post = new Post(content, time,0, new ArrayList<>(), person,null,new ArrayList<>());
        postService.save(post);
        return "redirect:/";
    }
    
    @PostMapping(value={"*/comment","/comment"})
    public String createCommentToPost(@RequestParam Long PostID, Authentication auth, @RequestParam String content){
        Post post = postService.findById(PostID);
        LocalDateTime time = LocalDateTime.now();
        Person person = personService.findByUserName(auth.getName());
        Comment comment = new Comment(content, time,0, person, new ArrayList<>(),post);
        commentService.save(comment);
        post.getComments().add(comment);
        postService.save(post);
        return "redirect:/";
    }
    
    @PostMapping(value={"*/likePost","/likePost"})
    public String likePost(@RequestParam Long PostID, Authentication auth){
        Post post = postService.findById(PostID);
        Person person = personService.findByUserName(auth.getName());
        PostVote vote = new PostVote(person, post);
        pVoteService.save(vote);
        return "redirect:/";
    }
    
    @PostMapping(value={"*/likeComment","/likeComment"})
    public String likeComment(@RequestParam Long CommentID, Authentication auth){
        Comment comment = commentService.findById(CommentID);
        Person person = personService.findByUserName(auth.getName());
        CommentVote vote = new CommentVote(person, comment);
        cVoteService.save(vote);
        return "redirect:/";
    }
}
