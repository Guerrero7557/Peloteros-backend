package com.peloteros.Entity;


public class UserEntity {
	private int UsuarioID; 
	private String Nombre;
	private String Correo;
	private String Telefono;
	private String PasswordHash;
	private int RoleID;
	
	
	public UserEntity() {
		// TODO Auto-generated constructor stub
	}
	
	public int getUsuarioID() {
		return UsuarioID;
	}
	public void setUsuarioID(int usuarioID) {
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
	public int getRoleID() {
		return RoleID;
	}
	public void setRoleID(int roleID) {
		RoleID = roleID;
	}
	
	
	// constructor of the class
	
	public UserEntity(int usuarioID, String nombre, String correo, String telefono, String passwordHash, int roleID) {
		super();
		UsuarioID = usuarioID;
		Nombre = nombre;
		Correo = correo;
		Telefono = telefono;
		PasswordHash = passwordHash;
		RoleID = roleID;
	}
	
	
	
	

}
