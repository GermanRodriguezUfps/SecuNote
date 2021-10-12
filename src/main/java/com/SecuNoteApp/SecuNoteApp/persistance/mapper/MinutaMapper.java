package com.SecuNoteApp.SecuNoteApp.persistance.mapper;

import com.SecuNoteApp.SecuNoteApp.domain.Minuta;
import com.SecuNoteApp.SecuNoteApp.persistance.Entity.MinutaEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MinutaMapper {
    @Mappings({
            @Mapping(source = "idMinutaEntity", target = "idMinuta"),
            @Mapping(source = "vigilanteEntity.vigilanteIdEntity", target = "idVigilante"),
            @Mapping(source = "fechaEntrity", target = "fecha"),
            @Mapping(source = "comentarioEntity", target = "comentario")
    })
    Minuta toMinuta(MinutaEntity minutaEntity);

    List<Minuta> toMinutas(List<MinutaEntity> minutaEntities);

    @InheritInverseConfiguration
    @Mapping(target = "vigilanteEntity", ignore = true)
    MinutaEntity toMinuta(Minuta minuta);
}
