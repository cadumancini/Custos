/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Consultas;

import Tabelas.Componente;
import Tabelas.Produto;
import Util.HibernateUtil;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author cadum
 */
public class Cons_Estrutura extends javax.swing.JFrame {
    Session conexao;
    private static Cons_Estrutura instance = null;
    private int nivel;
    private String espaco;
    
    /**
     * Creates new form Cons_Estrutura
     */
    public Cons_Estrutura() {
        initComponents();
        limparCampos();
        TxtCodigo.requestFocusInWindow();
    }
    
    public static Cons_Estrutura getInstance() {
        if (instance == null)
           instance = new Cons_Estrutura();
      return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        LblCodigo = new javax.swing.JLabel();
        TxtCodigo = new javax.swing.JTextField();
        BtnPesquisarExis = new javax.swing.JButton();
        BtnPesquisar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        BtnSair = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtEstrutura = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Consulta de Estrutura");

        LblCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LblCodigo.setText("Modelo:");

        TxtCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        BtnPesquisarExis.setText("...");
        BtnPesquisarExis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPesquisarExisActionPerformed(evt);
            }
        });

        BtnPesquisar.setText("Pesquisar");
        BtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPesquisarActionPerformed(evt);
            }
        });

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnSair.setText("Sair");
        BtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSairActionPerformed(evt);
            }
        });

        TxtEstrutura.setEditable(false);
        TxtEstrutura.setColumns(20);
        TxtEstrutura.setRows(5);
        jScrollPane1.setViewportView(TxtEstrutura);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(LblCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnPesquisarExis, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BtnPesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BtnSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnPesquisarExis, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblCodigo)
                        .addComponent(TxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnSair)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnPesquisarExisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesquisarExisActionPerformed
        ConsExis_Produto janela = ConsExis_Produto.getInstance();
        janela.setJanelaPai(this, "CONS_ESTR");
        janela.alimentarTabela();
        janela.setVisible(true);
    }//GEN-LAST:event_BtnPesquisarExisActionPerformed

    private void BtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesquisarActionPerformed
        if(TxtCodigo.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "O código do Modelo não pode ficar em branco!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        conexao = HibernateUtil.openSession();
        TxtEstrutura.setText("");
        nivel = 0;
        Criteria crit = conexao.createCriteria(Produto.class).add(Restrictions.eq("Codigo", TxtCodigo.getText()));
        if(crit.list().isEmpty()){
            JOptionPane.showMessageDialog(this, "Nenhuma estrutura encontrada!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else{
            Produto prod = (Produto) crit.list().get(0);
            String cmpTxt = prod.getCodigo() + " - " + prod.getDescricao();
            TxtEstrutura.setText(cmpTxt);
            nivel++;
            estrutura(prod, cmpTxt);
        }
        conexao.close();
    }//GEN-LAST:event_BtnPesquisarActionPerformed

    public void estrutura(Produto prod, String cmpTxt){
        for(Componente cmp : prod.getComponentes()){
            espaco = "";
            for(int i = 0; i < nivel; i++)
                espaco += "  ";
            String strTmp = cmpTxt;
            cmpTxt = espaco + " '--> " + cmp.getComponente().getCodigo() + " - " 
                    + cmp.getComponente().getDescricao() + " -> Qtd.: " + cmp.getQuantidade().toString(); 
            Produto prod2 = (Produto) HibernateUtil.openSession().createCriteria(Produto.class)
                    .add(Restrictions.eq("Codigo", cmp.getComponente().getCodigo()))
                    .list().get(0);
            TxtEstrutura.setText(TxtEstrutura.getText() + "\r\n" + cmpTxt);
            if(prod2.getComponentes().size() > 0){
                prod = prod2;
                nivel++;
                estrutura(prod, cmpTxt);
                nivel--;
            } 
            cmpTxt = strTmp;
        }
    }
    
    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Tem certeza que deseja cancelar?", "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            limparCampos();
        }
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSairActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Tem certeza que deseja sair?", "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            limparCampos();
            this.dispose();
        }
    }//GEN-LAST:event_BtnSairActionPerformed

    public void preencherCampos(String codigo){
        TxtCodigo.setText(codigo);
    }
    
    private void limparCampos(){
        TxtCodigo.setText("");
        TxtEstrutura.setText("");
        TxtCodigo.requestFocusInWindow();
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
            java.util.logging.Logger.getLogger(Cons_Estrutura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cons_Estrutura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cons_Estrutura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cons_Estrutura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cons_Estrutura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnPesquisar;
    private javax.swing.JButton BtnPesquisarExis;
    private javax.swing.JButton BtnSair;
    private javax.swing.JLabel LblCodigo;
    private javax.swing.JTextField TxtCodigo;
    private javax.swing.JTextArea TxtEstrutura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
