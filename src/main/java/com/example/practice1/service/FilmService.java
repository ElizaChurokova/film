package com.example.practice1.service;

import com.example.practice1.dto.FilmDto;
import com.example.practice1.entity.Film;

import java.util.List;

public interface FilmService {
    Film saveFilm(FilmDto filmDto);
    List<Film> getAllFilms();
    Film updateFilm(Long filmId, FilmDto filmDto);
    Film deleteFilm(Long filmId);
}
