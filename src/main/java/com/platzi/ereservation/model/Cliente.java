/**
 * 
 */
package com.platzi.ereservation.model;

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
@Entity
@Table(name = "cliente")
@NamedQuery(name = "Cliente.findByIdentificacion", query="SELECT c FROM Cliente c where c.idCli = ?1")
public class Cliente {
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String idCli;
	private String nombreCli;
	private String apellidoCli;
	private String identificacionCli;
	private String direccionCli;
	private String telefonoCli;
	private String emailCli;
	//Un cliente puede tener muchas reservas
	@OneToMany(mappedBy = "cliente")
	private Set<Reserva> reservas;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	
}
