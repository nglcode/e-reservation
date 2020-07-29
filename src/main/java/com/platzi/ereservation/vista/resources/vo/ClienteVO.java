/**
 * 
 */
package com.platzi.ereservation.vista.resources.vo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.Data;

/**
 * Clase que representa la tabla Cliente
 * @author agdev
 *
 */
@Data
public class ClienteVO {

	private String idCli;
	private String nombreCli;
	private String apellidoCli;
	private String identificacionCli;
	private String direccionCli;
	private String telefonoCli;
	private String emailCli;
	
	
}
