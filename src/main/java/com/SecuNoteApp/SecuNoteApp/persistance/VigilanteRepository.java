package com.SecuNoteApp.SecuNoteApp.persistance;

import com.SecuNoteApp.SecuNoteApp.domain.Vigilante;
import com.SecuNoteApp.SecuNoteApp.domain.repository.VigilanteRepositoryInterface;
import com.SecuNoteApp.SecuNoteApp.persistance.Entity.VigilanteEntity;
import com.SecuNoteApp.SecuNoteApp.persistance.crud.VigilanteCrudRepository;
import com.SecuNoteApp.SecuNoteApp.persistance.mapper.VigilanteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class VigilanteRepository implements VigilanteRepositoryInterface {

    @Autowired
    private VigilanteCrudRepository vigilanteCrudRepository;

    @Autowired
    private VigilanteMapper mapper;

    @Override
    public Vigilante save(Vigilante vigilante) {
        VigilanteEntity vigilanteEntity = mapper.toVigilanteEntity(vigilante);
        return mapper.toVigilante(vigilanteCrudRepository.save(vigilanteEntity));
    }

    @Override
    public List<Vigilante> getAll() {

        List<VigilanteEntity> vigilantes = (List<VigilanteEntity>) vigilanteCrudRepository.findAll();
        return mapper.toVigilantes(vigilantes);

    }

    @Override
    public Optional<Vigilante> getVigilante(int id) {
        Optional<VigilanteEntity> vigilante = vigilanteCrudRepository.findById(id);
        return vigilante.map(vigilanteEntity -> mapper.toVigilante(vigilanteEntity));
    }

    @Override
    public void deleteVigilante(int id) {
        vigilanteCrudRepository.deleteById(id);
    }


}
