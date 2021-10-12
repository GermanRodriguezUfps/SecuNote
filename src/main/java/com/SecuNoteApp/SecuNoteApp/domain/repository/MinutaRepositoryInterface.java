package com.SecuNoteApp.SecuNoteApp.domain.repository;

import com.SecuNoteApp.SecuNoteApp.domain.Minuta;

import java.util.List;
import java.util.Optional;

public interface MinutaRepositoryInterface {

    Minuta save(Minuta minuta);
    List<Minuta> getAllMinutas();
    Optional<Minuta> getMinuta(int id);
//    void delete(int id);
}
