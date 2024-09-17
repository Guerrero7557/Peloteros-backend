package com.peloteros.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



@Table(name = "Usuarios")
@Entity(name="UserEntity")
public class UserEntity  implements Serializable{
	
	private static final long serialVersionUID=1L;
	
	@Id
    @Column(name="UsuarioID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long UsuarioID; 
	
	
	@Column(name="Nombre")
	private String Nombre;
	
	@Column(name="Correo")
	private String Correo;
	
	@Column(name="Telefono")
	private String Telefono;
	
	@Column(name="PasswordHash")
	private String PasswordHash;
	
	@ManyToOne
    @JoinColumn(name="RoleID",nullable= false )
	private RoleEntity RoleID;
	
	
	public UserEntity() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Long getUsuarioID() {
		return UsuarioID;
	}


	public void setUsuarioID(Long usuarioID) {
		UsuarioID = usuarioID;
	}


	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getPasswordHash() {
		return PasswordHash;
	}
	public void setPasswordHash(String passwordHash) {
		PasswordHash = passwordHash;
	}	
	// constructor of the class
	
	public RoleEntity getRoleID() {
		return RoleID;
	}

	public void setRoleID(RoleEntity roleID) {
		RoleID = roleID;
	}

	public UserEntity(Long usuarioID, String nombre, String correo, String telefono, String passwordHash, RoleEntity roleID) {
		super();
		UsuarioID = usuarioID;
		Nombre = nombre;
		Correo = correo;
		Telefono = telefono;
		PasswordHash = passwordHash;
		RoleID = roleID;
	}
	
	
	
	

}
