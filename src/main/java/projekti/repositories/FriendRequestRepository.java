/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import projekti.types.FriendRequest;
import projekti.types.Person;

/**
 *
 * @author Toothy
 */
public interface FriendRequestRepository extends JpaRepository<FriendRequest, Long>{

    public FriendRequest findBySenderAndRecipient(Person recipient, Person sender);
    
}
