/**
 * 
 */
package com.platzi.ereservation.negocio.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.platzi.ereservation.model.Cliente;
import com.platzi.ereservation.negocio.repository.ClienteRepository;

/**
 * Clase para definir los servicios de cliente
 * 
 * @author agdev
 *
 */
@Service
@Transactional(readOnly = true)
public class ClienteService {

	private final ClienteRepository clienteRepository;

	public ClienteService(ClienteRepository clienteRepository) {
		// TODO Auto-generated constructor stub
		this.clienteRepository = clienteRepository;
	}

	/**
	 * Metodo para realizar la operacion de guardar un cliente
	 * 
	 * @param cliente
	 * @return
	 */
	@Transactional
	public Cliente create(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	/**
	 * Metodo para realizar la operacion de actualizar un cliente
	 * 
	 * @param cliente
	 * @return
	 */
	@Transactional
	public Cliente update(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	/**
	 * Metodo para realizar la operacion de eliminar un cliente
	 * 
	 * @param cliente
	 */
	@Transactional
	public void delete(Cliente cliente) {
		this.clienteRepository.delete(cliente);
	}

	/**
	 * Metodo para consultar un cliente por su identificacion
	 * 
	 * @param identificacionCli
	 * @return
	 */
	public Cliente findByIdentificacionCli(String identificacionCli) {
		return this.clienteRepository.findByIdentificacionCli(identificacionCli);
	}

	public List<Cliente> findAll() {

		return this.clienteRepository.findAll();
	}

}
