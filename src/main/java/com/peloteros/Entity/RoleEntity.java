package com.peloteros.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="Roles")
public class RoleEntity implements Serializable{
	
	private static final long serialVersionUID=1L;
	
	@Id
    @Column(name="idusuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int RoleID;
	
	@Column(name = "Nombre")
	private String Nombre;

}
