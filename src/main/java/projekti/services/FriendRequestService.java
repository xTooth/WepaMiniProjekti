/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projekti.types.FriendRequest;
import projekti.repositories.FriendRequestRepository;
import projekti.types.Person;

/**
 *
 * @author Toothy
 */
@Service
public class FriendRequestService implements DBService<FriendRequest> {

    @Autowired
    private FriendRequestRepository repo;

    @Override
    public FriendRequest findById(Long id) {
        return repo.getOne(id);
    }

    @Override
    public List<FriendRequest> getAll() {
        return repo.findAll();
    }

    public void save(FriendRequest request) {
        repo.save(request);
    }

    public FriendRequest findBySenderAndRecipient(Person sender, Person recipient) {
        return repo.findBySenderAndRecipient(recipient, sender);
    }
    
    public void delete(FriendRequest request){
        repo.delete(request);
    }
}
