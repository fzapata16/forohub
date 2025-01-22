package com.fzapatadev.forohub.controllers;


import com.fzapatadev.forohub.models.Theme;
import com.fzapatadev.forohub.repositories.ThemeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
@RequiredArgsConstructor
public class ThemeController {
    private final ThemeRepository service;

    //Metodo GET
    @GetMapping
    public ResponseEntity<List<Theme>>findAll(){

        List <Theme> respuestaHttp = service.findAll();
        return new ResponseEntity<>(respuestaHttp, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Theme> findById(@PathVariable Integer id){

        Theme respuestaHttp = service.findByID(id);
        return new ResponseEntity<>(respuestaHttp, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Theme> save(@RequestBody Theme Theme){

        Theme respuestaHttp = service.save(Theme);
        return new ResponseEntity<>(respuestaHttp, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Theme> update(@PathVariable Integer id, @RequestBody Theme Theme){
    Theme.setId(id);
    Theme respuestaHttp = service.save(Theme);
    return new ResponseEntity<>(respuestaHttp, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Integer id){
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
