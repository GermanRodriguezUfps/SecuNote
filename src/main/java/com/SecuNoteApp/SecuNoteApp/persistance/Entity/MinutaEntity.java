package com.SecuNoteApp.SecuNoteApp.persistance.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "minutas", schema = "public")
@AllArgsConstructor
@NoArgsConstructor
@Data
//@IdClass(MinutaEntityPkId.class)
public class MinutaEntity{

    @Id
    @Column(name = "id_minuta")
    private int idMinutaEntity;

    @DateTimeFormat
    @Column(name = "fecha")
    private LocalDateTime fechaEntrity;

    @Column(name = "cometario")
    private String comentarioEntity;

    @ManyToOne
    @JoinColumns({
            @JoinColumn (name = "id_vigilante", insertable = false, updatable = false)
    })
    private VigilanteEntity vigilanteEntity;


}
