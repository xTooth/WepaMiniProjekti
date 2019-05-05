package projekti;

import javax.transaction.Transactional;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import projekti.services.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional
public class ProjektiTest {

    //projekti testaa typet käyttäen generoituja testejä, ja service:t testataan geneerisellä testillä.
    @Autowired
    private CommentService commentService;

    @Autowired
    private CommentVoteService commentVoteService;

    @Autowired
    private FriendRequestService friendRequestService;

    @Autowired
    private ImageService imageService;

    @Autowired
    private PersonService personService;

    @Autowired
    private PostService postService;

    @Autowired
    private PostVoteService postVoteService;

    @Test
    public void testCS() {
        testService(commentService, (long) 46);
    }

    @Test
    public void testCVS() {
        testService(commentVoteService, (long) 47);
    }

    @Test
    public void testFRS() {
        testService(friendRequestService, (long) 44);
    }

    @Test
    public void testIS() {
        testService(imageService, (long) 2);
    }

    @Test
    public void testPeS() {
        testService(personService, (long) 1);
    }

    @Test
    public void testPoS() {
        testService(postService, (long) 39);
    }

    @Test
    public void testPoVS() {
        testService(postVoteService, (long) 136);
    }

    public void testService(DBService service, Long existingID) {
        Object t = service.findById(existingID);
        service.save(t);
        assertTrue(service.getAll().size() > 0);
        assertTrue(service.findById(existingID) != null);
    }

}
