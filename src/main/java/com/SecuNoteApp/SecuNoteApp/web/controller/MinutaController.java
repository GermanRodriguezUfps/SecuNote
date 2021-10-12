package com.SecuNoteApp.SecuNoteApp.web.controller;
import com.SecuNoteApp.SecuNoteApp.domain.Minuta;
import com.SecuNoteApp.SecuNoteApp.domain.service.MinutaService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/minutas")
public class MinutaController {

    @Autowired
    private MinutaService minutaService;

    @PostMapping("/save")
    @ApiOperation("saves a new Minuta")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK")
    })

    public ResponseEntity<Minuta> save(@RequestBody Minuta minuta){
        System.out.println(minuta);
        return new ResponseEntity<>(minutaService.save(minuta), HttpStatus.CREATED);
    }

    @GetMapping("/getAllMinutas")
    public  ResponseEntity<List<Minuta>> getAll(){
        return new ResponseEntity<>(minutaService.getAllMinuta(), HttpStatus.OK);
    }

    @GetMapping("getMinuta/{id}")
    public ResponseEntity<Optional<Minuta>> getMinutaById(@PathVariable("id") int minutaId){
        return new ResponseEntity<>(minutaService.getMinuta(minutaId), HttpStatus.OK);
    }

}
