package com.SecuNoteApp.SecuNoteApp.domain.service;

import com.SecuNoteApp.SecuNoteApp.domain.Minuta;
import com.SecuNoteApp.SecuNoteApp.domain.repository.MinutaRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MinutaService {

    @Autowired
    private MinutaRepositoryInterface minutaRepositoryInterface;

    public Minuta save(Minuta minuta){
        return minutaRepositoryInterface.save(minuta);
    }

    public List<Minuta> getAllMinuta(){
        return minutaRepositoryInterface.getAllMinutas();
    }
    public Optional<Minuta> getMinuta(int id){
        return minutaRepositoryInterface.getMinuta(id);
    }
}
