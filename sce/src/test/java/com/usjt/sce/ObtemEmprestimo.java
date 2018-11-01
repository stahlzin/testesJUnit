package com.usjt.sce;

import com.usjt.sce.model.Emprestimo;
import com.usjt.sce.model.Livro;
import com.usjt.sce.model.Usuario;
import com.usjt.sce.service.ServicoEmprestimo;

public class ObtemEmprestimo {
	public static Emprestimo comDadosValidos() {
		Livro livro = ObtemLivro.comDadosValidos();
		Usuario aluno = ObtemUsuario.comDadosValidos();
		ServicoEmprestimo servico = new ServicoEmprestimo();
		return servico.empresta(livro, aluno);
	}
	
	public static Emprestimo comLivroInvalido() {
		Usuario aluno = ObtemUsuario.comDadosValidos();
		ServicoEmprestimo servico = new ServicoEmprestimo();
		return servico.empresta(null, aluno);
	}
	
	public static Emprestimo comUsuarioInvalido() {
		Livro livro = ObtemLivro.comDadosValidos();
		ServicoEmprestimo servico = new ServicoEmprestimo();
		return servico.empresta(livro, null);
	}
}