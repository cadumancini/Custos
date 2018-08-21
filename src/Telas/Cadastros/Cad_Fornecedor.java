/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Cadastros;

import Tabelas.Fornecedor;
import Tabelas.Produto;
import Telas.Consultas.ConsExis_Fornecedor;
import Util.HibernateUtil;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author cadum
 */
public class Cad_Fornecedor extends javax.swing.JFrame {
    private static Cad_Fornecedor instance = null;
    private Long id;
    Session conexao;
    Transaction tx;
    
    /**
     * Creates new form Cad_Fornecedor
     */
    public Cad_Fornecedor() {
        initComponents();
        id = -1L;
        habilitarCamposCadastro(false);
        TxtCodigo.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, Collections.EMPTY_SET); 
    }
    
    public static Cad_Fornecedor getInstance() {
      if (instance == null)
         instance = new Cad_Fornecedor();
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        LblCodigo = new javax.swing.JLabel();
        TxtCodigo = new javax.swing.JTextField();
        LblNome = new javax.swing.JLabel();
        TxtNome = new javax.swing.JTextField();
        LblEmail = new javax.swing.JLabel();
        TxtEmail = new javax.swing.JTextField();
        LblContato = new javax.swing.JLabel();
        TxtContato = new javax.swing.JTextField();
        LblCelular = new javax.swing.JLabel();
        LblFixo = new javax.swing.JLabel();
        BtnInserirAlterar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();
        BtnSair = new javax.swing.JButton();
        FTxtCelular = new javax.swing.JFormattedTextField();
        FTxtFixo = new javax.swing.JFormattedTextField();
        jSeparator3 = new javax.swing.JSeparator();
        BtnPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Fornecedores");

        LblCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LblCodigo.setText("Código:");

        TxtCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtCodigo.setNextFocusableComponent(TxtNome);
        TxtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCodigoKeyTyped(evt);
            }
        });

        LblNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LblNome.setText("Nome:");

        TxtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtNome.setNextFocusableComponent(TxtEmail);

        LblEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LblEmail.setText("E-mail:");

        TxtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtEmail.setNextFocusableComponent(TxtContato);

        LblContato.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblContato.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LblContato.setText("Contato:");

        TxtContato.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtContato.setNextFocusableComponent(FTxtCelular);

        LblCelular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblCelular.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LblCelular.setText("Celular:");

        LblFixo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblFixo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LblFixo.setText("Telefone Fixo:");

        BtnInserirAlterar.setText("Inserir");
        BtnInserirAlterar.setEnabled(false);
        BtnInserirAlterar.setNextFocusableComponent(BtnCancelar);
        BtnInserirAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInserirAlterarActionPerformed(evt);
            }
        });

        BtnCancelar.setText("Cancelar");
        BtnCancelar.setEnabled(false);
        BtnCancelar.setNextFocusableComponent(BtnExcluir);
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnExcluir.setText("Excluir");
        BtnExcluir.setEnabled(false);
        BtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirActionPerformed(evt);
            }
        });

        BtnSair.setText("Sair");
        BtnSair.setNextFocusableComponent(BtnSair);
        BtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSairActionPerformed(evt);
            }
        });

        try {
            FTxtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FTxtCelular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FTxtCelular.setNextFocusableComponent(FTxtFixo);

        try {
            FTxtFixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FTxtFixo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FTxtFixo.setNextFocusableComponent(BtnInserirAlterar);

        BtnPesquisar.setText("...");
        BtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 458, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnPesquisar))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(LblEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LblContato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LblCelular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LblFixo, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(LblNome, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(TxtNome)
                                                .addComponent(TxtEmail)
                                                .addComponent(TxtContato, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(FTxtFixo, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(FTxtCelular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnInserirAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BtnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BtnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(BtnSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LblCodigo))
                            .addComponent(BtnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblNome)
                            .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblContato)
                            .addComponent(TxtContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnInserirAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnSair)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCelular)
                    .addComponent(FTxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblFixo)
                    .addComponent(FTxtFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCodigoKeyTyped
        if(evt.getKeyChar()== KeyEvent.VK_ENTER || evt.getKeyChar() == KeyEvent.VK_TAB){
            if(!TxtCodigo.getText().isEmpty()){
                buscar(TxtCodigo.getText());
            } else{
                JOptionPane.showMessageDialog(this, "O campo de Código não deve ficar vazio!", "Erro", JOptionPane.OK_OPTION);
                TxtCodigo.requestFocusInWindow();
            }
        } else if(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE){
            if(TxtCodigo.getText().isEmpty()){
                limparCampos();
                habilitarCamposCadastro(false);
            }
        }
    }//GEN-LAST:event_TxtCodigoKeyTyped

    private void BtnInserirAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInserirAlterarActionPerformed
        if(TxtNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "O campo de Nome não deve ficar vazio!", "Erro", JOptionPane.OK_OPTION);
            TxtNome.requestFocusInWindow();
        } else{
            // Abrindo conexão:
            conexao = HibernateUtil.openSession();
            tx = conexao.beginTransaction();

            Fornecedor fornecedor = new Fornecedor();
            if(id != -1L)
                fornecedor.setID(id);
            fornecedor.setCodigo(TxtCodigo.getText());
            fornecedor.setNome(TxtNome.getText());
            fornecedor.setEmail(TxtEmail.getText());
            fornecedor.setContato(TxtContato.getText());
            fornecedor.setCelular(FTxtCelular.getText());
            fornecedor.setTelefoneFixo(FTxtFixo.getText());

            // Persistindo objeto:
            try {
                conexao.saveOrUpdate(fornecedor);
                tx.commit();
                TxtCodigo.requestFocusInWindow();
                TxtCodigo.selectAll();
                BtnExcluir.setEnabled(true);
                habilitarCamposCadastro(false);
                id = fornecedor.getID();

            } catch(Exception ex){
                tx.rollback();
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Operação mal sucedida. Motivo: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
            conexao.close();
        }
    }//GEN-LAST:event_BtnInserirAlterarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Tem certeza que deseja cancelar?", "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            limparCampos();
            habilitarCamposCadastro(false);
            BtnExcluir.setEnabled(false);
            id = -1L;
        }
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir?", "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            conexao = HibernateUtil.openSession();
            tx = conexao.beginTransaction();

            Fornecedor fornecedor = (Fornecedor) conexao.get(Fornecedor.class, id);

            // Checando se o fornecedor está ligado a algum produto:
            Criteria crit = conexao.createCriteria(Produto.class);
            Criterion rest1 = Restrictions.eq("Fornecedor1", fornecedor);
            Criterion rest2 = Restrictions.eq("Fornecedor2", fornecedor);
            Criterion rest3 = Restrictions.eq("Fornecedor3", fornecedor);
            crit.add(Restrictions.or(rest1, rest2, rest3));
            
            List results = crit.list();
            if(results.size() > 0)
            JOptionPane.showMessageDialog(this, "Impossível excluir. Fornecedor ligado a pelo menos um Produto.", "Erro", JOptionPane.ERROR_MESSAGE);
            else{
                try {
                    if(fornecedor != null){
                        conexao.delete(fornecedor);
                        tx.commit();
                    } else
                    JOptionPane.showMessageDialog(this, "Impossível excluir. Fornecedor não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
                    limparCampos();
                    habilitarCamposCadastro(false);
                    BtnExcluir.setEnabled(false);
                } catch(Exception ex){
                    tx.rollback();
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Operação mal sucedida. Motivo: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_BtnExcluirActionPerformed

    private void BtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSairActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Tem certeza que deseja sair?", "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            limparCampos();
            habilitarCamposCadastro(false);
            BtnExcluir.setEnabled(false);
            this.dispose();
        }
    }//GEN-LAST:event_BtnSairActionPerformed

    private void BtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesquisarActionPerformed
        ConsExis_Fornecedor janela = ConsExis_Fornecedor.getInstance();
        janela.setJanelaPai(this);
        janela.alimentarTabela();
        janela.setVisible(true);
    }//GEN-LAST:event_BtnPesquisarActionPerformed

    private void buscar(String codigo){
        habilitarCamposCadastro(true);
        try {
            conexao = HibernateUtil.openSession();
            Criteria crit = conexao.createCriteria(Fornecedor.class);
            crit.add(Restrictions.eq("Codigo", codigo));
            List results = crit.list();
            if(results.size() > 0){
                BtnInserirAlterar.setText("Alterar");
                BtnExcluir.setEnabled(true);
                Fornecedor fornecedor = (Fornecedor) results.get(0);
                TxtNome.setText(fornecedor.getNome());
                TxtEmail.setText(fornecedor.getEmail());
                TxtContato.setText(fornecedor.getContato());
                FTxtCelular.setText(fornecedor.getCelular());
                FTxtFixo.setText(fornecedor.getTelefoneFixo());
                id = fornecedor.getID();
            } else{
                BtnInserirAlterar.setText("Inserir");
                BtnExcluir.setEnabled(false);
                TxtNome.setText("");
                id = -1L;
            }
        } catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Operação mal sucedida. Motivo: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } 
        conexao.close();
        TxtNome.requestFocusInWindow();
        BtnInserirAlterar.setEnabled(true);
        BtnCancelar.setEnabled(true);
    }
    
    public void preencherCampos(String codigo){
        TxtCodigo.setText(codigo);
        buscar(codigo);
    }
    
    private void limparCampos(){
        TxtCodigo.setText("");
        TxtNome.setText("");
        TxtEmail.setText("");
        TxtContato.setText("");
        FTxtCelular.setText("");
        FTxtFixo.setText("");
        TxtCodigo.requestFocusInWindow();
        BtnInserirAlterar.setEnabled(false);
        BtnInserirAlterar.setText("Inserir");
        BtnCancelar.setEnabled(false);
    }
    
    private void habilitarCamposCadastro(boolean valor){
        LblNome.setEnabled(valor);
        TxtNome.setEnabled(valor);
        LblEmail.setEnabled(valor);
        TxtEmail.setEnabled(valor);
        LblContato.setEnabled(valor);
        TxtContato.setEnabled(valor);
        LblCelular.setEnabled(valor);
        FTxtCelular.setEnabled(valor);
        LblFixo.setEnabled(valor);
        FTxtFixo.setEnabled(valor);
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
            java.util.logging.Logger.getLogger(Cad_Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cad_Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cad_Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cad_Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cad_Fornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnInserirAlterar;
    private javax.swing.JButton BtnPesquisar;
    private javax.swing.JButton BtnSair;
    private javax.swing.JFormattedTextField FTxtCelular;
    private javax.swing.JFormattedTextField FTxtFixo;
    private javax.swing.JLabel LblCelular;
    private javax.swing.JLabel LblCodigo;
    private javax.swing.JLabel LblContato;
    private javax.swing.JLabel LblEmail;
    private javax.swing.JLabel LblFixo;
    private javax.swing.JLabel LblNome;
    private javax.swing.JTextField TxtCodigo;
    private javax.swing.JTextField TxtContato;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
