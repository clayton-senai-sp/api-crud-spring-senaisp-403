package br.senai.sp.escolaapi.repository;

import br.senai.sp.escolaapi.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
