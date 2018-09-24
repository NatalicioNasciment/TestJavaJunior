/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca.controller;

import com.biblioteca.dao.LivroDAO;
import com.biblioteca.model.Livro;
import com.biblioteca.util.ConnectionFactory;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;
import org.jdesktop.observablecollections.ObservableCollections;
  
/**
 *
 * @author natalicio
 */
public final class LivroController {

    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    private final LivroDAO livroDAO;
    private Livro livro;
    private Livro livroSelecionado;
    private List<Livro> listaDeLivrosVindoDaTabela;

    public LivroController() {
        this.livroDAO = new LivroDAO(ConnectionFactory.createEntityManager());
        this.listaDeLivrosVindoDaTabela = ObservableCollections.observableList(new ArrayList<Livro>());

        novo();
        listarTodos();
    }

    public void novo() {
        setLivro(new Livro());
    }

    public void salvar() {
        livroDAO.salvar(livro);
        novo();
    }

    public void excluir() {
        livroDAO.remover(livro.getId());
        novo();
        listarTodos();
    }

    public void listarTodos() {
        listaDeLivrosVindoDaTabela.clear();
        listaDeLivrosVindoDaTabela.addAll(livroDAO.listar());
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        Livro olLivro = this.livro;
        this.livro = livro;
        propertyChangeSupport.firePropertyChange("livro", olLivro, livro);
    }

    public Livro getLivroSelecionado() {
        return livroSelecionado;
    }

    public void setLivroSelecionado(Livro livroSelecionado) {
        this.livroSelecionado = livroSelecionado;
        if (this.livroSelecionado != null) {
            setLivro(livroSelecionado);
        }
    }

    public List<Livro> getListaDeLivrosVindoDaTabela() {
        return listaDeLivrosVindoDaTabela;
    }

    public void setListaDeLivrosVindoDaTabela(List<Livro> listaDeLivrosVindoDaTabela) {
        this.listaDeLivrosVindoDaTabela = listaDeLivrosVindoDaTabela;
    }

    public void addPropertyChangeListener(PropertyChangeListener e) {
        propertyChangeSupport.addPropertyChangeListener(e);
    }

    public void removePropertyChangeListener(PropertyChangeListener e) {
        propertyChangeSupport.removePropertyChangeListener(e);
    }

}
