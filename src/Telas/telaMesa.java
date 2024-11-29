/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import dao.EstoqueDao;
import dao.FuncionarioDao;
import dao.MesaDao;
import dao.PedidoDao;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import models.modeloEstoque;
import models.modeloFuncionario;
import models.modeloMesa;
import models.modeloPedido;

/**
 *
 * @author mboch
 */
public class telaMesa extends javax.swing.JFrame {
        int vInsUpdate = 0;
    /**
     * Creates new form telaMesa
     */
    public telaMesa() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(39, 52, 105));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        CampoID = new javax.swing.JTextField();
        labelIdMesa = new javax.swing.JLabel();
        ComboMesa = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        statusMesa = new javax.swing.JComboBox<>();
        labelStatusMesa = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tb01 = new javax.swing.JTable();
        botaoSalvar = new javax.swing.JButton();
        CampoFunc = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TabelaCardapio = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        TabelaPedidos = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        CampoID.setEditable(false);
        CampoID.setBackground(new java.awt.Color(153, 153, 153));
        CampoID.setForeground(new java.awt.Color(255, 255, 255));
        CampoID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CampoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoIDActionPerformed(evt);
            }
        });

        labelIdMesa.setForeground(new java.awt.Color(255, 255, 255));
        labelIdMesa.setText("Id Mesa");

        ComboMesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mesa 1", "Mesa 2", "Mesa 3", "Mesa 4", "Mesa 5" }));
        ComboMesa.setSelectedIndex(-1);
        ComboMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboMesaActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mesa");

        statusMesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ocupada", "Livre", "A Pagar" }));
        statusMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusMesaActionPerformed(evt);
            }
        });

        labelStatusMesa.setForeground(new java.awt.Color(255, 255, 255));
        labelStatusMesa.setText("Status Mesa");

        Tb01.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Mesa", "Status", "Funcionario", "Pedido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tb01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tb01MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tb01);

        botaoSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSalvarMouseClicked(evt);
            }
        });
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        CampoFunc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Robo 1", "Robo 2", "Ze" }));
        CampoFunc.setSelectedIndex(-1);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Funcionario");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mesa");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cardápio");

        TabelaCardapio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do Produto", "Valor", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaCardapio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TabelaCardapioFocusLost(evt);
            }
        });
        jScrollPane4.setViewportView(TabelaCardapio);

        TabelaPedidos.setEditable(false);
        TabelaPedidos.setColumns(20);
        TabelaPedidos.setRows(5);
        TabelaPedidos.setFocusable(false);
        TabelaPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaPedidosMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(TabelaPedidos);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pedidos");

        jButton1.setText("Imprimir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoSalvar)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jButton1))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoID, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelIdMesa)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelStatusMesa)
                            .addComponent(statusMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(CampoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(labelIdMesa)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(CampoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ComboMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelStatusMesa)
                                    .addGap(5, 5, 5)
                                    .addComponent(statusMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(botaoSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoIDActionPerformed

    private void ComboMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboMesaActionPerformed
    
    private void limparFunc(){
        CampoFunc.removeAllItems();
    }
    
    private void limparCampos()
    {
        this.CampoID.setText("");
        this.ComboMesa.setSelectedIndex(-1);
        this.statusMesa.setSelectedIndex(-1);
        this.CampoFunc.setSelectedIndex(-1);
    }
    
    void atualizarFuncionario(FuncionarioDao DaoFunc){
        try{
              limparFunc();
              ArrayList<modeloFuncionario> listarFunc;
              listarFunc = DaoFunc.consultar();

              for(modeloFuncionario func : listarFunc){
                  CampoFunc.addItem(func.getNomeFunc());
               }
                    CampoFunc.setSelectedIndex(-1);
                    }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
                    }
                
    }
        
//    private void abrirPedido(){
//        int idMesa = ComboMesa.getSelectedIndex()+1;
//        modeloPedido obejeto = new modeloPedido();
//        PedidoDao pedidoDAO = new PedidoDao();
//        ArrayList<modeloPedido> lista = pedidoDAO.consultarPedidoAberto(idMesa);
//        if(lista.isEmpty()){
//        obejeto.setIdMesa(idMesa);
//        obejeto.setStatusPedido("A");
//        pedidoDAO.inserir(obejeto);
//        }else{
//        obejeto = lista.get(0);
//        }
//    }
    
    
    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
           
       
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void statusMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusMesaActionPerformed

    private void botaoSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSalvarMouseClicked
        processarPedido();
        salvarInformacoes();
        reabreMesa();
    }//GEN-LAST:event_botaoSalvarMouseClicked

    private void Tb01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tb01MouseClicked
        if((Tb01.getSelectedRow() != -1) && (vInsUpdate == 0) && (evt.getClickCount() == 2)){
           
           CampoID.setText(Tb01.getValueAt(Tb01.getSelectedRow(),0).toString());
           ComboMesa.setSelectedItem(Tb01.getValueAt(Tb01.getSelectedRow(),1).toString());
           statusMesa.setSelectedItem(Tb01.getValueAt(Tb01.getSelectedRow(),2).toString()); 
           CampoFunc.setSelectedItem(Tb01.getValueAt(Tb01.getSelectedRow(),3).toString());  
           String pedidos = Tb01.getValueAt(Tb01.getSelectedRow(), 4).toString(); 
           TabelaPedidos.setText(pedidos);
           vInsUpdate = 1;
           Tb01.enable(false);
           botaoSalvar.setText("Alterar");
        }
    }//GEN-LAST:event_Tb01MouseClicked
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        FuncionarioDao DaoFunc = new FuncionarioDao();
        atualizarFuncionario(DaoFunc);
        EstoqueDao estoqueAtt = new EstoqueDao();
        atualizaTabela(estoqueAtt);
        MesaDao attmesa = new MesaDao();
        atualizaMesas(attmesa);
        
        
        new Thread(){
           @Override public void run(){
              while (true){
                try
                {
                    FuncionarioDao DaoFunc = new FuncionarioDao();
                    atualizarFuncionario(DaoFunc);
                    EstoqueDao estoqueAtt = new EstoqueDao();
                    atualizaTabela(estoqueAtt);
                    MesaDao attmesa = new MesaDao();
                    atualizaMesas(attmesa);
                   

                    
                    Thread.sleep(10);

                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
                }
              }   
           }
        }.start();  
    }//GEN-LAST:event_formWindowOpened

    private void TabelaCardapioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TabelaCardapioFocusLost
        
    }//GEN-LAST:event_TabelaCardapioFocusLost

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        imprimirNota();
    }//GEN-LAST:event_jButton1MouseClicked

    private void TabelaPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaPedidosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TabelaPedidosMouseClicked

