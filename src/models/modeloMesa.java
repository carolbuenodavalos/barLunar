/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author mboch
 */
  public class modeloMesa {
    private int idMesa;
    private String mesa;
    private String statusMesa;
    private String funcionario;
    private String Pedido;
    
   public modeloMesa(){
   }
   
   public modeloMesa(int idMesa, String mesa, String statusMesa, String funcionario, String Pedido){
       this.idMesa = idMesa;
       this.mesa = mesa;
       this.statusMesa = statusMesa;
       this.funcionario = funcionario;
       this.Pedido = Pedido;
   }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public String getStatusMesa() {
        return statusMesa;
    }

    public void setStatusMesa(String statusMesa) {
        this.statusMesa = statusMesa;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getPedido() {
        return Pedido;
    }

    public void setPedido(String Pedido) {
        this.Pedido = Pedido;
    }
   
   
   
 
    
}
