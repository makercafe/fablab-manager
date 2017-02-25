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
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	 
    @Column(name = "userName", unique = true)
	private String userName;
	
	@Column
    private String password;
	
	@Column
 	private String email;

	@OneToOne(mappedBy = "user", fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	private SecurityCode securityCode;
	
	@Column
	private boolean accountExpired;
	
	@Column
	private boolean accountLocked;
	
	@Column
	private boolean enabled;

	@OneToOne(mappedBy = "user", cascade = { CascadeType.ALL })
	private Role role;
	
	@Column
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")  	
	private DateTime createDate;
	
	@Column
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")  
	private DateTime updateDate;

}
