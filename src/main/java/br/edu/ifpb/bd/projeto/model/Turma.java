package br.edu.ifpb.bd.projeto.model;

import java.time.LocalTime;

public class Turma {
    private Integer idTurma;
    private LocalTime horarioInicio;
    private LocalTime horarioFim;
    private Professor professor;
    private Campo campo;

    public Turma() {}

    public Integer getIdTurma() { return idTurma; }
    public void setIdTurma(Integer idTurma) { this.idTurma = idTurma; }

    public LocalTime getHorarioInicio() { return horarioInicio; }
    public void setHorarioInicio(LocalTime horarioInicio) { this.horarioInicio = horarioInicio; }

    public LocalTime getHorarioFim() { return horarioFim; }
    public void setHorarioFim(LocalTime horarioFim) { this.horarioFim = horarioFim; }

    public Professor getProfessor() { return professor; }
    public void setProfessor(Professor professor) { this.professor = professor; }

    public Campo getCampo() { return campo; }
    public void setCampo(Campo campo) { this.campo = campo; }
}
