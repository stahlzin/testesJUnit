package com.usjt.sce;

import static org.junit.Assert.*;
import org.junit.Test;
import com.usjt.sce.model.Livro;

public class UC01CadastrarLivro {
	/**
	 * Objetivo - verificar o comportamento do sistema no cadastro de Livro com dados
	 */

	@Test
	public void CT01CadastrarLivroComDadosValidos() {
		try {
			// cenario
			Livro umLivro;
			// acao
			umLivro = ObtemLivro.comDadosValidos();
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}
	
	/**
	 * Objetivo - verificar o comportamento do sistema no cadastro de Livro com ISBN em branco
	 */
	@Test
	public void CT02cadastrarLivroComISBN_em_branco() {
		try {
			// cenario
			Livro livro;
			// acao
			livro = ObtemLivro.comISBNInvalido_branco();
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN invalido", e.getMessage());
		}
	}
	
	/**
	 * Objetivo - verificar o comportamento do sistema no cadastro de Livro com ISBN nulo
	 */

	@Test
	public void CT03cadastrarLivroComISBN_nulo() {
		try {
			// cenario
			Livro livro;
			// acao
			livro = ObtemLivro.comISBNInvalido_nulo();
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT04getLivro() {
		// cenario
		Livro livro;
		//ação
		livro = ObtemLivro.comDadosValidos();
		System.out.println(livro.getIsbn() + " -- " + livro.getAutor() + " -- " + livro.getTitulo());
	}
	
	@Test
	public void CT05cadastrarLivroComTitulo_em_branco() {
		try {
			// cenario
			Livro livro;
			// acao
			livro = ObtemLivro.comTituloInvalido_branco();
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Titulo invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT06cadastrarLivroComTitulo_em_nulo() {
		try {
			// cenario
			Livro livro;
			// acao
			livro = ObtemLivro.comTitulonvalido_nulo();
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Titulo invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT07cadastrarLivroComAutor_em_branco() {
		try {
			// cenario
			Livro livro;
			// acao
			livro = ObtemLivro.comAutorInvalido_branco();
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Autor invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT08cadastrarLivroComAutor_nulo() {
		try {
			// cenario
			Livro livro;
			// acao
			livro = ObtemLivro.comAutorInvalido_nulo();
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Autor invalido", e.getMessage());
		}
	}
}
