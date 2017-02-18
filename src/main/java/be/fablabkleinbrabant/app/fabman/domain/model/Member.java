package be.fablabkleinbrabant.app.fabman.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

@Entity(name="member")
@Data
@Table(name = "T_MEMBER")
public class Member implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(columnDefinition = "VARCHAR(36)")
	@Id
    private String id;
	
	private String firstName;
	private String lastName;
	private String companyName;
	private String vatNumber;
	private Boolean requestInvoice;
	private String email;
	private String phone;
	private String mobilePhone;
	private String fax;
	@OneToOne
	private Address address;
	private String text;
	
	private Boolean subcribedMailingList;
	
	@OneToOne
	private EidData eidData;	
		
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")  	
	private DateTime createDate;
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")  
	private DateTime updateDate;

}