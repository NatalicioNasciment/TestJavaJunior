package com.biblioteca.dao;

import com.biblioteca.model.Livro;
import com.biblioteca.util.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author natalicio
 */
public class LivroDAO {

    private EntityManager em = ConnectionFactory.createEntityManager();

    public LivroDAO(EntityManager em) {
        this.em = em;
    }

    private void cadastrar(Livro livro) {
        em.getTransaction().begin();
        em.persist(livro);
        em.getTransaction().commit();
    }

    private void alterar(Integer codigo) {
        Livro livro = em.find(Livro.class, codigo);
        em.getTransaction().begin();
        em.persist(livro);
        em.getTransaction().commit();
    }

    public void salvar(Livro livro) {
        if (livro.getId() != null) {
            alterar(livro.getId());
        } else {
            cadastrar(livro);
        }
    }

    public List<Livro> listar() {
        return em.createQuery("from livro", Livro.class).getResultList();
    }

    public void remover(Integer codigo) {
        Livro livro = em.find(Livro.class, codigo);

        em.getTransaction().begin();
        em.remove(livro);
        em.flush();
        em.getTransaction().commit();
    }

    public Livro buscarPorCodigo(Integer codigo) {
        return em.find(Livro.class, codigo);
    }

}
