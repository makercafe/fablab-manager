package be.fablabkleinbrabant.app.fabman.domain.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import lombok.Data;

@Entity(name="cardData")
@Data
@Table(name = "T_CARD_DATA")
public class CardData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2682259160792665289L;
	
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(columnDefinition = "VARCHAR(36)")
	@Id
    private String id;
	
	
	@ManyToOne
    @JoinColumn
	private Member member;

	
	/** Only 1 active card can be attached to a member **/
	@Column
	private Boolean active;
	
	/** Type of card **/
	@Column
	private TypeCardEnum cardType;
	
	/** Contains the card number of the ID */
	@Column
	private  String fCardNumber;

	/** Contains the chip number of the ID */
	@Column
	private  String fChipNumber;

	/** Contains the date from when the ID is valid */
	@Column
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private  DateTime fValidFrom;

	/** Contains the date to when the ID is valid */
	@Column
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private  DateTime fValidTo;

	/** Contains the municipality where the holder of the ID lives */
	@Column
	private  String fMunicipality;

	/** Contains the national number */
	@Column
	private  String fNationalNumber;

	/** Contains the (last) name of the holder of the ID */
	@Column
	private  String fName;

	/** Contains the 1st firstname of the holder of the ID */
	@Column
	private  String fFirstname1;

	/** Contains the 3rd firstname of the holder of the ID */
	@Column
	private  String fFirstname3;

	/** Contains the nationality of the holder of the ID */
	@Column
	private  String fNationality;

	/** Contains the birth place of the holder of the ID */
	@Column
	private  String fBirthPlace;

	/** Contains the birth date of the holder of the ID */
	@Column
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private  DateTime fBirthDate;

	/** Contains the sex of the holder of the ID */
	@Column
	private  char fSex;

	/** Contains the noble condition of the holder of the ID, this can be empty */
	@Column
	private  String fNobleCondition;

	/** Contains the type of document of the ID */
	@Column
	private  long fDocumentType;

	/** Indicates whether the holder of the ID is white cane */
	@Column
	private  boolean fIsWhiteCane;

	/** Indicates whether the holder of the ID is yellow cane */
	@Column
	private  boolean fIsYellowCane;

	/** Indicates whether the holder of the ID is an extended minority */
	@Column
	private  boolean fIsExtendedMinority;
	
	/** ID photo in base64 coded string, test shows that image is around 3Kb **/	
	@Column
	private String photo;

}
