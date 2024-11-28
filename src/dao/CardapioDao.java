/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.modeloEstoque;

/**
 *
 * @author mboch
 */
public class CardapioDao implements DaoGenerica<modeloEstoque>{
    
     private ConexaoBanco conexao;
    
    public CardapioDao()
    {
        this.conexao = new ConexaoBanco();
    }
    

    @Override
    public void inserir(modeloEstoque objt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void alterar(modeloEstoque objt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<modeloEstoque> consultar() {
        ArrayList<modeloEstoque> listaCadastros = new ArrayList<modeloEstoque>();
        String sql = "SELECT c.nomeProduto, c.preço, c.qtdProduto"+
                     "FROM Estoque as c "+
                     "ORDER BY c.idProduto";
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                ResultSet resultadoSentenca = sentenca.executeQuery();
                while(resultadoSentenca.next()) 
                {
                    
                    modeloEstoque cadastro = new modeloEstoque();
                    cadastro.setNomeProd(resultadoSentenca.getString("nomeProduto"));
                    cadastro.setPreco(resultadoSentenca.getFloat("preço"));
                    cadastro.setQtdProd(resultadoSentenca.getInt("qtdProduto"));
                    
                    
                    listaCadastros.add(cadastro);
                }

                sentenca.close();
                this.conexao.getConnection().close();
            }
            
            return listaCadastros;
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        } 
    }
    
    public ArrayList<modeloEstoque> consultar(String str) {
        ArrayList<modeloEstoque> listaCadastrosStr = new ArrayList<modeloEstoque>();
        String sql = "SELECT c.nomeProduto, c.preço, c.qtdProduto"+
                     "FROM Estoque as c "+
                     "WHERE ( UPPER(c.nomeProduto like UPPER(?))) "+   
                     "ORDER BY c.nomeProduto";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                sentenca.setString(1, "%"+str+"%");
                ResultSet resultadoSentenca = sentenca.executeQuery();

                while(resultadoSentenca.next()) 
                {
                    modeloEstoque cadastro = new modeloEstoque();
                    cadastro.setNomeProd(resultadoSentenca.getString("nomeProduto"));
                    cadastro.setPreco(resultadoSentenca.getFloat("preço"));
                    cadastro.setQtdProd(resultadoSentenca.getInt("qtdProduto"));
                    
                    
                    listaCadastrosStr.add(cadastro);
                }

                sentenca.close();
                this.conexao.getConnection().close();
            }
            
            return listaCadastrosStr;
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        } 
    }

    public ArrayList<modeloEstoque> dashboard() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
