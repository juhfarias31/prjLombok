package com.JuliaFarias.PrjLombok.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JuliaFarias.PrjLombok.entities.Usuario;

public interface UsuarioRepositorio extends JpaRepository <Usuario, Long>{

}
