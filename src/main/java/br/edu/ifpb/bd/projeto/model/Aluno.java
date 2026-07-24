package br.edu.ifpb.bd.projeto.model;

import java.time.LocalDate;

public class Aluno {
    private Integer idAluno;
    private String nome;
    private LocalDate dataNascimento;
    private Responsavel responsavel;

    public Aluno() {}

    public Aluno(Integer idAluno, String nome, LocalDate dataNascimento, Responsavel responsavel) {
        this.idAluno = idAluno;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.responsavel = responsavel;
    }

    public Integer getIdAluno() { return idAluno; }
    public void setIdAluno(Integer idAluno) { this.idAluno = idAluno; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public LocalDate getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }

    public Responsavel getResponsavel() { return responsavel; }
    public void setResponsavel(Responsavel responsavel) { this.responsavel = responsavel; }
}
