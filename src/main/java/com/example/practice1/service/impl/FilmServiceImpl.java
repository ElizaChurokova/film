package com.example.practice1.service.impl;

import com.example.practice1.dto.FilmDto;
import com.example.practice1.entity.Film;
import com.example.practice1.repository.FilmRepository;
import com.example.practice1.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FilmServiceImpl implements FilmService {
private final FilmRepository filmRepository;
@Override
public Film saveFilm(FilmDto filmDto){
    Film film = new Film();
    film.setName(filmDto.getName());
    film.setGenre(filmDto.getGenre());
    film.setYearOfIssue(filmDto.getYearOfIssue());
    film.setLanguage(filmDto.getLanguage());
    return filmRepository.save(film);
}
@Override
public List<Film>getAllFilms(){
    return filmRepository.findAll();
}
@Override
public Film updateFilm(Long filmId, FilmDto updatedFilmDto){
    Optional<Film>optionalFilm = filmRepository.findById(filmId);
    return optionalFilm.map(film->{
        film.setName(updatedFilmDto.getName());
        film.setGenre(updatedFilmDto.getGenre());
        film.setYearOfIssue(updatedFilmDto.getYearOfIssue());
        film.setLanguage(updatedFilmDto.getLanguage());
        return filmRepository.save(film);
    }).orElse(null);
}
@Override
public Film deleteFilm(Long filmId){
    Optional<Film>optionalFilm = filmRepository.findById(filmId);
    return optionalFilm.map(film->{
        filmRepository.delete(film);
        return film;
    }).orElse(null);
}

}
