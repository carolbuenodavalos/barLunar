/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.modeloEstoque;
import models.modeloPedido;
import models.modeloPedidosItens;

/**
 *
 * @author mboch
 */
public class PedidoDao implements DaoGenerica<modeloPedido>{
    
     private ConexaoBanco conexao;
     private EstoqueDao estoqueDao;
             
             
    public PedidoDao()
    {
        this.conexao = new ConexaoBanco();
        this.estoqueDao = new EstoqueDao(this.conexao);
    }

    @Override
    public void inserir(modeloPedido objt) {
     String sql = "INSERT INTO Pedido (idMesa, idPedido, statusMesa) VALUES (?,?,?)";
        
        try{
 
            if(this.conexao.conectar()){
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                sentenca.setInt(1,objt.getIdMesa()); 
                sentenca.setInt(2,objt.getIdPedido());
                sentenca.setString(3,objt.getStatusPedido());
                sentenca.execute();
                if (sentenca.getGeneratedKeys().next()) {
                int chavePrimaria = sentenca.getGeneratedKeys().getInt(1);
                this.inserirItens(chavePrimaria);
                }
                sentenca.close(); 
                this.conexao.getConnection().close();
            }
        }
        catch(SQLException ex){
           throw new RuntimeException(ex);
        }
    }
    
    private void inserirItens(int idPedido) {
     String sql = "INSERT INTO Pedido (idItem, idPedido, idProduto, preço, quantidadeItem) VALUES (?,?,?,?,?)";
        
        try{
            
            List<modeloEstoque> listaEstoque = estoqueDao.consultar();
            
            if(this.conexao.conectar()){
                for (modeloEstoque estoque : listaEstoque) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                sentenca.setInt(1,0); 
                sentenca.setInt(2,idPedido);
                sentenca.setInt(3,estoque.getIdProd());
                sentenca.setFloat(4,estoque.getPreco());
                sentenca.setInt(5,0);
                sentenca.execute(); 
                sentenca.close();
                } 
                this.conexao.getConnection().close();
            }
        }
        catch(SQLException ex){
           throw new RuntimeException(ex);
        }
    }

    @Override
    public void alterar(modeloPedido objt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<modeloPedido> consultar() {
     ArrayList<modeloPedido> listaCadastros = new ArrayList<modeloPedido>();
        String sql = "SELECT c.idMesa, c.idPedido, c.statusPedido "+
                     "FROM Pedido as c "+
                     "ORDER BY c.idPedido";
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                ResultSet resultadoSentenca = sentenca.executeQuery();
                while(resultadoSentenca.next()) 
                {
                    
                    modeloPedido cadastro = new modeloPedido();
                    cadastro.setIdMesa(resultadoSentenca.getInt("idMesa"));
                    cadastro.setIdPedido(resultadoSentenca.getInt("idPedido"));
                    cadastro.setStatusPedido(resultadoSentenca.getString("statusPedido"));
                    cadastro.setItensPedido(this.consultarItens(cadastro.getIdPedido()));
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
    
    private ArrayList<modeloPedidosItens> consultarItens(int idPedido) {
        ArrayList<modeloPedidosItens> listaCadastros = new ArrayList<modeloPedidosItens>();
        String sql = "SELECT c.idItem, c.idPedido, c.idProduto, c.preço, c.quantidadeItem "+
                     "FROM pedidosItens as c "+
                     "WHERE c.idPedido = ? "+
                     "ORDER BY c.idPedido";
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                sentenca.setInt(1,idPedido);
                ResultSet resultadoSentenca = sentenca.executeQuery();
                while(resultadoSentenca.next()) 
                {
                    
                    modeloPedidosItens cadastro = new modeloPedidosItens();
                    cadastro.setIdItem(resultadoSentenca.getInt("idMesa"));
                    cadastro.setIdPedido(resultadoSentenca.getInt("idPedido"));
                    cadastro.setIdProduto(resultadoSentenca.getInt("idPedido"));
                    cadastro.setPreço(resultadoSentenca.getFloat("preço"));
                    cadastro.setQuantidadeItem(resultadoSentenca.getInt("quantidadeItem"));
                    
                    
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
    
    public ArrayList<modeloPedido> consultarPedidoAberto(int idMesa) {
     ArrayList<modeloPedido> listaCadastros = new ArrayList<modeloPedido>();
        String sql = "SELECT c.idMesa, c.idPedido, c.statusPedido "+
                     "FROM Pedido as c "+
                     "WHERE c.idMesa = ? "+
                     "AND c.statusPedido = 'A' " +
                     "ORDER BY c.idPedido";
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                ResultSet resultadoSentenca = sentenca.executeQuery();
                while(resultadoSentenca.next()) 
                {
                    
                    modeloPedido cadastro = new modeloPedido();
                    cadastro.setIdMesa(resultadoSentenca.getInt("idMesa"));
                    cadastro.setIdPedido(resultadoSentenca.getInt("idPedido"));
                    cadastro.setStatusPedido(resultadoSentenca.getString("statusPedido"));
                    cadastro.setItensPedido(this.consultarItens(cadastro.getIdPedido()));
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
    

    public ArrayList<modeloPedido> dashboard() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
