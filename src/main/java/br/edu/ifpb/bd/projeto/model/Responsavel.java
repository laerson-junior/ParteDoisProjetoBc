package br.edu.ifpb.bd.projeto.model;

public class Responsavel {
    private Integer idResponsavel;
    private String nome;
    private String cpf;
    private String telefone;

    public Responsavel() {}

    public Responsavel(Integer idResponsavel, String nome, String cpf, String telefone) {
        this.idResponsavel = idResponsavel;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public Integer getIdResponsavel() { return idResponsavel; }
    public void setIdResponsavel(Integer idResponsavel) { this.idResponsavel = idResponsavel; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
}
