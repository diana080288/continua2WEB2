package com.idat.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.edu.model.Productos;

@Repository
public interface ProductoRepository extends JpaRepository<Productos, Integer> {

}
