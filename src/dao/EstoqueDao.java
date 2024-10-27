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
 * @author marcu
 */
public class EstoqueDao implements DaoGenerica<modeloEstoque>{

    private ConexaoBanco conexao;
    
    public EstoqueDao()
    {
        this.conexao = new ConexaoBanco();
    }
    
    @Override
    public void inserir(modeloEstoque cadastro) {
        String sql = "INSERT INTO Estoque (nomeProduto, preço, qtdProduto, descricaoProduto) VALUES (?,?,?,?)";
        
        try{
 
            if(this.conexao.conectar()){
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                sentenca.setString(1,cadastro.getNomeProd()); 
                sentenca.setFloat(2,cadastro.getPreco());
                sentenca.setInt(3,cadastro.getQtdProd()); 
                sentenca.setString(4,cadastro.getDescProduto());               
                sentenca.execute(); 
                sentenca.close(); 
                this.conexao.getConnection().close();
            }
        }
        catch(SQLException ex){
           throw new RuntimeException(ex);
        }
    }

    @Override
    public void alterar(modeloEstoque cadastro) {
        String sql = "UPDATE Estoque SET nomeProduto = ?, preço = ?, qtdProduto = ?, descricaoProduto = ?";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql); 
                sentenca.setString(1,cadastro.getNomeProd()); 
                sentenca.setFloat(2,cadastro.getPreco());
                sentenca.setInt(3,cadastro.getQtdProd()); 
                sentenca.setString(4,cadastro.getDescProduto()); 
                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }
    public void excluirID(int id) {
        String sql = "DELETE FROM Estoque WHERE idProduto = ?";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                sentenca.setInt(1, id);
                
                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }
    

    @Override
    public ArrayList<modeloEstoque> consultar() {
        
        ArrayList<modeloEstoque> listaCadastros = new ArrayList<modeloEstoque>();
        String sql = "SELECT c.idProduto, c.nomeProduto, c.preço, c.qtdProduto, c.descricaoProduto "+
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
                    cadastro.setIdProd(resultadoSentenca.getInt("idProduto"));
                    cadastro.setNomeProd(resultadoSentenca.getString("nomeProduto"));
                    cadastro.setPreco(resultadoSentenca.getFloat("preço"));
                    cadastro.setQtdProd(resultadoSentenca.getInt("qtdProduto"));
                    cadastro.setDescProduto(resultadoSentenca.getString("descricaoProduto"));
                    
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
        String sql = "SELECT c.idProduto, c.nomeProduto, c.preço, c.qtdProduto, c.descricaoProduto"+
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
                    cadastro.setIdProd(resultadoSentenca.getInt("idProduto"));
                    cadastro.setNomeProd(resultadoSentenca.getString("nomeProduto"));
                    cadastro.setPreco(resultadoSentenca.getFloat("preço"));
                    cadastro.setQtdProd(resultadoSentenca.getInt("qtdProduto"));
                    cadastro.setDescProduto(resultadoSentenca.getString("descricaoProduto"));
                    
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

    public void excluir() {
        String sql = "DELETE FROM Estoque";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
   
                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }

    @Override
    public ArrayList<modeloEstoque> dashboard() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
