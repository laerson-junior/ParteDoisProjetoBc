package br.edu.ifpb.bd.projeto.model;

public class Campo {
    private Integer idCampo;
    private String nome;
    private String endereco;
    private String tipo;

    public Campo() {}

    public Integer getIdCampo() { return idCampo; }
    public void setIdCampo(Integer idCampo) { this.idCampo = idCampo; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
}
