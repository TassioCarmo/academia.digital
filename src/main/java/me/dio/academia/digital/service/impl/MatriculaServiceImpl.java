package me.dio.academia.digital.service.impl;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MatriculaServiceImpl {


    @Autowired
    private MatriculaRepository matriculaRepository;
    @Autowired
    private AlunoRepository alunoRepository;
    @Override
    public Matricula create(MatriculaForm form) {

        Matricula matricula = new Matricula();


        return matriculaRepository.save((matricula));
    }


    @Override
    public Matricula get(Long id){
        return matriculaRepository.findAll();

    }

    public List<Matricula> getAll(String bairro) {

        if(bairro == null){
            return matriculaRepository.findAll();

        }else{
            return matriculaRepository.findByAlunoBairro();
        }

    }

    @Override
    public void delete(Long id){}
}
