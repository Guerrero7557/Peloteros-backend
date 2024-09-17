package com.peloteros.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.peloteros.Entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{
	@Query("select u from UserEntity u where u.Rol='Cliente'")List<UserEntity>FindAllClients(); 
	
	//METODO QUE ME VA A PERMITIR ENCONTRAR UN USUARIO POR SU EMAIL
    @Query(value ="{call buscaremail(:xemail)}",nativeQuery=true)    
    Optional<UserEntity> findOnebyEmail(@Param("xemail") String xemail);
    

}
