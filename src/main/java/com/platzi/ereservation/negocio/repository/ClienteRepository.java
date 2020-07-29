/**
 * 
 */
package com.platzi.ereservation.negocio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.platzi.ereservation.model.Cliente;

/**
 * Interface para definir las operaciones de bdd relacionadas con cliente
 * @author agdev
 *
 */
public interface ClienteRepository extends JpaRepository<Cliente, String> {

	/**
	 * Definición de método para buscar los clientes por su apellido
	 * @param apellidoCli
	 * @return
	 */
	public List<Cliente> findByApellidoCli(String apellidoCli);
	
	public Cliente findByIdentificacionCli(String identificacionCli);
	
	
}
