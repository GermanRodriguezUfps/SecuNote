package com.SecuNoteApp.SecuNoteApp.persistance.crud;

import com.SecuNoteApp.SecuNoteApp.persistance.Entity.VigilanteEntity;
import org.springframework.data.repository.CrudRepository;

public interface VigilanteCrudRepository extends CrudRepository<VigilanteEntity, Integer> {
}
