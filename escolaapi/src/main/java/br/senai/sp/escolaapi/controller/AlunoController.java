package br.senai.sp.escolaapi.controller;

import br.senai.sp.escolaapi.model.Aluno;
import br.senai.sp.escolaapi.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    // CRUD - Create, Read, Update, Delete

    // Create
    @PostMapping
    public void inserir(@RequestBody Aluno aluno){
        alunoRepository.save(aluno);
    }

    // Read
    @GetMapping
    public List<Aluno> buscarAlunos(){
        return alunoRepository.findAll();
    }

    //Update
    @PutMapping
    public void alterar(@RequestBody Aluno aluno){
        alunoRepository.save(aluno);
    }

    //Delete
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        alunoRepository.deleteById(id);
    }

}
