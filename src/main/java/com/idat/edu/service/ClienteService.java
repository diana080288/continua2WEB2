package com.idat.edu.service;

import java.util.List;

import com.idat.edu.model.Cliente;

public interface ClienteService {
	
	void guardarCliente(Cliente cliente);
	void actualizarCliente(Cliente cliente);
	void eliminarCliente(Integer id);
	List<Cliente> listarCliente();
	 Cliente obtenerClienteId(Integer id);

}
