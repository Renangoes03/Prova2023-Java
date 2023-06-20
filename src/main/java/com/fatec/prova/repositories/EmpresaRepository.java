package com.fatec.prova.repositories;

import java.util.List;

import com.fatec.prova.entities.Empresa;

public interface EmpresaRepository {
    
    public interface EmpresaRepository extends JpaRepository <Empresa, Integer> {
    
    }
}


