/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projekti.repositories.CommentVoteRepository;
import projekti.types.CommentVote;

/**
 *
 * @author Toothy
 */
@Service
public class CommentVoteService implements DBService<CommentVote>{

    @Autowired
    private CommentVoteRepository repo;
    
    @Override
    public CommentVote findById(Long id) {
        return repo.getOne(id);
    }

    @Override
    public List<CommentVote> getAll() {
        return repo.findAll();
    }

    @Override
    public  void save(CommentVote v) {
        repo.save(v);
    }
    
}
