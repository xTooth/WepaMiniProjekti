/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti.types;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;
import projekti.types.Person;

/**
 *
 * @author Toothy
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FriendRequest extends AbstractPersistable<Long>{
    
    @OneToOne
    private Person recipient;
    
    @OneToOne
    private Person sender;
    
    private int status;
    
    private LocalDateTime time;
    /*
    *status* 
    0 - request sent 
    1 - friend
    2 - rejected
    */
    
}
