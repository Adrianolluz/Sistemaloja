
package Sistemaloja;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class CadFuncionario extends javax.swing.JFrame {
    TelaInicial tela;
    private ArrayList funcionario;
    public CadFuncionario(TelaInicial tela) {
       initComponents();
       funcionario = new ArrayList();
       this.tela = tela;   
    //private CadFuncionario() {
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        textoNome = new javax.swing.JTextField();
        textoIdade = new javax.swing.JTextField();
        textoEndereco = new javax.swing.JTextField();
        textoProfissao = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb1 = new javax.swing.JTable();
        adicionar = new javax.swing.JButton();
        apagar = new javax.swing.JButton();
        textoContato = new javax.swing.JFormattedTextField();
        textoNumeroRg = new javax.swing.JFormattedTextField();
        Fundo = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jLabel12.setText("jLabel12");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Funcionario");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Nome completo:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 110, 100, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("DADOS PESSOAIS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 40, 220, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Numero Rg:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(140, 140, 70, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Idade:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(530, 110, 40, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Contato:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(450, 140, 50, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Endereço:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(140, 170, 60, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setText("DADOS PROFICIONAIS");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(90, 230, 270, 29);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Profissao:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(160, 300, 70, 20);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel11);
        jLabel11.setBounds(70, 360, 0, 0);

        textoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNomeActionPerformed(evt);
            }
        });
        getContentPane().add(textoNome);
        textoNome.setBounds(240, 110, 280, 20);

        textoIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoIdadeActionPerformed(evt);
            }
        });
        getContentPane().add(textoIdade);
        textoIdade.setBounds(570, 110, 30, 20);
        getContentPane().add(textoEndereco);
        textoEndereco.setBounds(240, 170, 360, 20);

        textoProfissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoProfissaoActionPerformed(evt);
            }
        });
        getContentPane().add(textoProfissao);
        textoProfissao.setBounds(240, 300, 200, 20);

        jButton3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(580, 360, 90, 25);

        jtb1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtb1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Numero Rg", "Idade", "Telefone", "Endereço", "Profissao"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtb1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jtb1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jtb1);
        if (jtb1.getColumnModel().getColumnCount() > 0) {
            jtb1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jtb1.getColumnModel().getColumn(1).setPreferredWidth(100);
            jtb1.getColumnModel().getColumn(2).setPreferredWidth(5);
            jtb1.getColumnModel().getColumn(3).setPreferredWidth(30);
            jtb1.getColumnModel().getColumn(4).setPreferredWidth(30);
            jtb1.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 390, 700, 160);

        adicionar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        adicionar.setText("Adicionar");
        adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarActionPerformed(evt);
            }
        });
        getContentPane().add(adicionar);
        adicionar.setBounds(340, 360, 90, 25);

        apagar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        apagar.setText("Apagar");
        apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarActionPerformed(evt);
            }
        });
        getContentPane().add(apagar);
        apagar.setBounds(460, 360, 90, 25);

        try {
            textoContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(textoContato);
        textoContato.setBounds(500, 140, 100, 19);

        try {
            textoNumeroRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(textoNumeroRg);
        textoNumeroRg.setBounds(240, 140, 200, 19);

        Fundo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Fundo.setForeground(new java.awt.Color(255, 255, 255));
        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/abstract-267054_960_720.png"))); // NOI18N
        Fundo.setText("Cadastro de Funcionario");
        getContentPane().add(Fundo);
        Fundo.setBounds(0, -10, 800, 640);

        setSize(new java.awt.Dimension(800, 653));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated

        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowDeactivated

    private void textoIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoIdadeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void textoProfissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoProfissaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoProfissaoActionPerformed

    private void textoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNomeActionPerformed

    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarActionPerformed

        String nome = textoNome.getText().trim();
        String numeroRg = textoNumeroRg.getText().trim();
        String idade = textoIdade.getText().trim();
        String contato = textoContato.getText().trim();
        String endereco = textoEndereco.getText().trim();
        String profissao = textoProfissao.getText();
        
        DefaultTableModel val = (DefaultTableModel) jtb1.getModel();
        val.addRow(new String[]{nome,numeroRg,idade,contato,endereco,profissao,});
        
        textoNome.setText("");
        textoNumeroRg.setText("");
        textoIdade.setText("");
        textoContato.setText("");
        textoEndereco.setText("");
        textoProfissao.setText("");
        textoNome.requestFocus();
        
        funcionario.add(new Funcionario(textoNome.getText(),textoNumeroRg.getText(),textoIdade.getText(),textoContato.getText(),
        textoEndereco.getText(),textoProfissao.getText()));
       
    }//GEN-LAST:event_adicionarActionPerformed

    private void apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarActionPerformed

        ((DefaultTableModel) jtb1.getModel()).removeRow(jtb1.getSelectedRow());
        
    }//GEN-LAST:event_apagarActionPerformed

    private void jtb1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jtb1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jtb1AncestorAdded

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new CadFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton adicionar;
    private javax.swing.JButton apagar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtb1;
    private javax.swing.JFormattedTextField textoContato;
    private javax.swing.JTextField textoEndereco;
    private javax.swing.JTextField textoIdade;
    private javax.swing.JTextField textoNome;
    private javax.swing.JFormattedTextField textoNumeroRg;
    private javax.swing.JTextField textoProfissao;
    // End of variables declaration//GEN-END:variables
}
