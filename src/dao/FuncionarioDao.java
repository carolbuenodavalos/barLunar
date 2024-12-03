/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.modeloFuncionario;
import dao.DaoGenerica;
import models.modeloMesa;

/**
 *
 * @author marcu
 */

public class FuncionarioDao implements DaoGenerica<modeloFuncionario>{

    private ConexaoBanco conexao;
    
    public FuncionarioDao()
    {
        this.conexao = new ConexaoBanco();
    }
    
    @Override
    public void inserir(modeloFuncionario cadastro) {
        String sql = "INSERT INTO Funcionario (idFuncionario, nomeFuncionario) VALUES (?,?)";
        
        try{
 
            if(this.conexao.conectar()){
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                sentenca.setInt(1,cadastro.getIdFunc()); 
                sentenca.setString(2,cadastro.getNomeFunc());             
                sentenca.execute(); 
                sentenca.close(); 
                this.conexao.getConnection().close();
            }
        }
        catch(SQLException ex){
           throw new RuntimeException(ex);
        }
    }
    
    public int consultaPorNome(String nome) {
    String sql = "SELECT idFuncionario FROM Funcionario WHERE nomeFunc = ?";
    try {
        if (this.conexao.conectar()) {
            PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
            sentenca.setString(1, nome);
            ResultSet resultadoSentenca = sentenca.executeQuery();
            if (resultadoSentenca.next()) {
                return resultadoSentenca.getInt("idFuncionario");
            }
            sentenca.close();
            this.conexao.getConnection().close();
        }
    } catch (SQLException ex) {
        throw new RuntimeException("Erro ao obter ID do funcionário: " + ex.getMessage(), ex);
    }
    return -1;
}

    public ArrayList<modeloFuncionario> consultar() {
         ArrayList<modeloFuncionario> comboboxfuncionario = new ArrayList<modeloFuncionario>();
        String sql = "SELECT idFuncionario, nomeFuncionario, ativo FROM Funcionario ORDER BY nomeFuncionario";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                ResultSet resultadoSentenca = sentenca.executeQuery();

                while(resultadoSentenca.next()) 
                {
                    modeloFuncionario funclist = new modeloFuncionario();
                    funclist.setIdFunc(resultadoSentenca.getInt("idFuncionario"));
                    funclist.setNomeFunc(resultadoSentenca.getString("nomeFuncionario"));
                    funclist.setAtivo(resultadoSentenca.getInt("ativo"));

                    comboboxfuncionario.add(funclist);
                }

                sentenca.close();
                this.conexao.getConnection().close();
            }
            
            return comboboxfuncionario;
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }
    
    /**
     *
     * @return
     */
    public ArrayList<modeloFuncionario> dashboard() {
    ArrayList<modeloFuncionario> ListarDashBoard = new ArrayList<modeloFuncionario>();
    String sql = "SELECT idFuncionario, nomeFuncionario, ativo FROM Funcionario";

    try {
        if (this.conexao.conectar()) {
            PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);

            ResultSet resultadoSentenca = sentenca.executeQuery();

            while (resultadoSentenca.next()) {
                modeloFuncionario cadastro = new modeloFuncionario();
                cadastro.setNomeFunc(resultadoSentenca.getString("nomeFuncionario"));
                cadastro.setAtivo(resultadoSentenca.getInt("ativo"));
                
                System.out.println("Funcionario: " + cadastro.getNomeFunc() + ", Numero de vezes ativo: " + cadastro.getAtivo());

                ListarDashBoard.add(cadastro);
            }

            sentenca.close();
            this.conexao.getConnection().close();
        }
        
        return ListarDashBoard;
    } catch (SQLException ex) {
        throw new RuntimeException(ex);
    }
}

    public void incrementarAtivo(String idFuncionario) {
    String sql = "UPDATE Funcionario SET ativo = ativo + 1 WHERE idFuncionario = ?";

    try {
        if (this.conexao.conectar()) {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(sql);
            stmt.setString(1, idFuncionario);
            stmt.executeUpdate();
            stmt.close();
            this.conexao.getConnection().close();
        }
    } catch (SQLException ex) {
        throw new RuntimeException(ex);
    }
}

    public String obterIdFuncionarioPorNome(String nomeFuncionario) {
    String sql = "SELECT idFuncionario FROM Funcionario WHERE nomeFuncionario = ?";
    
    try {
        if (this.conexao.conectar()) {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(sql);
            stmt.setString(1, nomeFuncionario);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString("idFuncionario");
            }
            stmt.close();
            this.conexao.getConnection().close();
        }
    } catch (SQLException ex) {
        throw new RuntimeException(ex);
    }
    return null;
}

    
     public void alterar(modeloFuncionario cadastro) {
        String sql = "UPDATE Funcionario SET nomeFuncionario = ? WHERE idFuncionario = ?";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql); 
                sentenca.setString(1,cadastro.getNomeFunc()); 
                sentenca.setInt(2, cadastro.getIdFunc());
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

   
}
