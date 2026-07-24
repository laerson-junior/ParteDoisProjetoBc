package br.edu.ifpb.bd.projeto.model;

public class Professor {
    private Integer idProfessor;
    private String nome;
    private String cref;
    private String telefone;

    public Professor() {}

    public Integer getIdProfessor() { return idProfessor; }
    public void setIdProfessor(Integer idProfessor) { this.idProfessor = idProfessor; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCref() { return cref; }
    public void setCref(String cref) { this.cref = cref; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
}
