package com.usjt.sce;

import com.usjt.sce.model.Usuario;

public class ObtemUsuario {
	
	public static Usuario comDadosValidos() {
		Usuario usuario = new Usuario();
		usuario.setNome("Fernando");
		usuario.setRa("33333");
		return usuario;
	}
	
	public static Usuario comRAemBranco() {
		Usuario usuario = new Usuario();
		usuario.setNome("Fernando");
		usuario.setRa("");
		return usuario;
	}

	public static Usuario comRANulo() {
		Usuario usuario = new Usuario();
		usuario.setNome("Fernando");
		usuario.setRa(null);
		return usuario;
	}
	
	public static Usuario comNomeEmBranco() {
		Usuario usuario = new Usuario();
		usuario.setNome("");
		usuario.setRa("33333");
		return usuario;
	}

	public static Usuario comNomeNulo() {
		Usuario usuario = new Usuario();
		usuario.setNome(null);
		usuario.setRa("33333");
		return usuario;
	}
	
}
