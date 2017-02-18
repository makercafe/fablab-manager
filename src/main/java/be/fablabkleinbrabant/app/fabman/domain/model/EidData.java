package be.fablabkleinbrabant.app.fabman.domain.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity(name="eidData")
@Data
@Table(name = "T_EID_DATA")
public class EidData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2682259160792665289L;
	
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(columnDefinition = "VARCHAR(36)")
	@Id
    private String id;
	
	/** Contains the card number of the ID */
	private  String fCardNumber;

	/** Contains the chip number of the ID */
	private  String fChipNumber;

	/** Contains the date from when the ID is valid */
	private  Date fValidFrom;

	/** Contains the date to when the ID is valid */
	private  Date fValidTo;

	/** Contains the municipality where the holder of the ID lives */
	private  String fMunicipality;

	/** Contains the national number */
	private  String fNationalNumber;

	/** Contains the (last) name of the holder of the ID */
	private  String fName;

	/** Contains the 1st firstname of the holder of the ID */
	private  String fFirstname1;

	/** Contains the 3rd firstname of the holder of the ID */
	private  String fFirstname3;

	/** Contains the nationality of the holder of the ID */
	private  String fNationality;

	/** Contains the birth place of the holder of the ID */
	private  String fBirthPlace;

	/** Contains the birth date of the holder of the ID */
	private  Date fBirthDate;

	/** Contains the sex of the holder of the ID */
	private  char fSex;

	/** Contains the noble condition of the holder of the ID, this can be empty */
	private  String fNobleCondition;

	/** Contains the type of document of the ID */
	private  long fDocumentType;

	/** Indicates whether the holder of the ID is white cane */
	private  boolean fIsWhiteCane;

	/** Indicates whether the holder of the ID is yellow cane */
	private  boolean fIsYellowCane;

	/** Indicates whether the holder of the ID is an extended minority */
	private  boolean fIsExtendedMinority;
	
	/** ID photo in base64 coded string, test shows that image is around 3Kb **/	
	private String photo;

}
