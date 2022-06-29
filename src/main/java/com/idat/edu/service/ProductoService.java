package com.idat.edu.service;

import java.util.List;

import com.idat.edu.model.Productos;

public interface ProductoService {

	void guardarProductos(Productos productos);
	void actualizarProductos(Productos productos);
	void eliminarProductos(Integer id);
	List<Productos> listarProductos();
	 Productos obtenerProductosId(Integer id);

	
}
