/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projekti.repositories.PostRepository;
import projekti.types.Post;

/**
 *
 * @author Toothy
 */
@Service
public class PostService implements DBService<Post> {

    @Autowired
    private PostRepository repo;

    @Override
    public Post findById(Long id) {
        return repo.getOne(id);
    }

    @Override
    public List<Post> getAll() {
        return repo.findAll();
    }

    public void save(Post post) {
        repo.save(post);
    }

    public void delete(Post post) {
        repo.delete(post);
    }

}
