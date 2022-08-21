package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.Matricula;

import java.util.List;

public interface MatriculaRepository {
    List<Matricula> findByAlunoBairro();

    List<Matricula> findAll();

    Matricula save(Matricula matricula);
}
