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

@Entity(name = "security_code")
@Table(name="T_SECURITY_CODE")
@Data
public class SecurityCode  implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(columnDefinition = "VARCHAR(36)")
	@Id
    private String id;
	
    @OneToOne
    private User user;
    private String code;
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")    
    private DateTime timeRequest;
    private TypeActivationEnum typeActivationEnum;

  
}