private void salvarInformacoes() {
   if (ComboMesa.getSelectedItem() == null || statusMesa.getSelectedItem() == null || CampoFunc.getSelectedItem() == null) {
                   JOptionPane.showMessageDialog(null, "Nenhum dado idendificado");
                   ComboMesa.requestFocus();
       }else{
        if (vInsUpdate == 0) {            
                try{    
                  // Obter as informações das seleções
    String mesa = (ComboMesa.getSelectedItem() != null) ? ComboMesa.getSelectedItem().toString() : "Mesa 404";
    String status = (statusMesa.getSelectedItem() != null) ? statusMesa.getSelectedItem().toString() : "Status 404";
    String funcionario = (CampoFunc.getSelectedItem() != null) ? CampoFunc.getSelectedItem().toString() : "Funcionário 404";

    // Obter os pedidos do JTextArea
    String pedidos = TabelaPedidos.getText();

    // Adicionar informações na tabela Tb01
    //DefaultTableModel modeloMesa = (DefaultTableModel) Tb01.getModel();
    //modeloMesa.addRow(new Object[]{mesa, status, funcionario, pedidos});
                  
    modeloMesa cadastroP = new modeloMesa();
                  
    cadastroP.setMesa(mesa);
    cadastroP.setStatusMesa(status); 
    cadastroP.setFuncionario(funcionario);    
    cadastroP.setPedido(pedidos);     
    MesaDao cadastroPDao = new MesaDao();
    cadastroPDao.inserir(cadastroP); 
    limparTabela();
    JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso!", "", INFORMATION_MESSAGE);

    // Resetar o campo de texto do JTextArea
    TabelaPedidos.setText("");
    EstoqueDao estoqueAtt = new EstoqueDao();
    atualizaTabela(estoqueAtt);
    MesaDao attmesa = new MesaDao();
    atualizaMesas(attmesa);
    limparCampos();
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
                } 
            }else{
                // Obter as informações das seleções
    String mesa = (ComboMesa.getSelectedItem() != null) ? ComboMesa.getSelectedItem().toString() : "Mesa 404";
    String status = (statusMesa.getSelectedItem() != null) ? statusMesa.getSelectedItem().toString() : "Status 404";
    String funcionario = (CampoFunc.getSelectedItem() != null) ? CampoFunc.getSelectedItem().toString() : "Funcionário 404";

    // Obter os pedidos do JTextArea
    String pedidos = TabelaPedidos.getText();

    // Adicionar informações na tabela Tb01
    //DefaultTableModel modeloMesa = (DefaultTableModel) Tb01.getModel();
    //modeloMesa.addRow(new Object[]{mesa, status, funcionario, pedidos});
                  
    modeloMesa cadastroP = new modeloMesa();
    
    cadastroP.setIdMesa(Integer.parseInt(CampoID.getText()));
    cadastroP.setMesa(mesa);
    cadastroP.setStatusMesa(status); 
    cadastroP.setFuncionario(funcionario);    
    cadastroP.setPedido(pedidos);     
    MesaDao cadastroPDao = new MesaDao();
    cadastroPDao.alterar(cadastroP); 
    limparTabela();
    JOptionPane.showMessageDialog(null, "Alteração feita com sucesso!", "", INFORMATION_MESSAGE);

    // Resetar o campo de texto do JTextArea
    TabelaPedidos.setText("");
    EstoqueDao estoqueAtt = new EstoqueDao();
    atualizaTabela(estoqueAtt);
    MesaDao attmesa = new MesaDao();
    atualizaMesas(attmesa);
    limparCampos();
                
                vInsUpdate = 0;
                Tb01.setVisible(true);
                botaoSalvar.setText("Salvar");                
            }    
    }
    
}


 private void processarPedido() {
    DefaultTableModel modeloTabela = (DefaultTableModel) TabelaCardapio.getModel();
    ArrayList<String> pedidos = new ArrayList<>();
    int valorTotal = 0;

    for (int i = 0; i < modeloTabela.getRowCount(); i++) {
        String quantidadeStr = (String) modeloTabela.getValueAt(i, 2);
        if (quantidadeStr != null && !quantidadeStr.isEmpty() && quantidadeStr.matches("\\d+")) {
            int quantidade = Integer.parseInt(quantidadeStr);
            String nome = (String) modeloTabela.getValueAt(i, 0);
            int valor = Integer.parseInt((String) modeloTabela.getValueAt(i, 1));
            int total = quantidade * valor;
            pedidos.add(nome + ":\n" + "Quantidade: " + quantidade + "\nPreço do produto: R$ " + valor + "\nValor do conjunto: R$ " + total + "\n==");
            valorTotal += total;
        }
    }

    // Concatenar todos os pedidos em uma única string
    StringBuilder textoPedidos = new StringBuilder();
    for (String pedido : pedidos) {
        textoPedidos.append(pedido).append("\n");
    }

    // Adicionar o valor total do pedido ao final
    textoPedidos.append("Valor total do pedido: R$ ").append(valorTotal);

    // Adicionar os pedidos ao JTextArea
    TabelaPedidos.setText(textoPedidos.toString());

    // Salvar a informação no banco de dados
    // salvarNoBancoDeDados(textoPedidos.toString());

    // Adicionar informações na tabela Tb01
    // String mesa = ComboMesa.getSelectedItem().toString();
    // String status = statusMesa.getSelectedItem().toString();
    // String funcionario = CampoFunc.getSelectedItem().toString();
    // DefaultTableModel modeloMesa = (DefaultTableModel) Tb01.getModel();
    // modeloMesa.addRow(new Object[]{mesa, status, funcionario, textoPedidos.toString()});
    exibirPedidos(pedidos, valorTotal);

    // Obter texto do JTextArea e salvar no banco de dados (Na teoria, pois temos q ver sobre)
    // String textoPedidos = TabelaPedidos.getText();
    // salvarNoBancoDeDados(textoPedidos);
}


    private void exibirPedidos(ArrayList<String> pedidos, int valorTotal) {
    // Limpa a área de pedidos na tela de "Pedidos"
    JTextArea areaPedidos = new JTextArea();
    areaPedidos.setText(""); // Limpa o conteúdo anterior
    
    for (String pedido : pedidos) {
        areaPedidos.append(pedido + "\n");
    }
    
    
    areaPedidos.setEditable(false);

    // Exibe o pedido na nova janela de "Pedidos"
    JFrame frame = new JFrame("Resumo do Pedido");
    frame.setSize(300, 400);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.add(new JScrollPane(areaPedidos));
    frame.setVisible(true);
    }

    void atualizaTabela(EstoqueDao cadastroPDao){
        try{
                    limparTabela();

                    ArrayList<modeloEstoque> listaCadastros;
                    listaCadastros = cadastroPDao.consultar();        
                    DefaultTableModel modeloTabela = (DefaultTableModel) TabelaCardapio.getModel();

                    for(modeloEstoque cadastroP : listaCadastros){
                        modeloTabela.addRow(new String[]{cadastroP.getNomeProd(),Integer.toString((int) cadastroP.getPreco())});
                    }

                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
                }
     
    }
    
     void atualizaMesas(MesaDao cadastroPDao){
        try{
                    limparMesas();

                    ArrayList<modeloMesa> listaCadastros;
                    listaCadastros = cadastroPDao.consultar();        
                    DefaultTableModel modeloTabela = (DefaultTableModel) Tb01.getModel();

                    for (modeloMesa cadastroP : listaCadastros) {
                            modeloTabela.addRow(new String[]{
                                Integer.toString(cadastroP.getIdMesa()),
                                cadastroP.getMesa(),
                                cadastroP.getStatusMesa(),
                                cadastroP.getFuncionario(),
                                cadastroP.getPedido()
                            });
                        }


                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
                }
     
    }
     
    private void limparTabela(){
        //percorre a tabela e exclui todas as linhas
        while(TabelaCardapio.getRowCount() > 0){
            DefaultTableModel dm = (DefaultTableModel) TabelaCardapio.getModel();
            dm.getDataVector().removeAllElements();
        }
    }
    
    private void limparMesas(){
        //percorre a tabela e exclui todas as linhas
        while(Tb01.getRowCount() > 0){
            DefaultTableModel dm = (DefaultTableModel) Tb01.getModel();
            dm.getDataVector().removeAllElements();
        }
    }
    private void imprimirNota(){
        MessageFormat header = new MessageFormat("Nota Fiscal");
        MessageFormat footer = new MessageFormat("Bar Lunar");
        try{
                HashPrintRequestAttributeSet set = new HashPrintRequestAttributeSet();
                set.add(OrientationRequested.LANDSCAPE);
                TabelaPedidos.print(header, footer);
                JOptionPane.showMessageDialog(null, "\n" + "Nota Fiscal imprimido no caixa");
                fecharMesa();
        }catch (java.awt.print.PrinterException e){
                JOptionPane.showMessageDialog(null, "\n"+"Falha na impressão" + "\n" + e);



        }   
    }
    
    private void fecharMesa(){
         if(Tb01.getSelectedRow() != -1){
                    int ID = Integer.parseInt(CampoID.getText());
                    DefaultTableModel tabelacadastro = (DefaultTableModel) Tb01.getModel();
                    tabelacadastro.removeRow((Tb01.getSelectedRow()));  
                    
                    MesaDao deleteitem = new MesaDao();
                    deleteitem.excluirID(ID);  
                    limparCampos();
                
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um Cadastro para excluir!");
        }
    }
    
    private void reabreMesa() {
    
            telaMesa frameTelaMesa = new telaMesa();
            frameTelaMesa.setVisible(true);
            this.dispose();
            
            
    }       
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaMesa().setVisible(true);
            }
            
            
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CampoFunc;
    private javax.swing.JTextField CampoID;
    private javax.swing.JComboBox<String> ComboMesa;
    private javax.swing.JTable TabelaCardapio;
    private javax.swing.JTextArea TabelaPedidos;
    private javax.swing.JTable Tb01;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelIdMesa;
    private javax.swing.JLabel labelStatusMesa;
    private javax.swing.JComboBox<String> statusMesa;
    // End of variables declaration//GEN-END:variables
}
