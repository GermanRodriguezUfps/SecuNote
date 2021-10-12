package com.SecuNoteApp.SecuNoteApp.persistance;

import com.SecuNoteApp.SecuNoteApp.domain.Minuta;
import com.SecuNoteApp.SecuNoteApp.domain.Vigilante;
import com.SecuNoteApp.SecuNoteApp.domain.repository.MinutaRepositoryInterface;
import com.SecuNoteApp.SecuNoteApp.persistance.Entity.MinutaEntity;
import com.SecuNoteApp.SecuNoteApp.persistance.Entity.VigilanteEntity;
import com.SecuNoteApp.SecuNoteApp.persistance.crud.MinutaCrudRepository;
import com.SecuNoteApp.SecuNoteApp.persistance.mapper.MinutaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MinutaRepository implements MinutaRepositoryInterface {

    @Autowired
    private MinutaCrudRepository minutaCrudRepository;

    @Autowired
    private MinutaMapper mapper;

    @Override
    public Minuta save(Minuta minuta) {

        MinutaEntity minutaEntity = mapper.toMinuta(minuta);

        VigilanteEntity vigilanteEntity = new VigilanteEntity(minuta.getIdVigilante());

        minutaEntity.setVigilanteEntity(vigilanteEntity);

        MinutaEntity guardar = minutaCrudRepository.save(minutaEntity);

        return mapper.toMinuta(guardar);
    }

    @Override
    public List<Minuta> getAllMinutas() {
        List<MinutaEntity> minutas = (List<MinutaEntity>) minutaCrudRepository.findAll();
        return mapper.toMinutas(minutas);
    }

    @Override
    public Optional<Minuta> getMinuta(int id) {
        Optional<MinutaEntity> minuta = minutaCrudRepository.findById(id);

        return minuta.map(minutaEntity -> mapper.toMinuta(minutaEntity));

    }
}
