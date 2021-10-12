package com.SecuNoteApp.SecuNoteApp.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Minuta {
    private int idMinuta;
    private int idVigilante;
    private LocalDateTime fecha;
    private String comentario;
}
