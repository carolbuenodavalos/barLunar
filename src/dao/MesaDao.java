/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.modeloMesa;

/**
 *
 * @author mboch
 */
public class MesaDao implements DaoGenerica<modeloMesa> {
    
    private ConexaoBanco conexao;
    
    public MesaDao()
    {
        this.conexao = new ConexaoBanco();
    }

    @Override
    public void inserir(modeloMesa cadastro) {
        String sql = "INSERT INTO Mesa (mesa, statusMesa, funcionario, Pedido) VALUES (?,?,?,?)";
        
        try{
 
            if(this.conexao.conectar()){
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                sentenca.setString(1,cadastro.getMesa()); 
                sentenca.setString(2,cadastro.getStatusMesa());
                sentenca.setString(3,cadastro.getFuncionario()); 
                sentenca.setString(4,cadastro.getPedido()); 
            
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
    public void alterar(modeloMesa cadastro) {
         String sql = "UPDATE Mesa SET mesa = ?, statusMesa = ?, funcionario = ?, Pedido = ? WHERE idMesa = ?";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql); 
                sentenca.setString(1,cadastro.getMesa()); 
                sentenca.setString(2,cadastro.getStatusMesa());
                sentenca.setString(3,cadastro.getFuncionario()); 
                sentenca.setString(4,cadastro.getPedido());
                sentenca.setInt(5,cadastro.getIdMesa());
                
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
    public void excluir() {
        
    }

    @Override
    public ArrayList<modeloMesa> consultar() {
        ArrayList<modeloMesa> listaCadastros = new ArrayList<modeloMesa>();
        String sql = "SELECT c.idMesa, c.mesa, c.statusMesa, c.funcionario, c.Pedido "+
                     "FROM Mesa as c "+
                     "ORDER BY c.idMesa";
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                ResultSet resultadoSentenca = sentenca.executeQuery();
                while(resultadoSentenca.next()) 
                {
                    
                    modeloMesa cadastro = new modeloMesa();
                    cadastro.setIdMesa(resultadoSentenca.getInt("idMesa"));
                    cadastro.setMesa(resultadoSentenca.getString("mesa"));
                    cadastro.setStatusMesa(resultadoSentenca.getString("statusMesa"));
                    cadastro.setFuncionario(resultadoSentenca.getString("funcionario"));
                    cadastro.setPedido(resultadoSentenca.getString("Pedido"));
                    
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
    
     public void excluirID(int id) {
        String sql = "DELETE FROM Mesa WHERE idMesa = ?";
        
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
     
     
  public String obterFuncionarioMaisAtivo() {
    String sql = "SELECT funcionario, COUNT(*) AS total FROM Mesa " +
                 "GROUP BY funcionario " +
                 "ORDER BY total DESC " +
                 "LIMIT 1";

    try {
        if (this.conexao.conectar()) {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString("funcionario");
            }
            stmt.close();
            this.conexao.getConnection().close();
        }
    } catch (SQLException ex) {
        throw new RuntimeException(ex);
    }
    return "Nenhum funcionário encontrado";
}
     
     
     

    @Override
    public ArrayList<modeloMesa> dashboard() {
        
        return null;
        
    }
    
}


