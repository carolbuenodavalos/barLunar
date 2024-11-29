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
    return -1; // Caso não encontre
}

    public ArrayList<modeloFuncionario> consultar() {
         ArrayList<modeloFuncionario> comboboxfuncionario = new ArrayList<modeloFuncionario>();
        String sql = "SELECT idFuncionario, nomeFuncionario FROM Funcionario ORDER BY nomeFuncionario";
        
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
    public ArrayList<modeloMesa> dashboard() {
        
        ArrayList<modeloMesa> ListarDashBoard = new ArrayList<modeloMesa>();
//        String sql = "select count(idcad) as numcad, count(idcad)*2 as sumcad, (select count(idsexo)+100 from cadsexo) as numsexualidade from cadbasico;";
        String sql = "select count(id) as funcionario, count(id)*2 as sumcad from Mesa";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                //recebe o resultado da consulta
                 ResultSet resultadoSentenca = sentenca.executeQuery();

                //percorrer cada linha do resultado
                while(resultadoSentenca.next()) 
                {
                    //resgata o valor de cada linha, selecionando pelo nome de cada coluna da tabela Escola
                    modeloMesa cadastro = new modeloMesa();
                    cadastro.setFuncionario(resultadoSentenca.getString("numcad"));
                    //cadastro.SetSomaCodigos(resultadoSentenca.getInt("sumcad"));
                    //cadastro.SetNumSexualidade(resultadoSentenca.getInt("numsexualidade"));
                    
                    ListarDashBoard.add(cadastro);
                }

                sentenca.close();
                this.conexao.getConnection().close();
            }
            
            return ListarDashBoard;
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
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
