package be.fablabkleinbrabant.app.fabman.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

@Entity(name = "address")
@Table(name="T_ADDRESS")
@Data
public class Address implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(columnDefinition = "VARCHAR(36)")
	@Id
    private String id;
	
	@Column(nullable=false,columnDefinition = "VARCHAR(128)")
	private String adress1;
	@Column(columnDefinition = "VARCHAR(128)")	
	private String adress2;
	@Column(nullable=false,columnDefinition = "VARCHAR(12)")
	private String postcode;
	@Column(nullable=false,columnDefinition = "VARCHAR(64)")
	private String city;
	@Column(nullable=true,columnDefinition = "VARCHAR(32)")
	private String country;
	@Column(nullable=true,columnDefinition = "VARCHAR(32)")
	private String phone;
	@Column(nullable=true,columnDefinition = "VARCHAR(32)")
	private String mobilePhone;
	@Column(nullable=true,columnDefinition = "VARCHAR(32)")
	private String vatNumber;
	private Boolean deleted;
	private Boolean activated;
	@Column(nullable=false)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")    
	private DateTime createDate;
	@Column(nullable=false)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")    
	private DateTime updateDate;

 
}
