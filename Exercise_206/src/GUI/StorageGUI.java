package GUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class StorageGUI extends javax.swing.JFrame {

    /**
     * Creates new form StorageGUI
     */
    public StorageGUI() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tableStorage = new javax.swing.JTable();
        menuBar = new javax.swing.JMenuBar();
        menuManagement = new javax.swing.JMenu();
        miAddArticle = new javax.swing.JMenuItem();
        miRemoveArticle = new javax.swing.JMenuItem();
        miEditArticle = new javax.swing.JMenuItem();
        menuBuySell = new javax.swing.JMenu();
        miBuyArticle = new javax.swing.JMenuItem();
        miSellArticle = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableStorage.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableStorage);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        menuBar.setFocusTraversalPolicyProvider(true);

        menuManagement.setText("Management");

        miAddArticle.setText("Add New Article");
        menuManagement.add(miAddArticle);

        miRemoveArticle.setText("Remove Selected Article");
        menuManagement.add(miRemoveArticle);

        miEditArticle.setText("Edit Selected Article");
        menuManagement.add(miEditArticle);

        menuBar.add(menuManagement);

        menuBuySell.setText("Buy/Sell");

        miBuyArticle.setText("Buy Selected Article");
        menuBuySell.add(miBuyArticle);

        miSellArticle.setText("Sell Selected Article");
        menuBuySell.add(miSellArticle);

        menuBar.add(menuBuySell);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(StorageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StorageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StorageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StorageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StorageGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuBuySell;
    private javax.swing.JMenu menuManagement;
    private javax.swing.JMenuItem miAddArticle;
    private javax.swing.JMenuItem miBuyArticle;
    private javax.swing.JMenuItem miEditArticle;
    private javax.swing.JMenuItem miRemoveArticle;
    private javax.swing.JMenuItem miSellArticle;
    private javax.swing.JTable tableStorage;
    // End of variables declaration//GEN-END:variables
}