/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import javax.swing.JOptionPane;
import dao.ConexaoBanco;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author marcu
 */
public class Estoque extends javax.swing.JFrame {

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
        CampoCategoria = new javax.swing.JComboBox<>();
        butaoLimpar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        CampoID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
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
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        butaoCadastrar.setBackground(new java.awt.Color(153, 153, 153));
        butaoCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butaoCadastrar.setText("Cadastrar");
        butaoCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true));
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

        CampoCategoria.setBackground(new java.awt.Color(153, 153, 153));
        CampoCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Refrigerante", "Alcoólica", "Água", "Leite de macho" }));
        CampoCategoria.setSelectedIndex(-1);
        CampoCategoria.setBorder(null);
        CampoCategoria.setFocusable(false);

        butaoLimpar.setBackground(new java.awt.Color(153, 153, 153));
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

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Categoria");

        CampoID.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("ID");

        CampoNome.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Nome do Produto");

        CampoPreco.setBackground(new java.awt.Color(153, 153, 153));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Preço");

        CampoQuantidade.setBackground(new java.awt.Color(153, 153, 153));

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Quantidade");

        TabelaEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome do Produto", "Preço", "Quantidade", "Categoria"
            }
        ));
        jScrollPane1.setViewportView(TabelaEstoque);

        testarSQL.setBackground(new java.awt.Color(153, 153, 153));
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

        CampoDesc.setBackground(new java.awt.Color(153, 153, 153));
        CampoDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDescActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Estoque");

        jButton1.setText("Mesa");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CampoDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jLabel9)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(testarSQL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butaoLimpar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoID, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CampoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CampoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(CampoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel7)))
                .addGap(24, 24, 24)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testarSQL)
                    .addComponent(butaoLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butaoCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butaoCadastrarMouseClicked
        // TODO add your handling code here:
        String vSN = "";
        if(this.butaoLimpar.isSelected()){
            vSN = "SIM";
        } else{
            vSN = "NÃO";
        }
        JOptionPane.showMessageDialog(null, "Cadastro efetuado:"+ "\n" +
            "ID: " + CampoID.getText() + "\n" +
            "Nome: " + CampoNome.getText() + "\n" +
            "Preço: " + CampoPreco.getText() + "\n" +
            "Quantidade: " + CampoQuantidade.getText() + "\n" +     
            "Categoria: " + CampoCategoria.getSelectedItem() + "\n");
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        new telaMesa().setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked
    
    private void limparCampos(){
        this.CampoID.setText("");
        this.CampoNome.setText("");
        this.CampoPreco.setText("");
        this.CampoQuantidade.setText("");   
        this.CampoDesc.setText("");  
        this.CampoCategoria.setSelectedIndex(-1);
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
    
    /* 
    alterar ->
    Tb01.setValueAt(jNome.getText(), Tb01.getSelectedRow(), 0);
           Tb01.setValueAt(jCpf.getText(), Tb01.getSelectedRow(), 1);
           Tb01.setValueAt(jEmail.getText(), Tb01.getSelectedRow(), 2);           
           Tb01.setValueAt(jCBSexo.getSelectedItem().toString(), Tb01.getSelectedRow(), 3);
           limparCampos();
           vInsUpdate = 0;
           Tb01.enable(true);
           jBCadastrar.setText("Cadastrar");
    cadastrar  DefaultTableModel tbcadastro = (DefaultTableModel) Tb01.getModel();
                Object [] dados = {jNome.getText(), jCpf.getText(), jEmail.getText(), jCBSexo.getSelectedItem().toString()};
                tbcadastro.addRow(dados)
    
    remover ->
    if(Tb01.getSelectedRow() != -1){
          int msgRetorno = JOptionPane.showConfirmDialog(null, 
                                      "Confirme para remover o cadastro", 
                                      "Confirmação", 
                                      JOptionPane.YES_NO_OPTION); 
                if (msgRetorno == JOptionPane.YES_OPTION) {
                    DefaultTableModel tbcadastro = (DefaultTableModel) Tb01.getModel();
                    tbcadastro.removeRow((Tb01.getSelectedRow()));  
                    limparCampos();
                } 
        }else{
            JOptionPane.showMessageDialog(null,
    
    mouse click ->
    if((Tb01.getSelectedRow() != -1) && (vInsUpdate == 0) && (evt.getClickCount() == 2)){

           jNome.setText(Tb01.getValueAt(Tb01.getSelectedRow(),0).toString());
           jCpf.setText(Tb01.getValueAt(Tb01.getSelectedRow(),1).toString());
           jCBSexo.setSelectedItem(Tb01.getValueAt(Tb01.getSelectedRow(),3).toString());
           jEmail.setText(Tb01.getValueAt(Tb01.getSelectedRow(), 2).toString());
           vInsUpdate = 1;
           Tb01.enable(false);
           jBCadastrar.setText("Alterar");
        }
    */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CampoCategoria;
    private javax.swing.JTextField CampoDesc;
    private javax.swing.JTextField CampoID;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JTextField CampoPreco;
    private javax.swing.JTextField CampoQuantidade;
    private javax.swing.JTable TabelaEstoque;
    private javax.swing.JButton butaoCadastrar;
    private javax.swing.JButton butaoLimpar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton testarSQL;
    // End of variables declaration//GEN-END:variables
}
