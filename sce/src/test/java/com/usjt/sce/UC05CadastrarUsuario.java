package com.usjt.sce;

import static org.junit.Assert.*;

import org.junit.Test;

import com.usjt.sce.model.Livro;
import com.usjt.sce.model.Usuario;

public class UC05CadastrarUsuario {

	@Test
	public void CT01CadastrarUsuarioComDadosValidos() {
		try {
			// cenario
			Usuario user = new Usuario();
			// acao
			user.setNome("Fernando");
			user.setRa("333334");
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}

	@Test
	public void CT02cadastrarUsuarioComRA_em_branco() {
		// cenario
		Usuario user = new Usuario();
		// acao
		user.setNome("Fernando");
		try {
			// acao
			user.setRa("");
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("RA invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT03cadastrarUsuarioComRA_nulo() {
		// cenario
		Usuario user = new Usuario();
		// acao
		user.setNome("Fernando");
		try {
			// acao
			user.setRa(null);
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("RA invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT04cadastrarUsuarioComNome_em_branco() {
		// cenario
		Usuario user = new Usuario();
		// acao
		user.setRa("333334");
		try {
			// acao
			user.setNome("");
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Nome invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT05cadastrarUsuarioComNome_nulo() {
		// cenario
		Usuario user = new Usuario();
		// acao
		user.setRa("333334");
		try {
			// acao
			user.setNome(null);
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Nome invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT04getLivro() {
		// cenario
		Usuario user = new Usuario();
		// acao
		user.setNome("Fernando");
		user.setRa("333334");

		try {
			System.out.println(user.getNome() + " -- " + user.getRa());
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}

}
