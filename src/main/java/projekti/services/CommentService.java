
package projekti.services;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projekti.repositories.CommentRepository;
import projekti.types.Comment;




@Service
public class CommentService implements DBService<Comment>{
    
    @Autowired
    private CommentRepository repo;

    @Override
    public Comment findById(Long id) {
        return repo.getOne(id);
    }

    @Override
    public List<Comment> getAll() {
        return repo.findAll();
    }

    @Override
    public void save(Comment comment) {
        repo.save(comment);
    }
  
}
