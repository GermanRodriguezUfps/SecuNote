package com.SecuNoteApp.SecuNoteApp.domain.repository;

import com.SecuNoteApp.SecuNoteApp.domain.Vigilante;

import java.util.List;
import java.util.Optional;

public interface VigilanteRepositoryInterface {

    Vigilante save(Vigilante vigilante);
    List<Vigilante> getAll();
    Optional<Vigilante> getVigilante(int id);
    void deleteVigilante(int id);

}
