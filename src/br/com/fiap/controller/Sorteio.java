package br.com.fiap.controller;

import java.util.List;
import br.com.fiap.dao.UsuarioDao;
import br.com.fiap.entity.Usuario;

public class Sorteio {
	
	public void sortear(){
		UsuarioDao dao = new UsuarioDao();
		List<Usuario> primeiraLista = dao.listar();
		List<Usuario> segundaLista = dao.listar();
		
		for (Usuario usuario : primeiraLista) {
			usuario.setMembroSorteado(obterCorrespondente(usuario, segundaLista));
			System.out.println(usuario + " sorteou " + usuario.getMembroSorteado());
		}
	}
	
	private Usuario obterCorrespondente(Usuario usuario, List<Usuario> lista){
		int random = (int) Math.floor(Math.random()*lista.size());
		Usuario sorteado = lista.get(random);
		if (sorteado.equals(usuario)){
			return obterCorrespondente(usuario, lista);
		}else{
			lista.remove(random);
			return sorteado;
		}
	}
}

