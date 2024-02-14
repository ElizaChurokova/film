package com.example.practice1.controller;

import com.example.practice1.dto.FilmDto;
import com.example.practice1.entity.Film;
import com.example.practice1.service.impl.FilmServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/film")
@Tag(name = "Controller for swagger illustration")
public class FilmController {

    private final FilmServiceImpl filmService;


    @PostMapping("/create")
@Operation(summary = "Метод для создания фильма")
    public ResponseEntity<Film>createFilm(@RequestBody @Valid FilmDto filmDto){
    return ResponseEntity.ok(filmService.saveFilm(filmDto));
}
@GetMapping("get-film")
@Operation(summary = "Метод для получения списка фильмов")
    public ResponseEntity<List<Film>>getAllFilms(){
    return ResponseEntity.ok(filmService.getAllFilms());
}

@PutMapping("update-film")
@Operation(summary = "Метод для изменения фильма")
public ResponseEntity<Film> updateFilm(
        @RequestParam Long filmId, @RequestBody FilmDto updatedFilmDto){
    return ResponseEntity.ok(filmService.updateFilm(filmId, updatedFilmDto));
}
@DeleteMapping("delete-film")
@Operation(summary = "Метод для удаления фильма")
public ResponseEntity<Film> deleteFilm(
        @RequestParam Long filmId){
    return ResponseEntity.ok(filmService.deleteFilm(filmId));
}
}

