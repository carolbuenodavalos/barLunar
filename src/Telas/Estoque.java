/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import javax.swing.JOptionPane;
import dao.ConexaoBanco;
import dao.EstoqueDao;
import java.util.ArrayList;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.table.DefaultTableModel;
import models.modeloEstoque;

/**
 *
 * @author marcu
 */
public class Estoque extends javax.swing.JFrame {
    int contador=0;
    /**
     * Creates new form Estoque
     */
    public Estoque() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        butaoCadastrar = new javax.swing.JButton();
        butaoLimpar = new javax.swing.JButton();
        CampoNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CampoPreco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CampoQuantidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaEstoque = new javax.swing.JTable();
        testarSQL = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        CampoDesc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CampoID = new javax.swing.JTextField();
        butaoExcluir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        butaoCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        butaoCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butaoCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        butaoCadastrar.setText("Cadastrar");
        butaoCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 5, true));
        butaoCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butaoCadastrarMouseClicked(evt);
            }
        });
        butaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaoCadastrarActionPerformed(evt);
            }
        });

        butaoLimpar.setBackground(new java.awt.Color(255, 255, 255));
        butaoLimpar.setForeground(new java.awt.Color(0, 0, 0));
        butaoLimpar.setText("Limpa os campos");
        butaoLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butaoLimparMouseClicked(evt);
            }
        });
        butaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaoLimparActionPerformed(evt);
            }
        });

        CampoNome.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Nome do Produto");

        CampoPreco.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Preço");

        CampoQuantidade.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Quantidade");

        TabelaEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome do Produto", "Preço", "Quantidade", "Desc"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaEstoqueMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaEstoque);
        if (TabelaEstoque.getColumnModel().getColumnCount() > 0) {
            TabelaEstoque.getColumnModel().getColumn(0).setResizable(false);
            TabelaEstoque.getColumnModel().getColumn(1).setResizable(false);
            TabelaEstoque.getColumnModel().getColumn(2).setResizable(false);
            TabelaEstoque.getColumnModel().getColumn(3).setResizable(false);
            TabelaEstoque.getColumnModel().getColumn(4).setResizable(false);
        }

        testarSQL.setBackground(new java.awt.Color(255, 255, 255));
        testarSQL.setForeground(new java.awt.Color(0, 0, 0));
        testarSQL.setText("testar SQL");
        testarSQL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                testarSQLMouseClicked(evt);
            }
        });
        testarSQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testarSQLActionPerformed(evt);
            }
        });

        jLabel9.setText("Descrição");

        CampoDesc.setBackground(new java.awt.Color(255, 255, 255));
        CampoDesc.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDescActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel5.setText("Estoque");

        jLabel1.setText("ID");

        CampoID.setEditable(false);
        CampoID.setBackground(new java.awt.Color(153, 153, 153));
        CampoID.setFocusable(false);

        butaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/trash (1).png"))); // NOI18N
        butaoExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butaoExcluirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(testarSQL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butaoLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CampoDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoID, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(CampoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CampoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CampoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(butaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(testarSQL)
                        .addComponent(butaoLimpar))
                    .addComponent(butaoExcluir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butaoCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butaoCadastrarMouseClicked
        // TODO add your handling code here:
       if((CampoNome.getText().trim().isEmpty()) || ((CampoQuantidade.getText().trim().isEmpty())|| CampoPreco.getText().trim().isEmpty()|| (CampoDesc.getText().trim().isEmpty()))){
                   JOptionPane.showMessageDialog(null, "Nenhum dado idendificado");
                   CampoNome.requestFocus();
       }else{
            if (contador == 0) {            
                try{    
                   modeloEstoque cadastroP = new modeloEstoque();
                   
                  cadastroP.setNomeProd(CampoNome.getText());
                  cadastroP.setPreco(Float.parseFloat(CampoPreco.getText()));
                  cadastroP.setQtdProd(Integer.parseInt(CampoQuantidade.getText()));   
                  //cadastroP.setidCategoriaProduto(Integer.parseInt(CampoCategoria.getSelectedItem().toString()));  
                  cadastroP.setDescProduto(CampoDesc.getText());     
                  EstoqueDao cadastroPDao = new EstoqueDao();
                  cadastroPDao.inserir(cadastroP); 
                  limparTabela();
                  atualizaTabela(cadastroPDao);
                  JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso!", "", INFORMATION_MESSAGE);
                  limparCampos();
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
                } 
            }else{
                modeloEstoque cadastroP = new modeloEstoque();
                cadastroP.setIdProd(Integer.parseInt(CampoID.getText()));
                cadastroP.setNomeProd(CampoNome.getText());
                cadastroP.setPreco(Float.parseFloat(CampoPreco.getText()));
                cadastroP.setQtdProd(Integer.parseInt(CampoQuantidade.getText()));  
                //cadastroP.setidCategoriaProduto(Integer.parseInt(CampoCategoria.getSelectedItem().toString()));
                cadastroP.setDescProduto(CampoDesc.getText());

                EstoqueDao cadastroPDao = new EstoqueDao();
                cadastroPDao.alterar(cadastroP);
                limparTabela();
                atualizaTabela(cadastroPDao);
                JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso!", "", INFORMATION_MESSAGE);
                CampoNome.requestFocus();
                limparCampos();
                
                contador = 0;
                TabelaEstoque.setVisible(true);
                butaoCadastrar.setText("Cadastrar");                
            }    

       }
    }//GEN-LAST:event_butaoCadastrarMouseClicked

    private void butaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaoCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butaoCadastrarActionPerformed

    private void butaoLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butaoLimparMouseClicked
        limparCampos();
    }//GEN-LAST:event_butaoLimparMouseClicked

    private void butaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaoLimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butaoLimparActionPerformed

    private void testarSQLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_testarSQLMouseClicked
        try{
            new dao.ConexaoBanco().conectar();
            JOptionPane.showMessageDialog(null, "Banco de dados conectado");
        } catch (Exception ex){
           JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado: " + ex.getMessage(), "Erro!",ERROR_MESSAGE);
        }

    }//GEN-LAST:event_testarSQLMouseClicked

    private void testarSQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testarSQLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testarSQLActionPerformed

    private void CampoDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDescActionPerformed

    private void TabelaEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaEstoqueMouseClicked
        if((TabelaEstoque.getSelectedRow() != -1) && (contador == 0) && (evt.getClickCount() == 2)){
           CampoID.setText(TabelaEstoque.getValueAt(TabelaEstoque.getSelectedRow(),0).toString());
           CampoNome.setText(TabelaEstoque.getValueAt(TabelaEstoque.getSelectedRow(),1).toString());
           CampoPreco.setText(TabelaEstoque.getValueAt(TabelaEstoque.getSelectedRow(),2).toString());
           CampoQuantidade.setText(TabelaEstoque.getValueAt(TabelaEstoque.getSelectedRow(), 3).toString()); 
           //CampoCategoria.setSelectedItem(TabelaEstoque.getValueAt(TabelaEstoque.getSelectedRow(),4).toString());
           CampoDesc.setText(TabelaEstoque.getValueAt(TabelaEstoque.getSelectedRow(), 4).toString()); 
           contador = 1;
           TabelaEstoque.enable(false);
           butaoCadastrar.setText("Alterar");
        }   
    }//GEN-LAST:event_TabelaEstoqueMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        EstoqueDao estoqueAtt = new EstoqueDao();
        atualizaTabela(estoqueAtt);
    }//GEN-LAST:event_formWindowOpened

    private void butaoExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butaoExcluirMouseClicked
        if(TabelaEstoque.getSelectedRow() != -1){
          int msgRetorno = JOptionPane.showConfirmDialog(null, 
                                      "Confirme para remover o cadastro", 
                                      "Confirmação", 
                                      JOptionPane.YES_NO_OPTION); 
                if (msgRetorno == JOptionPane.YES_OPTION) {
                    int ID = Integer.parseInt(CampoID.getText());
                    DefaultTableModel tabelacadastro = (DefaultTableModel) TabelaEstoque.getModel();
                    tabelacadastro.removeRow((TabelaEstoque.getSelectedRow()));  
                    
                    EstoqueDao deleteitem = new EstoqueDao();
                    deleteitem.excluirID(ID);
                    butaoCadastrar.setText("Cadastrar");  
                    limparCampos();
                } 
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um Cadastro para excluir!");
        }
    }//GEN-LAST:event_butaoExcluirMouseClicked
    
    private void limparCampos(){
        this.CampoID.setText("");
        this.CampoNome.setText("");
        this.CampoPreco.setText("");
        this.CampoQuantidade.setText("");   
        this.CampoDesc.setText("");  
        //this.CampoCategoria.setSelectedIndex(-1);
        }
    private void limparTabela(){
        //percorre a tabela e exclui todas as linhas
        while(TabelaEstoque.getRowCount() > 0){
            DefaultTableModel dm = (DefaultTableModel) TabelaEstoque.getModel();
            dm.getDataVector().removeAllElements();
        }
    }
    
    private void atualizaTabela(EstoqueDao cadastroPDao){
        try{
                    limparTabela();

                    ArrayList<modeloEstoque> listaCadastros;
                    listaCadastros = cadastroPDao.consultar();        
                    DefaultTableModel modeloTabela = (DefaultTableModel) TabelaEstoque.getModel();

                    for(modeloEstoque cadastroP : listaCadastros){
                        modeloTabela.addRow(new String[]{Integer.toString(cadastroP.getIdProd()),cadastroP.getNomeProd(),Integer.toString((int) cadastroP.getPreco()),Integer.toString(cadastroP.getQtdProd()),cadastroP.getDescProduto()});
                    }

                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
                }
     
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
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estoque().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoDesc;
    private javax.swing.JTextField CampoID;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JTextField CampoPreco;
    private javax.swing.JTextField CampoQuantidade;
    private javax.swing.JTable TabelaEstoque;
    private javax.swing.JButton butaoCadastrar;
    private javax.swing.JLabel butaoExcluir;
    private javax.swing.JButton butaoLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton testarSQL;
    // End of variables declaration//GEN-END:variables
}
