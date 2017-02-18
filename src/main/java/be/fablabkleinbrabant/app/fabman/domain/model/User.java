package be.fablabkleinbrabant.app.fabman.domain.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

@Entity(name="user")
@Table(name = "T_USERS")
@Data
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(columnDefinition = "VARCHAR(36)")
	@Id
    private String id;
	
	private String firstName;
	private String lastName;
	
 
    @Column(name = "userName", unique = true)
	private String userName;
    private String password;
 	private String email;

	@OneToOne(mappedBy = "user", fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	private SecurityCode securityCode;
	private boolean accountExpired;
	private boolean accountLocked;
	private boolean enabled;

	@OneToOne(mappedBy = "user", cascade = { CascadeType.ALL })
	private Role role;
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")  	
	private DateTime createDate;
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")  
	private DateTime updateDate;

}
