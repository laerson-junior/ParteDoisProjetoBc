package br.edu.ifpb.bd.projeto.controller;

import br.edu.ifpb.bd.projeto.dao.AlunoDAO;
import br.edu.ifpb.bd.projeto.dao.ResponsavelDAO;
import br.edu.ifpb.bd.projeto.model.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoDAO alunoDAO = new AlunoDAO();
    private final ResponsavelDAO responsavelDAO = new ResponsavelDAO();

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("alunos", alunoDAO.listarTodos());
        return "listAlunos";
    }

    @GetMapping("/novo")
    public String exibirFormulario(Model model) {
        model.addAttribute("aluno", new Aluno());
        model.addAttribute("responsaveis", responsavelDAO.listarTodos());
        return "formAluno";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Aluno aluno) {
        alunoDAO.salvar(aluno);
        return "redirect:/alunos";
    }

    @GetMapping("/deletar/{id}")
    public String deletar(@PathVariable("id") int id) {
        alunoDAO.deletar(id);
        return "redirect:/alunos";
    }
}
