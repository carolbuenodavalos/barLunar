/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author mboch
 */
  public class modeloMesa {
    private int idMesa;
    private int numeroMesa;
    private String statusMesa;
    
    
   public modeloMesa(){
   }
   
   public modeloMesa(int idMesa, int numeroMesa, String statusMesa){
       this.idMesa = idMesa;
       this.numeroMesa = numeroMesa;
       this.statusMesa = statusMesa;
   }
   
   
   public int getIdMesa(){
       return idMesa;
   }
   
   public void setIdMesa(int idMesa){
       this.idMesa = idMesa;
   }
   
   public int getNumeroMesa(){
       return numeroMesa;
   }
   
   public void setNumeroMesa(int numeroMesa){
       this.numeroMesa = numeroMesa;
   }
 
 public String getStatusMesa(){
     return statusMesa;
 }
 
 public void setStatusMesa(String statusMesa){
     this.statusMesa = statusMesa;
 }
     
    
}
