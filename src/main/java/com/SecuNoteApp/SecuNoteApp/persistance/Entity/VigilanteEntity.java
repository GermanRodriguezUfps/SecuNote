package com.SecuNoteApp.SecuNoteApp.persistance.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "vigilantes")
@Data
@NoArgsConstructor
public class VigilanteEntity implements Serializable {
    @Id
    @Column(name = "id_vigilante")
    private int vigilanteIdEntity;

    @Column(name = "contraseña")
    @NonNull
    private String contraseñaEntity;

    @Column(name = "cedula")
    private String cedulaEntity;

    @Column(name = "nombre")
    private String nombresEntity;

    @Column(name = "apellidos")
    private String apellidosEntity;

    @Column(name = "celular")
    private Integer celularEnity;

    @Column(name = "direccion")
    private String direccionEntity;

    @Column(name = "correo_electronico")
    private String correoElectronicoEntity;

    //Onetomany Realiza consultas (lectura consultas investigar)
    // @Fetch (optimizacion de busqueda) (investigar)
    @Transient
    private List<MinutaEntity> minutaEntity;


    public VigilanteEntity(int vigilanteIdEntity) {
        this.vigilanteIdEntity = vigilanteIdEntity;
    }
}
