/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca.util;

import com.biblioteca.dao.LivroDAO;
import com.biblioteca.model.Livro;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author natalicio
 */
public class LivroTableModel extends AbstractTableModel {

    List<Livro> dados = new ArrayList<Livro>();
    LivroDAO livroDAO = new LivroDAO(ConnectionFactory.createEntityManager());
    private String[] colunas = {"Titulo", "Autor", "Ano Edição", "Data Cadastro", "Nota Usuários", "Resenha"};

    public LivroTableModel() {
        dados = livroDAO.listar();
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return dados.get(linha).getTitulo();

            case 1:
                return dados.get(linha).getAutor();

            case 2:
                return dados.get(linha).getAnoEdicao();

            case 3:
                return dados.get(linha).getDataCadastro();

            case 4:
                return dados.get(linha).getNotaUsuarios();

            case 5:
                return dados.get(linha).getResenha();

        }
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch (coluna) {
            case 0:
                dados.get(linha).setTitulo((String) valor);
                break;

            case 1:
                dados.get(linha).setAutor((String) valor);
                break;

            case 2:
                dados.get(linha).setAnoEdicao(Integer.parseInt((String) valor));
                break;

            case 3:
                dados.get(linha).setDataCadastro((String) valor);
                break;

            case 4:
                dados.get(linha).setNotaUsuarios(Integer.parseInt((String) valor));
                break;

            case 5:
                dados.get(linha).setResenha((String) valor);
                break;

        }
        this.fireTableCellUpdated(linha, linha);
    }

    public void removeRow(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

}
