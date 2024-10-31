/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mboch
 */
public class modeloPedido {
    private int idMesa;
    private int idPedido;
    private String statusPedido;
    private List<modeloPedidosItens> itensPedido;
    
    public modeloPedido(){
    }
    
     public modeloPedido(int idMesa, int idPedido, String statusPedido){
     this.idMesa = idMesa;
     this.idPedido = idPedido;
     this.statusPedido = statusPedido;
     this.itensPedido= new ArrayList<modeloPedidosItens>();
     }

    public int getIdMesa() {
        return idMesa;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public String getStatusPedido() {
        return statusPedido;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public void setStatusPedido(String statusPedido) {
        this.statusPedido = statusPedido;
    }

    public List<modeloPedidosItens> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(List<modeloPedidosItens> itensPedido) {
        this.itensPedido = itensPedido;
    }
     
    
}



