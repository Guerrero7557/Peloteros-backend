package com.peloteros.Services;

import java.util.List;
import java.util.Optional;

import com.peloteros.Entity.UserEntity;

public interface UserService {
	
	//function that allow you to display all data 
    List<UserEntity> findAll();
    
    
    //function to display all enabled data
    List<UserEntity> findAllCustom();
    
    //funcion para buscar por codigo
    Optional<UserEntity> findById(Long id);
    
    //funcion para buscar por codigo
    Optional<UserEntity> findOnebyEmail(String xemail);
    
    //funcion para registrar datos
    UserEntity add(UserEntity u);
    
    //funcion para actualizar datos
    UserEntity update(UserEntity u);
    
    //funcion para eliminar datos
    UserEntity delete(UserEntity u);

}
