package com.SecuNoteApp.SecuNoteApp.domain;

import lombok.Data;

@Data
public class Vigilante {

    private int vigilanteId;
    private String contraseña;
    private int cedula;
    private String nombre;
    private String apellidos;
    private String celular;
    private String direccion;
    private String correoElectronico;
}
