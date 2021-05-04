/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regexmatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author DADO
 */
public class RegexUI extends javax.swing.JFrame {

    /**
     * Creates new form RegexUI
     */
    public RegexUI() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textField = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        regexField = new javax.swing.JTextField();
        resultLbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        checkBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.PAGE_AXIS));

        jLabel2.setText("String to check:");
        jPanel1.add(jLabel2);

        textField.setColumns(20);
        textField.setRows(5);
        textField.setToolTipText("<html>String to check with the RegEx expression\n<br>exp. <b>name@email.com</b>\n<br>Enter only one expression\n</html>");
        jScrollPane1.setViewportView(textField);

        jPanel1.add(jScrollPane1);

        jSeparator1.setMinimumSize(new java.awt.Dimension(50, 30));
        jPanel1.add(jSeparator1);

        jLabel1.setText("RegEx expression:");
        jPanel1.add(jLabel1);

        regexField.setToolTipText("<html>Enter RegEx expression\n<br> exp. for email checker: <b>^(.+)@(.+)$</b> \n</html>");
        regexField.setMaximumSize(new java.awt.Dimension(2147483647, 30));
        jPanel1.add(regexField);

        resultLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resultLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(resultLbl);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        checkBtn.setText("Overiť RegEx");
        checkBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                checkBtnMouseReleased(evt);
            }
        });
        jPanel2.add(checkBtn);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBtnMouseReleased
            
        String regexPattern = regexField.getText();
        Pattern p = Pattern.compile(regexPattern);
        
        Matcher m = p.matcher(textField.getText());
        if(m.matches()){
            resultLbl.setText("OK");
        }
        else{
            resultLbl.setText("NG");
        }
        
    
        
        
    }//GEN-LAST:event_checkBtnMouseReleased

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
            java.util.logging.Logger.getLogger(RegexUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegexUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegexUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegexUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegexUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField regexField;
    private javax.swing.JLabel resultLbl;
    private javax.swing.JTextArea textField;
    // End of variables declaration//GEN-END:variables
}
