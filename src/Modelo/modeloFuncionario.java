/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author mboch
 */
public class modeloFuncionario {
    private int idFuncionario;
    private String nomeFuncionario;
    
    
    public modeloFuncionario(){
    }
    
    public modeloFuncionario (int idFuncionario, String nomeFuncionario){
        this.idFuncionario = idFuncionario;
        this.nomeFuncionario = nomeFuncionario;
    }
    
    
    public int getIdFunc(){
        return idFuncionario;
    }
    
    public void setIdFunc(){
        this.idFuncionario = idFuncionario;
    }
    
    public String getNomeFunc(){
        return nomeFuncionario;
    }
    
    public void setNomeFunc(){
     this.nomeFuncionario = nomeFuncionario;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


