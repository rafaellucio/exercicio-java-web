package br.com.fiap.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import br.com.fiap.entity.Usuario;

public class UsuarioDao {
	
	@Transactional
	public void cadastrar(Usuario usuario){
		EntityManager em = JpaUtil.criarConexao();
		em.persist(usuario);
	}
	
	public List<Usuario> listar(){
		EntityManager em = JpaUtil.criarConexao();	
		TypedQuery<Usuario> query = em.createQuery("From Usuario" , Usuario.class);
		return query.getResultList();
	}
	
}
