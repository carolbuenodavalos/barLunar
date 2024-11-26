/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import dao.MesaDao;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author marcu
 */
public class DashBoard extends javax.swing.JFrame {

    /**
     * Creates new form DashBoard
     */
    public DashBoard() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        PainelPizzaPedido = new java.awt.Panel();
        PainelBarraFunc = new java.awt.Panel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Pedidos mais feitos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Funcionario mais ativo");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PainelPizzaPedidoLayout = new javax.swing.GroupLayout(PainelPizzaPedido);
        PainelPizzaPedido.setLayout(PainelPizzaPedidoLayout);
        PainelPizzaPedidoLayout.setHorizontalGroup(
            PainelPizzaPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );
        PainelPizzaPedidoLayout.setVerticalGroup(
            PainelPizzaPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 239, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PainelBarraFuncLayout = new javax.swing.GroupLayout(PainelBarraFunc);
        PainelBarraFunc.setLayout(PainelBarraFuncLayout);
        PainelBarraFuncLayout.setHorizontalGroup(
            PainelBarraFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );
        PainelBarraFuncLayout.setVerticalGroup(
            PainelBarraFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 232, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(PainelPizzaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelBarraFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(16, 16, 16)))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)
                        .addGap(25, 25, 25)
                        .addComponent(PainelPizzaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20)
                        .addComponent(PainelBarraFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        MesaDao mesaDao = new MesaDao();
        atualizaDash(mesaDao);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }
    
    private void atualizaDash(MesaDao cadastroDao)
    {
        new Thread(){
           @Override public void run(){
              while (true){
                try
                {

                    ArrayList<Cadastro> listaCadastros;
                    listaCadastros = cadastroDao.dashboard(); 
                    
                    DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
                    
                    DefaultPieDataset pizzaChartData = new DefaultPieDataset();
                    
                    for(Cadastro cadastro : listaCadastros)
                    {
                         jlblNumCadastros.setText(Integer.toString(cadastro.getTotalCadastros()));
                         jlblSoma.setText(Integer.toString(cadastro.getSomaCodigos()));
                         jlblNumSexualidade.setText(Integer.toString(cadastro.getNumSexualidade()));

                         

                        // Adiciona dados ao gráfico de barras
                         barChartData.setValue(cadastro.getTotalCadastros(), "Núm Cadastros", "Núm Cadastros");
                         barChartData.setValue(cadastro.getSomaCodigos(), "Soma dos Códigos", "Soma dos Códigos");
                         barChartData.setValue(cadastro.getNumSexualidade(), "Núm Sexualidades", "Núm Sexualidades");    
                        



                        // Adiciona dados ao gráfico pizza
                         pizzaChartData.setValue("Núm Cadastros", cadastro.getTotalCadastros());
                         pizzaChartData.setValue("Soma dos Códigos", cadastro.getSomaCodigos());
                         pizzaChartData.setValue("Núm Sexualidades", cadastro.getNumSexualidade());    


                    }
                    //Gráfico em barras
                    JFreeChart barChart = ChartFactory.createBarChart("Ex Barras", "Dados", "Valores", barChartData, 
                            PlotOrientation.VERTICAL, true, true, false);
                    CategoryPlot barchrt = barChart.getCategoryPlot();
                    barchrt.setRangeGridlinePaint(new Color(140,105,204));
                    ChartPanel ChartP = new ChartPanel(barChart);
                    PainelBarraFunc.removeAll();
                    PainelBarraFunc.add(ChartP,BorderLayout.CENTER);
                    PainelBarraFunc.validate();

                    //Gráfico em pizza
                    JFreeChart pizzaChart = ChartFactory.createPieChart("Ex: Pizza", pizzaChartData);
                    PiePlot pizzachrt = (PiePlot)pizzaChart.getPlot();
                    ChartPanel ChartPizza = new ChartPanel(pizzaChart);
                    PainelPizzaPedido.removeAll();
                    PainelPizzaPedido.add(ChartPizza,BorderLayout.CENTER);
                    PainelPizzaPedido.validate();


                    
                    Thread.sleep(3000);

                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
                }
              }   
           }
        }.start();   
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Panel PainelBarraFunc;
    private java.awt.Panel PainelPizzaPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
