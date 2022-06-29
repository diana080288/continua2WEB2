package com.idat.edu.service;

import java.util.List;

import com.idat.edu.model.Bodega;

public interface BodegaService {
	
	void guardarBodega(Bodega bodega);
	void actualizarBodega(Bodega bodega);
	void eliminarBodega(Integer id);
	List<Bodega> listarBodega();
	Bodega obtenerBodegaId(Integer id);
}
