/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti.types;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PostLoad;
import javax.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 *
 * @author Toothy
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Comment extends AbstractPersistable<Long> {

    private String text;

    private LocalDateTime time;
    
    @Transient
    private int likes = 0;

    @PostLoad
    private void likes() {
        likes = likers.size();
    }
    
    @OneToOne
    private Person poster;

    @ManyToMany
    @JoinTable(name = "CommentVote",
            joinColumns
            = @JoinColumn(name = "COMMENT_ID", referencedColumnName = "ID"),
            inverseJoinColumns
            = @JoinColumn(name = "PERSON_ID", referencedColumnName = "ID")
    )
    private List<Person> likers;
    
    @ManyToOne
    @JoinColumn(name = "POST_ID")           
    private Post post;

}
