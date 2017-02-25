package be.fablabkleinbrabant.app.fabman.domain.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

@Entity(name="membershipPeriod")
@Data
@Table(name = "T_MEMBERSHIP_PERIOD")
public class MembershipPeriod implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(columnDefinition = "VARCHAR(36)")
	@Id
    private String id;
	
	@ManyToOne
    @JoinColumn
	private Membership membership;

	@Column
	private TypeMembershipEnum typeMembership;
	
	@Column(unique = true)
	private String Code;
	
	@Column(length = 8)
	private String Description;
	
	@Column
	private BigDecimal PaymentAmount;
	
	@Column
	private TypePaymentEnum PaymentType;
	
	@Column
	private String PaymentReference;
	
	@Column
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")  	
	private DateTime fromDate;
	
	@Column
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")  
	private DateTime untilDate;
		
	@Column
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")  	
	private DateTime createDate;
	
	@Column
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")  
	private DateTime updateDate;
}