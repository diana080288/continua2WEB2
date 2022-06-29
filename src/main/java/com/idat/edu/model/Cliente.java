package com.idat.edu.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Table(name = " cliente")
@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer idCliente;
	private String nombre;
	private String direccion;
	private Integer DNI;
	
	@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(name = "productos_cliente",
	joinColumns = @JoinColumn(
			name = "id_producto",
			nullable = false,
			unique = true,
			foreignKey = @ForeignKey(foreignKeyDefinition = 
			"foreign key(id_producto)references productos(id_producto)")
			),
	inverseJoinColumns =  @JoinColumn(
			name = "id_cliente",
			nullable = false,
			unique = true,
			foreignKey = @ForeignKey(foreignKeyDefinition = 
			"foreign key(id_cliente)references cliente(id_cliente)"))
	)
	
private List<Productos> productos = new ArrayList<>();	
	
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Integer getDNI() {
		return DNI;
	}
	public void setDNI(Integer dNI) {
		DNI = dNI;
	}
		
	
	

}
