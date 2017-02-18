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

@Entity(name = "role")
@Table(name="T_ROLES")
@Data
public class Role implements Serializable  {
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
    private Integer role;

 
}
