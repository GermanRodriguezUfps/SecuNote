package com.SecuNoteApp.SecuNoteApp.web.controller;

import com.SecuNoteApp.SecuNoteApp.domain.Vigilante;
import com.SecuNoteApp.SecuNoteApp.domain.service.VigilanteService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Vigilante")
public class VigilanteController {

    @Autowired
    private VigilanteService vigilanteService;


    @PostMapping("/save")
    public ResponseEntity<Vigilante> save(@RequestBody Vigilante vigilate){

        return new ResponseEntity<>(vigilanteService.save(vigilate), HttpStatus.CREATED);

    }

    @GetMapping("/getAllVigilantes")
    public ResponseEntity<List<Vigilante>> getAll(){
        return new ResponseEntity<>(vigilanteService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/getVigilante/{id}")
    public ResponseEntity<Optional<Vigilante>> getVigilanteById(@ApiParam(value = "the dniId of the vigilante to find", required = true, example = "1")
                                      @PathVariable("id")int vigilanteId){

        return new ResponseEntity<>(vigilanteService.getVigilante(vigilanteId), HttpStatus.OK);

    }

    @DeleteMapping("/deleteVigilante/{id}")
    public ResponseEntity deleteVigilante(@PathVariable("id") int vigilanteId){
        return new ResponseEntity(vigilanteService.deleteVigilante(vigilanteId), HttpStatus.OK);
    }
}
