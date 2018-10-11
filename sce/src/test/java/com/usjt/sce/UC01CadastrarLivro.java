package com.usjt.sce;

import static org.junit.Assert.*;
import org.junit.Test;
import com.usjt.sce.model.Livro;

public class UC01CadastrarLivro {

	@Test
	public void CT01CadastrarLivroComDadosValidos() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de Software");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}

	@Test
	public void CT02cadastrarLivroComISBN_em_branco() {
		// cenario
		Livro livro = new Livro();

		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
		try {
			// acao
			livro.setIsbn("");
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT03cadastrarLivroComISBN_nulo() {
		// cenario
		Livro livro = new Livro();

		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
		try {
			// acao
			livro.setIsbn(null);
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT04getLivro() {
		// cenario
		Livro livro = new Livro("123456", "Engenharia de Software", "Pressman");

		System.out.println(livro.getIsbn()  + " -- " + livro.getAutor() + " -- " + livro.getTitulo());
	}
	
	@Test
	public void CT05cadastrarLivroComTitulo_em_branco() {
		// cenario
		Livro livro = new Livro();

		livro.setAutor("Pressman");
		livro.setIsbn("123456");
		try {
			// acao
			livro.setTitulo("");
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Titulo invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT06cadastrarLivroComTitulo_em_nulo() {
		// cenario
		Livro livro = new Livro();

		livro.setAutor("Pressman");
		livro.setIsbn("123456");
		try {
			// acao
			livro.setTitulo(null);
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Titulo invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT07cadastrarLivroComAutor_em_branco() {
		// cenario
		Livro livro = new Livro();

        livro.setTitulo("Engenharia de Software");
		livro.setIsbn("123456");
		try {
			// acao
			livro.setAutor("");
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Autor invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT08cadastrarLivroComAutor_nulo() {
		// cenario
		Livro livro = new Livro();

        livro.setTitulo("Engenharia de Software");
		livro.setIsbn("123456");
		try {
			// acao
			livro.setAutor(null);
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Autor invalido", e.getMessage());
		}
	}
}
