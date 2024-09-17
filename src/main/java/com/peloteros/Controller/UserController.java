package com.peloteros.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peloteros.Entity.UserEntity;
import com.peloteros.Services.UserService;

@RestController
@RequestMapping("/usuarios")
public class UserController {
	
	@Autowired
    private UserService UsuSer;
	
	@GetMapping
    public List<UserEntity>findAll(){
        return UsuSer.findAll();
    }

}
