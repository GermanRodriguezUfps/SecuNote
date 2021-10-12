package com.SecuNoteApp.SecuNoteApp.domain.service;

import com.SecuNoteApp.SecuNoteApp.domain.Vigilante;
import com.SecuNoteApp.SecuNoteApp.domain.repository.VigilanteRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VigilanteService {

    @Autowired
    public VigilanteRepositoryInterface vigilanteRepositoryInterface;

    public Vigilante save(Vigilante vigilante){
        return vigilanteRepositoryInterface.save(vigilante);
    }

    public List<Vigilante> getAll(){
        return vigilanteRepositoryInterface.getAll();
    }

    public Optional<Vigilante> getVigilante(int idVigilante){
        return vigilanteRepositoryInterface.getVigilante(idVigilante);
    }

    public boolean deleteVigilante(int vigilanteId){
        return getVigilante(vigilanteId).map(vigilante -> {
            vigilanteRepositoryInterface.deleteVigilante(vigilanteId);
            return true;
        }).orElse(false);
    }
}
