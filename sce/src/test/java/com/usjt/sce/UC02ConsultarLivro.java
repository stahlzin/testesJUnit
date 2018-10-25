package com.usjt.sce;

import static org.junit.Assert.*;
import com.usjt.sce.model.DAOFactory;
import com.usjt.sce.model.ILivroDAO;
import com.usjt.sce.model.Livro;

import org.junit.Before;
import org.junit.Test;

public class UC02ConsultarLivro {

	@Test
	public void CT01CadastrarLivro_com_sucesso() {
		// cenario
		Livro umLivro = ObtemLivro.comDadosValidos();
		Livro resultadoObtido = null;
		DAOFactory mySQLFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
		ILivroDAO livroDAO = mySQLFactory.getLivroDAO();
		// acao
		livroDAO.adiciona(umLivro);
		resultadoObtido = livroDAO.consulta(umLivro.getIsbn());
		// verificacao
		assertTrue(resultadoObtido.equals(umLivro));
		livroDAO.exclui(umLivro.getIsbn());

	}
}

