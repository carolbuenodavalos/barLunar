/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author mboch
 */
public class modeloEstoque {
    private int idProduto;
    private String nomeProduto;
    private int qtdProduto;
    private String descricaoProduto;
    private float preço;
    
    
 public modeloEstoque(){
 }
 
 public modeloEstoque(int idProduto, String nomeProduto, int qtdProduto, String descricaoProduto, float preço ){
     this.idProduto = idProduto;
     this.nomeProduto = nomeProduto;
     this.qtdProduto = qtdProduto;
     this.descricaoProduto = descricaoProduto;
     this.preço = preço;
}
 
 public int getIdProd(){
   return idProduto;
 }
 
 public String getNomeProd(){
     return nomeProduto;
 }
 
 public int getQtdProd(){
     return qtdProduto; 
 }
 
 public String getDescProduto(){
     return descricaoProduto;
 }
 
 public float getPreco(){
     return preço;
 }
 
 public void setIdProd(int idProduto){
     this.idProduto = idProduto;
 }
 
 public void setNomeProd(String nomeProduto){
     this.nomeProduto = nomeProduto;
 }
 
 public void setQtdProd(int qtdProduto){
     this.qtdProduto = qtdProduto;
 }
 
 public void setDescProduto(String descricaoProduto){
     this.descricaoProduto = descricaoProduto;
 }
 
  public void setPreco(float preço){
     this.preço = preço;
 }
 
 
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

