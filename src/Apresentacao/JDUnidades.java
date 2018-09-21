/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apresentacao;

import Entidades.Unidades;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import meuprograma.ValidaCNPJ;
import negocio.NegocioException;
import negocio.UnidadesBO;

/**
 *
 * @author Wallace
 */
public class JDUnidades extends javax.swing.JDialog {

    /**
     * Creates new form JDUnidades
     */
   public static JFIEmpresas empresa;
    public JDUnidades(JFIEmpresas parent, boolean modal) {
        //super(parent, modal);
        this.empresa=parent;
        this.setModal(true);
        initComponents();
        lblid.setText(empresa.getLblid().getText());
        lblnomefantasia.setText(empresa.getTxtnomefantasia().getText());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpanelEmpresas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcnpj = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnomeunidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        chkativa = new javax.swing.JCheckBox();
        lblnomefantasia = new javax.swing.JLabel();
        chkmatriz = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        lblidunidade = new javax.swing.JLabel();
        btnalterar = new javax.swing.JButton();
        btnconsultar = new javax.swing.JButton();
        btnnova = new javax.swing.JButton();
        btnsalvar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JpanelEmpresas.setEnabled(false);

        jLabel2.setText("Nome Fantasia:");

        jLabel3.setText("CNPJ:");

        txtcnpj.setEnabled(false);
        txtcnpj.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcnpjFocusLost(evt);
            }
        });

        jLabel4.setText("Nome Unidade:");

        txtnomeunidade.setEnabled(false);

        jLabel1.setText("ID Empresa:");

        lblid.setText(" ");

        chkativa.setText("ATIVA");
        chkativa.setEnabled(false);
        chkativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkativaActionPerformed(evt);
            }
        });

        chkmatriz.setText("Matriz");
        chkmatriz.setEnabled(false);

        jLabel6.setText("ID Unidade:");

        javax.swing.GroupLayout JpanelEmpresasLayout = new javax.swing.GroupLayout(JpanelEmpresas);
        JpanelEmpresas.setLayout(JpanelEmpresasLayout);
        JpanelEmpresasLayout.setHorizontalGroup(
            JpanelEmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelEmpresasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpanelEmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpanelEmpresasLayout.createSequentialGroup()
                        .addGroup(JpanelEmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGroup(JpanelEmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JpanelEmpresasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JpanelEmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtcnpj, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                    .addGroup(JpanelEmpresasLayout.createSequentialGroup()
                                        .addComponent(chkativa)
                                        .addGap(18, 18, 18)
                                        .addComponent(chkmatriz))
                                    .addComponent(txtnomeunidade)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelEmpresasLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblnomefantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JpanelEmpresasLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblid)
                        .addGap(131, 131, 131)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(lblidunidade, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JpanelEmpresasLayout.setVerticalGroup(
            JpanelEmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelEmpresasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JpanelEmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblid)
                    .addComponent(jLabel6)
                    .addComponent(lblidunidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpanelEmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblnomefantasia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpanelEmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JpanelEmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnomeunidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JpanelEmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkativa)
                    .addComponent(chkmatriz))
                .addGap(213, 213, 213))
        );

        btnalterar.setText("ALTERAR");
        btnalterar.setEnabled(false);
        btnalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalterarActionPerformed(evt);
            }
        });

        btnconsultar.setText("CONSULTAR");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });

        btnnova.setText("NOVA");
        btnnova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovaActionPerformed(evt);
            }
        });

        btnsalvar.setText("SALVAR");
        btnsalvar.setEnabled(false);
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });

        btncancelar.setText("CANCELAR");
        btncancelar.setEnabled(false);
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("CADASTRO DE UNIDADES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpanelEmpresas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnnova)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnconsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnalterar)
                .addGap(18, 18, 18)
                .addComponent(btncancelar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(JpanelEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnova)
                    .addComponent(btnsalvar)
                    .addComponent(btnconsultar)
                    .addComponent(btnalterar)
                    .addComponent(btncancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        btnnova.setEnabled(true);
        btnsalvar.setEnabled(false);
        btnconsultar.setEnabled(true);
        btnalterar.setEnabled(false);
        btncancelar.setEnabled(false);
        //txtnomefantasia.setText("");
        txtcnpj.setText("");
        txtnomeunidade.setText("");
        JpanelEmpresas.setEnabled(true);
        lblid.setText("");

        Component[] componentes =  JpanelEmpresas.getComponents(); // altere para o nome da variavel do seu painel
        for (Component componente : componentes) {
            componente.setEnabled(false);
    }//GEN-LAST:event_btncancelarActionPerformed
    }
    private void btnalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalterarActionPerformed
        //TODO add your handling code here:
        Unidades unidade= new Unidades();
        unidade.setIdempresa(Integer.parseInt(lblid.getText()));
        unidade.setCNPJ(txtcnpj.getText());
        unidade.setNomeUnidade(txtnomeunidade.getText());
        unidade.setAtiva(chkativa.isSelected());
        unidade.setMatriz(chkmatriz.isSelected());
        unidade.setId(Integer.parseInt(lblidunidade.getText()));
        UnidadesBO bo = new UnidadesBO();
        try{
            
                bo.alterar(unidade);
                btnnova.setEnabled(true);
                btnsalvar.setEnabled(false);
                btnconsultar.setEnabled(true);
                btnalterar.setEnabled(false);
                btncancelar.setEnabled(false);
                txtcnpj.setText("");
                txtnomeunidade.setText("");
                chkativa.setSelected(false);
                chkmatriz.setSelected(false);
                JpanelEmpresas.setEnabled(true);

                Component[] componentes =  JpanelEmpresas.getComponents(); // altere para o nome da variavel do seu painel
                for (Component componente : componentes) {
                    componente.setEnabled(false);
                }
            empresa.setLblid(lblid.getText());

        }catch(NegocioException e){
            JOptionPane.showMessageDialog(null,e.getMessage() ,"Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnalterarActionPerformed

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        // TODO add your handling code here:
        int idconsulta = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID da Unidade"));
        UnidadesBO bo = new UnidadesBO();
        try {

            Unidades unidade=bo.consultar(idconsulta,Integer.parseInt(lblid.getText()));
            lblid.setText(Integer.toString(unidade.getIdempresa()));
            
            txtcnpj.setText(unidade.getCNPJ());
            txtnomeunidade.setText(unidade.getNomeUnidade());
            chkativa.setSelected(unidade.isAtiva());
            chkmatriz.setSelected(unidade.isMatriz());
            lblidunidade.setText(Integer.toString(unidade.getId()));
            btnnova.setEnabled(false);
            btnsalvar.setEnabled(false);
            btnconsultar.setEnabled(false);
            btnalterar.setEnabled(true);
            btncancelar.setEnabled(true);
            Component[] componentes =  JpanelEmpresas.getComponents(); // altere para o nome da variavel do seu painel
            for (Component componente : componentes) {
                componente.setEnabled(true);
            }
        } catch (NegocioException ex) {
            Logger.getLogger(JDUnidades.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnconsultarActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        // TODO add your handling code here:
        Unidades unidade= new Unidades();
        unidade.setIdempresa(Integer.parseInt(lblid.getText()));
        unidade.setCNPJ(txtcnpj.getText());
        unidade.setNomeUnidade(txtnomeunidade.getText());
        unidade.setAtiva(chkativa.isSelected());
        unidade.setMatriz(chkmatriz.isSelected());
        UnidadesBO bo = new UnidadesBO();
        try{
            
                bo.inserir(unidade);
                btnnova.setEnabled(true);
                btnsalvar.setEnabled(false);
                btnconsultar.setEnabled(true);
                btnalterar.setEnabled(false);
                btncancelar.setEnabled(false);
                txtcnpj.setText("");
                txtnomeunidade.setText("");
                chkativa.setSelected(false);
                chkmatriz.setSelected(false);
                JpanelEmpresas.setEnabled(true);

                Component[] componentes =  JpanelEmpresas.getComponents(); // altere para o nome da variavel do seu painel
                for (Component componente : componentes) {
                    componente.setEnabled(false);
                }
            empresa.setLblid(lblid.getText());

        }catch(NegocioException e){
            JOptionPane.showMessageDialog(null,e.getMessage() ,"Aviso", JOptionPane.WARNING_MESSAGE);
        } 
    }//GEN-LAST:event_btnsalvarActionPerformed

    private void btnnovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovaActionPerformed
        // TODO add your handling code here:
        btnnova.setEnabled(false);
        btnsalvar.setEnabled(true);
        btnconsultar.setEnabled(false);
        btnalterar.setEnabled(false);
        btncancelar.setEnabled(true);
        //txtnomefantasia.setText("");
        txtcnpj.setText("");
        txtnomeunidade.setText("");
        JpanelEmpresas.setEnabled(true);
        txtnomeunidade.setEnabled(true);
        Component[] componentes =  JpanelEmpresas.getComponents(); // altere para o nome da variavel do seu painel
        for (Component componente : componentes) {
            componente.setEnabled(true);
    }//GEN-LAST:event_btnnovaActionPerformed
        txtnomeunidade.setEnabled(true);
        txtnomeunidade.setEditable(true);
    }
    private void chkativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkativaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkativaActionPerformed

    private void txtcnpjFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcnpjFocusLost
        // TODO add your handling code here:
        if(ValidaCNPJ.isCNPJ(txtcnpj.getText())){
           // txtcnpj.setText(ValidaCNPJ.imprimeCNPJ(txtcnpj.getText()));
    }//GEN-LAST:event_txtcnpjFocusLost
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
            java.util.logging.Logger.getLogger(JDUnidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDUnidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDUnidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDUnidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDUnidades dialog = new JDUnidades(empresa, true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        
                        System.exit(0);
                        
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpanelEmpresas;
    private javax.swing.JButton btnalterar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btnnova;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JCheckBox chkativa;
    private javax.swing.JCheckBox chkmatriz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblidunidade;
    private javax.swing.JLabel lblnomefantasia;
    private javax.swing.JTextField txtcnpj;
    private javax.swing.JTextField txtnomeunidade;
    // End of variables declaration//GEN-END:variables
}
