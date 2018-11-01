package com.usjt.sce;
import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;
import com.usjt.sce.model.Emprestimo;
import com.usjt.sce.model.Livro;
import com.usjt.sce.model.Usuario;
import com.usjt.sce.service.ServicoEmprestimo;

public class UC09RegistraEmprestimoDeLivro {
	static private Livro livro;
	static private Usuario usuario;
	static private ServicoEmprestimo servico;

	@Test
	public void CT01RegistraEmprestimoDeLivro_com_sucesso() {
		// cenario
		livro = new Livro();
		livro.setIsbn("121212");
		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
		usuario = new Usuario();
		usuario.setRa("1111");
		usuario.setNome("Jose da Silva");
		servico = new ServicoEmprestimo();
		// acao
		Emprestimo resultadoEsperado = servico.empresta(livro, usuario);
		// verificação
		assertNotNull(resultadoEsperado);
	}

	@Test
	public void CT02RegistraEmprestimoDeLivro_com_sucesso() {
		// cenario
		Emprestimo emprestimo = null;
		// acao
		emprestimo = ObtemEmprestimo.comDadosValidos();
		// verificação
		assertNotNull(emprestimo);
	}
	
	
	@Test
	public void CT02UC01FB_registra_emprestimo_com_sucesso_validacao_da_data() {
		// cenario
		DateTimeFormatter fmt = DateTimeFormat.forPattern("YYYY/MM/dd");
		String dataEsperada = new DateTime().plusDays(8).toString(fmt);
		ServicoEmprestimo servico = null;
		// acao
		Emprestimo emprestimo = ObtemEmprestimo.comDadosValidos();
		String dataObtida = emprestimo.getDataDevolucao();
		// verificacao
		assertTrue(dataEsperada.equals(dataObtida));
	}
	
	@Test
	public void CT03RegistraEmprestimoDeLivro_com_livroNulo() {
		try {
			// cenario
			Emprestimo emprestimo = null;
			// acao
			emprestimo = ObtemEmprestimo.comLivroInvalido();
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Dados inválidos.", e.getMessage());
		}
	}
	
	@Test
	public void CT04RegistraEmprestimoDeLivro_com_UsuarioNulo() {
		try {
			// cenario
			Emprestimo emprestimo = null;
			// acao
			emprestimo = ObtemEmprestimo.comUsuarioInvalido();
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Dados inválidos.", e.getMessage());
		}
	}
	
	@Test
	public void CT05RegistraEmprestimoDiretoLivro_com_UsuarioNulo() {
		try {
			// cenario
			Emprestimo emprestimo = new Emprestimo();
			Livro livro = ObtemLivro.comDadosValidos();
			// acao
			emprestimo.setLivro(livro);
			emprestimo.setUsuario(null);
			
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Dados invalidos.", e.getMessage());
		}
	}
	
	@Test
	public void CT06RegistraEmprestimoDiretoLivro_com_LivroNulo() {
		try {
			// cenario
			Emprestimo emprestimo = new Emprestimo();
			Usuario aluno = ObtemUsuario.comDadosValidos();
			// acao

			emprestimo.setLivro(null);
			emprestimo.setUsuario(aluno);
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Dados invalidos.", e.getMessage());
		}
	}
	
	@Test
	public void CT07RegistraEmprestimoDeLivro_com_sucessoGET() {
		// cenario
		Emprestimo emprestimo = null;
		// acao
		emprestimo = ObtemEmprestimo.comDadosValidos();
		// verificação
		System.out.println(emprestimo.getLivro() + " -- " + emprestimo.getUsuario());
	}
	
	@Test
	public void CT08RegistraEmprestimoDeLivro_com_DataInvalida() {
		try {
			// cenario
			Emprestimo emprestimo = new Emprestimo();
			Usuario aluno = ObtemUsuario.comDadosValidos();
			Livro livro = ObtemLivro.comDadosValidos();
			String dataEmprestimo = "XCPPO";
			// acao

			emprestimo.setLivro(livro);
			emprestimo.setUsuario(aluno);
			emprestimo.setDataEmprestimo(dataEmprestimo);
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Data invalida.", e.getMessage());
		}
	}
	
	
}