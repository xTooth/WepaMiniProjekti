/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti.types;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.WhereJoinTable;
import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 *
 * @author Toothy
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person extends AbstractPersistable<Long> {

    private String name;
    private String username;
    private String password;
    private String customURL;
    
    @OneToOne
    @JoinColumn(name = "PROFILEPIC_ID")
    private FileObject profilepic;

    @ManyToMany
    @WhereJoinTable(clause = "status = '1'")
    @JoinTable(name = "FriendRequest",
            joinColumns
            = @JoinColumn(name = "SENDER_ID", referencedColumnName = "ID"),
            inverseJoinColumns
            = @JoinColumn(name = "RECIPIENT_ID", referencedColumnName = "ID")
    )

    private List<Person> friends;

    @ManyToMany
    @WhereJoinTable(clause = "status = '0'")
    @JoinTable(name = "FriendRequest",
            joinColumns
            = @JoinColumn(name = "SENDER_ID", referencedColumnName = "ID"),
            inverseJoinColumns
            = @JoinColumn(name = "RECIPIENT_ID", referencedColumnName = "ID")
    )

    private List<Person> friendsRequests;

    @ManyToMany
    @WhereJoinTable(clause = "status = '2'")
    @JoinTable(name = "FriendRequest",
            joinColumns
            = @JoinColumn(name = "SENDER_ID", referencedColumnName = "ID"),
            inverseJoinColumns
            = @JoinColumn(name = "RECIPIENT_ID", referencedColumnName = "ID")
    )

    private List<Person> blocked;

    @OneToMany(mappedBy = "poster")
    @OrderBy("TIME Desc")
    private List<Post> posts;
}
