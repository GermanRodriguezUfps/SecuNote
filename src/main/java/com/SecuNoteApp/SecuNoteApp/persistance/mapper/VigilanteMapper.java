package com.SecuNoteApp.SecuNoteApp.persistance.mapper;

import com.SecuNoteApp.SecuNoteApp.domain.Vigilante;
import com.SecuNoteApp.SecuNoteApp.persistance.Entity.VigilanteEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VigilanteMapper {
    @Mappings({
            @Mapping(source = "vigilanteIdEntity", target = "vigilanteId"),
            @Mapping(source = "contraseñaEntity", target = "contraseña"),
            @Mapping(source = "cedulaEntity", target = "cedula"),
            @Mapping(source = "nombresEntity", target = "nombre"),
            @Mapping(source = "apellidosEntity", target = "apellidos"),
            @Mapping(source = "celularEnity", target = "celular"),
            @Mapping(source = "direccionEntity", target = "direccion"),
            @Mapping(source = "correoElectronicoEntity", target = "correoElectronico")
    })
    Vigilante toVigilante(VigilanteEntity vigilanteEntity);

    List<Vigilante> toVigilantes(List<VigilanteEntity> vigilantes);

    @InheritInverseConfiguration
    @Mapping(target = "minutaEntity", ignore = true)
    VigilanteEntity toVigilanteEntity(Vigilante vigilante);
}
