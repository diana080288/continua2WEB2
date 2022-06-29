package com.idat.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.edu.model.Productos;
import com.idat.edu.service.ProductoService;

@Controller
@RequestMapping(path = "/cliente/v1")

public class ProductoController {

@Autowired
private ProductoService service;
	
	
	@RequestMapping("/listar")
	public @ResponseBody ResponseEntity<List<Productos>> listar(){
		
		return new ResponseEntity<List<Productos>>(service.listarProductos(),HttpStatus.OK);
	}

}
