package com.SecuNoteApp.SecuNoteApp.persistance.crud;

import com.SecuNoteApp.SecuNoteApp.persistance.Entity.MinutaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MinutaCrudRepository extends JpaRepository<MinutaEntity, Integer> {
}
