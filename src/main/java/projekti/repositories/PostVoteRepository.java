/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import projekti.types.PostVote;

/**
 *
 * @author Toothy
 */
public interface PostVoteRepository extends JpaRepository<PostVote, Long>{
    
}
