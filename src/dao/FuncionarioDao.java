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
    
//    public ArrayList<modeloFuncionario> dashboard() {
//        ArrayList<modeloFuncionario> ListarDashBoard = new ArrayList<modeloFuncionario>();
//        String sql = "select count(id) as numcad, count(id)*2 as sumcad from AgendaContatos;";
//        
//        try
//        {
//            if(this.conexao.conectar())
//            {
//                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
//                
//                 ResultSet resultadoSentenca = sentenca.executeQuery();
//
//                while(resultadoSentenca.next()) 
//                {
//                    modeloFuncionario cadastro = new modeloFuncionario();
//                    cadastro.setNome(resultadoSentenca.getString("numcad"));
//                    
//                    ListarDashBoard.add(cadastro);
//                }
//
//                sentenca.close();
//                this.conexao.getConnection().close();
//            }
//            
//            return ListarDashBoard;
//        }
//        catch(SQLException ex)
//        {
//           throw new RuntimeException(ex);
//        } 
//    } 
    
    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void alterar(modeloFuncionario objt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<modeloFuncionario> dashboard() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
