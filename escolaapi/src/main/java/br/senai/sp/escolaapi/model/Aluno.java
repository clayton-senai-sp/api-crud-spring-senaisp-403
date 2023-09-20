package br.senai.sp.escolaapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Aluno {
    @Id
    private Long id;
    private Long matricula;
    private String nome;
    private String email;
}
