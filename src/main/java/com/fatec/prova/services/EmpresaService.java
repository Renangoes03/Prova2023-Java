package com.fatec.prova.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fatec.prova.entities.Empresa;
import com.fatec.prova.repositories.EmpresaRepository;

public class EmpresaService {
    
    @Autowired 
   private EmpresaRepository empresaRepository;
public Object delete;

   public Empresa getEmpresaById(int id ){
    Object empresaRepository;
    return empresaRepository.findById(id).orElseThrow(
        () -> new EntityNotFoundException("Empresa Não encontrada")
    );
   }

   public List<Empresa> getEmpresa(){
    return EmpresaRepository.findAll();
}

public void deleteById(int id) {
    Empresa empresa = getEmpresaById(id);
    empresaRepository.delete(empresa);
}

public Empresa save(Empresa empresa) {
    return empresaRepository.save(empresa);
}

public void update(int id, Empresa empresa) {
    getEmpresaById(id);
    empresaRepository.save(empresa);
}

}
