/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projekti.repositories.PostVoteRepository;
import projekti.types.PostVote;

/**
 *
 * @author Toothy
 */
@Service
public class PostVoteService implements DBService<PostVote>{

    @Autowired
    private PostVoteRepository repo;
    
    @Override
    public PostVote findById(Long id) {
        return repo.getOne(id);
    }

    @Override
    public List<PostVote> getAll() {
        return repo.findAll();
    }

    public void save(PostVote vote) {
        repo.save(vote);
    }
    
    
}
