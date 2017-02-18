package be.fablabkleinbrabant.app.fabman.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import lombok.Data;

@Entity(name="eventLog")
@Data
@Table(name = "T_EVENT_LOG")
public class EventLog implements Serializable {/**
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
	
	@OneToOne
	private Member member;
	
	private String type;
	
	private String action;
	
	private String extraInfo;
	
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")  	
	private DateTime logDate;
}
