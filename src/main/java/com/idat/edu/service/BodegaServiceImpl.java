package com.idat.edu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.idat.edu.model.Bodega;
import com.idat.edu.repository.BodegaRepository;

@Service
public class BodegaServiceImpl implements BodegaService {

	private BodegaRepository repository;
	
	@Override
	public void guardarBodega(Bodega bodega) {
		// TODO Auto-generated method stub
		repository.save(bodega);
	}

	@Override
	public void actualizarBodega(Bodega bodega) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(bodega);
	}

	@Override
	public void eliminarBodega(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<Bodega> listarBodega() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Bodega obtenerBodegaId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
