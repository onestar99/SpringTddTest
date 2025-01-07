package com.example.TddTest.Controller;

import com.example.TddTest.Model.Wine;
import com.example.TddTest.Repository.WineRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wines")
public class WineController {

    private final WineRepository wineRepository;

    public WineController(WineRepository wineRepository) {
        this.wineRepository = wineRepository;
    }

    // Green
    @PostMapping
    public ResponseEntity<Wine> createWine(@RequestBody Wine wine) {
        Wine savedWine = wineRepository.save(wine);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedWine);
    }



}
