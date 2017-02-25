package be.fablabkleinbrabant.app.fabman.domain.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import lombok.Data;

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

	@Column
	private String firstName;

	@Column
	private String lastName;

	@Column
	private String companyName;

	@Column
	private String vatNumber;

	@Column
	private Boolean requestInvoice;

	@Column
	private String email;

	@Column
	private String phone;

	@Column
	private String mobilePhone;

	@Column
	private String fax;

	@OneToOne
	private Address address;

	@Column
	private String text;
	
	@Column
	private Boolean subcribedMailingList;
	
	@OneToMany(mappedBy = "member", cascade = { CascadeType.ALL })
	private List<CardData> cardData;	
		
	@Column
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")  	
	private DateTime createDate;

	@Column
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")  
	private DateTime updateDate;

}