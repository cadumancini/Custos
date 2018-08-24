/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Cadastros;

import Tabelas.Produto;
import Util.HibernateUtil;
import Telas.Consultas.ConsExis_Produto;
import java.awt.Component;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author cadum
 */
public class Cad_Estrutura extends javax.swing.JFrame {
    private static Cad_Estrutura instance = null;
    Session conexao;
    Transaction tx;
    
    /**
     * Creates new form Cad_Estrutura
     */
    public Cad_Estrutura() {
        initComponents();
        limparCampos();
        habilitarCamposCadastro(false);
        TxtCodigo.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, Collections.EMPTY_SET); 
    }
    
    public static Cad_Estrutura getInstance() {
        if (instance == null)
           instance = new Cad_Estrutura();
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        LblCodigo = new javax.swing.JLabel();
        TxtCodigo = new javax.swing.JTextField();
        BtnPesquisar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblEstrutura = new javax.swing.JTable();
        BtnInserirAlterar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();
        BtnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Estrutura");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Estrutura");

        LblCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LblCodigo.setText("Modelo:");

        TxtCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCodigoKeyTyped(evt);
            }
        });

        BtnPesquisar.setText("...");
        BtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPesquisarActionPerformed(evt);
            }
        });

        TblEstrutura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Seq.", "Componente", "Descrição", "Qtde. Uti."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblEstrutura);

        BtnInserirAlterar.setText("Alterar");
        BtnInserirAlterar.setEnabled(false);
        BtnInserirAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInserirAlterarActionPerformed(evt);
            }
        });

        BtnCancelar.setText("Cancelar");
        BtnCancelar.setEnabled(false);
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
        BtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(LblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnPesquisar)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnInserirAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BtnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BtnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(BtnSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnPesquisar)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LblCodigo)
                                .addComponent(TxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnInserirAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnSair)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCodigoKeyTyped
        if(evt.getKeyChar()== KeyEvent.VK_ENTER || evt.getKeyChar() == KeyEvent.VK_TAB){
            if(!TxtCodigo.getText().isEmpty()){
                buscar(TxtCodigo.getText());
            } else{
                JOptionPane.showMessageDialog(this, "O campo de Modelo não deve ficar vazio!", "Erro", JOptionPane.OK_OPTION);
                TxtCodigo.requestFocusInWindow();
            }
        } else if(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE){
            if(TxtCodigo.getText().isEmpty()){
                limparCampos();
                habilitarCamposCadastro(false);
            }
        }
    }//GEN-LAST:event_TxtCodigoKeyTyped

    private void BtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesquisarActionPerformed
        ConsExis_Produto janela = ConsExis_Produto.getInstance();
        janela.setJanelaPai(this, "CAD_ESTR");
        janela.alimentarTabela();
        janela.setVisible(true);
    }//GEN-LAST:event_BtnPesquisarActionPerformed

    private void BtnInserirAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInserirAlterarActionPerformed
        if(TxtDescricao.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "O campo de Descrição não deve ficar vazio!", "Erro", JOptionPane.OK_OPTION);
            TxtDescricao.requestFocusInWindow();
        } else{
            // Abrindo conexão:
            conexao = HibernateUtil.openSession();
            tx = conexao.beginTransaction();

            Produto produto = new Produto();
            if(id != -1L)
            produto.setID(id);
            produto.setCodigo(TxtCodigo.getText());
            produto.setDescricao(TxtDescricao.getText());

            // Grupo:
            if(CmbGrupo.getSelectedIndex() > 0){
                // Buscar grupo correspondente:
                String codGrupo = CmbGrupo.getSelectedItem().toString();
                Criteria crit = conexao.createCriteria(GrupoProduto.class);
                crit.add(Restrictions.eq("Codigo", codGrupo));
                List results = crit.list();
                if(results.size() > 0){
                    GrupoProduto grupo = (GrupoProduto) results.get(0);
                    produto.setGrupo(grupo);
                }
            } else
            produto.setGrupo(null);

            // Fornecedor 1:
            if(CmbFornecedor1.getSelectedIndex() > 0){
                // Buscar grupo correspondente:
                String codFornecedor = CmbFornecedor1.getSelectedItem().toString();
                Criteria crit = conexao.createCriteria(Fornecedor.class);
                crit.add(Restrictions.eq("Codigo", codFornecedor));
                List results = crit.list();
                if(results.size() > 0){
                    Fornecedor fornec = (Fornecedor) results.get(0);
                    produto.setFornecedor1(fornec);
                }
            } else
            produto.setFornecedor1(null);

            // Fornecedor 2:
            if(CmbFornecedor2.getSelectedIndex() > 0){
                // Buscar grupo correspondente:
                String codFornecedor = CmbFornecedor2.getSelectedItem().toString();
                Criteria crit = conexao.createCriteria(Fornecedor.class);
                crit.add(Restrictions.eq("Codigo", codFornecedor));
                List results = crit.list();
                if(results.size() > 0){
                    Fornecedor fornec = (Fornecedor) results.get(0);
                    produto.setFornecedor2(fornec);
                }
            } else
            produto.setFornecedor2(null);

            // Fornecedor 3:
            if(CmbFornecedor3.getSelectedIndex() > 0){
                // Buscar grupo correspondente:
                String codFornecedor = CmbFornecedor3.getSelectedItem().toString();
                Criteria crit = conexao.createCriteria(Fornecedor.class);
                crit.add(Restrictions.eq("Codigo", codFornecedor));
                List results = crit.list();
                if(results.size() > 0){
                    Fornecedor fornec = (Fornecedor) results.get(0);
                    produto.setFornecedor3(fornec);
                }
            } else
            produto.setFornecedor3(null);

            produto.setUnidadeMedida(CmbUniMed.getSelectedItem().toString().replace(',', '.'));
            produto.setAtivo(ChkAtivo.isSelected());
            if(!FTxtPrecoVenda.getText().isEmpty())
            produto.setPrecoVenda(Double.valueOf(FTxtPrecoVenda.getText().replace(',', '.')));
            if(!FTxtPrecoCusto.getText().isEmpty())
            produto.setPrecoCusto(Double.valueOf(FTxtPrecoCusto.getText().replace(',', '.')));
            if(!FTxtDevVendas.getText().isEmpty())
            produto.setDevolucoesVendas(Double.valueOf(FTxtDevVendas.getText().replace(',', '.')));
            if(!FTxtAbatVendas.getText().isEmpty())
            produto.setAbatimentosVendas(Double.valueOf(FTxtAbatVendas.getText().replace(',', '.')));
            if(!FTxtComVendas.getText().isEmpty())
            produto.setComissoesVendas(Double.valueOf(FTxtComVendas.getText().replace(',', '.')));
            if(!FTxtIcmsVendas.getText().isEmpty())
            produto.setIcmsVendas(Double.valueOf(FTxtIcmsVendas.getText().replace(',', '.')));
            if(!FTxtIpiVendas.getText().isEmpty())
            produto.setIpiVendas(Double.valueOf(FTxtIpiVendas.getText().replace(',', '.')));
            if(!FTxtPisVendas.getText().isEmpty())
            produto.setPisVendas(Double.valueOf(FTxtPisVendas.getText().replace(',', '.')));
            if(!FTxtCofinsVendas.getText().isEmpty())
            produto.setCofinsVendas(Double.valueOf(FTxtCofinsVendas.getText().replace(',', '.')));
            if(!FTxtSimplesVendas.getText().isEmpty())
            produto.setSimplesVendas(Double.valueOf(FTxtSimplesVendas.getText().replace(',', '.')));
            if(!FTxtIssVendas.getText().isEmpty())
            produto.setIssVendas(Double.valueOf(FTxtIssVendas.getText().replace(',', '.')));
            if(!FTxtIrVendas.getText().isEmpty())
            produto.setIrVendas(Double.valueOf(FTxtIrVendas.getText().replace(',', '.')));
            if(!FTxtCsllVendas.getText().isEmpty())
            produto.setCsllVendas(Double.valueOf(FTxtCsllVendas.getText().replace(',', '.')));
            if(!FTxtEmbalagem.getText().isEmpty())
            produto.setEmbalagem(Double.valueOf(FTxtEmbalagem.getText().replace(',', '.')));
            if(!FTxtFrete.getText().isEmpty())
            produto.setFreteVendas(Double.valueOf(FTxtFrete.getText().replace(',', '.')));
            if(!FTxtOutrosInsumos.getText().isEmpty())
            produto.setOutrosInsumos(Double.valueOf(FTxtOutrosInsumos.getText().replace(',', '.')));
            if(!FTxtMargemContrib.getText().isEmpty())
            produto.setMargemContrib(Double.valueOf(FTxtMargemContrib.getText().replace(',', '.')));
            if(!TxtNcm.getText().isEmpty())
            produto.setNcm(TxtNcm.getText());

            // Persistindo objeto:
            try {
                conexao.saveOrUpdate(produto);
                tx.commit();
                TxtCodigo.requestFocusInWindow();
                TxtCodigo.selectAll();
                BtnExcluir.setEnabled(true);
                habilitarCamposCadastro(false);
                id = produto.getID();

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
        }
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir?", "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            conexao = HibernateUtil.openSession();
            tx = conexao.beginTransaction();

            Produto produto = (Produto) conexao.get(Produto.class, id);

            // Checando se o produto está ligado a alguma tabela:
            /*
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
            */
            try {
                if(produto != null){
                    conexao.delete(produto);
                    tx.commit();
                } else
                JOptionPane.showMessageDialog(this, "Impossível excluir. Produto não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
                limparCampos();
                habilitarCamposCadastro(false);
                BtnExcluir.setEnabled(false);
            } catch(Exception ex){
                tx.rollback();
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Operação mal sucedida. Motivo: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
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

    private void buscar(String codigo){
        habilitarCamposCadastro(true);
        try {
            conexao = HibernateUtil.openSession();
            Criteria crit = conexao.createCriteria(Produto.class);
            crit.add(Restrictions.eq("Codigo", codigo));
            List results = crit.list();
            if(results.size() > 0){
                BtnInserirAlterar.setText("Alterar");
                BtnExcluir.setEnabled(true);
                Produto produto = (Produto) results.get(0);
                TxtDescricao.setText(produto.getDescricao());
                if(produto.getGrupo() != null)
                    CmbGrupo.setSelectedItem(produto.getGrupo().getCodigo());
                else
                    CmbGrupo.setSelectedItem(0);
                if(produto.getFornecedor1()!= null)
                    CmbFornecedor1.setSelectedItem(produto.getFornecedor1().getCodigo());
                else
                    CmbFornecedor1.setSelectedItem(0);
                if(produto.getFornecedor2()!= null)
                    CmbFornecedor2.setSelectedItem(produto.getFornecedor2().getCodigo());
                else
                    CmbFornecedor1.setSelectedItem(0);
                if(produto.getFornecedor3()!= null)
                    CmbFornecedor3.setSelectedItem(produto.getFornecedor3().getCodigo());
                else
                    CmbFornecedor3.setSelectedItem(0);
                CmbUniMed.setSelectedItem(produto.getUnidadeMedida());
                ChkAtivo.setSelected(produto.isAtivo());
                if(produto.getPrecoVenda() != null){
                    FTxtPrecoVenda.setText(produto.getPrecoVenda().toString().replace('.', ','));
                    if(produto.getPrecoVenda() - produto.getPrecoVenda().intValue() == 0)
                        FTxtPrecoVenda.setText(FTxtPrecoVenda.getText() + "0");
                }
                else
                    FTxtPrecoVenda.setText("0,00");
                if(produto.getPrecoCusto() != null){
                    FTxtPrecoCusto.setText(produto.getPrecoCusto().toString().replace('.', ','));
                    if(produto.getPrecoCusto() - produto.getPrecoCusto().intValue() == 0)
                        FTxtPrecoCusto.setText(FTxtPrecoCusto.getText() + "0");
                }
                else
                    FTxtPrecoCusto.setText("0,00");
                if(produto.getDevolucoesVendas()!= null)
                    FTxtDevVendas.setText(produto.getDevolucoesVendas().toString().replace('.', ','));
                else
                    FTxtDevVendas.setText("0,00");
                if(produto.getAbatimentosVendas()!= null)
                    FTxtAbatVendas.setText(produto.getAbatimentosVendas().toString().replace('.', ','));
                else
                    FTxtAbatVendas.setText("0,00");
                if(produto.getComissoesVendas()!= null)
                    FTxtComVendas.setText(produto.getComissoesVendas().toString().replace('.', ','));
                else
                    FTxtComVendas.setText("0,00");
                if(produto.getIcmsVendas()!= null)
                    FTxtIcmsVendas.setText(produto.getIcmsVendas().toString().replace('.', ','));
                else
                    FTxtIcmsVendas.setText("0,00");
                if(produto.getIpiVendas()!= null)
                    FTxtIpiVendas.setText(produto.getIpiVendas().toString().replace('.', ','));
                else
                    FTxtIpiVendas.setText("0,00");
                if(produto.getPisVendas()!= null)
                    FTxtPisVendas.setText(produto.getPisVendas().toString().replace('.', ','));
                else
                    FTxtPisVendas.setText("0,00");
                if(produto.getCofinsVendas()!= null)
                    FTxtCofinsVendas.setText(produto.getCofinsVendas().toString().replace('.', ','));
                else
                    FTxtCofinsVendas.setText("0,00");
                if(produto.getSimplesVendas()!= null)
                    FTxtSimplesVendas.setText(produto.getSimplesVendas().toString().replace('.', ','));
                else
                    FTxtSimplesVendas.setText("0,00");
                if(produto.getIssVendas()!= null)
                    FTxtIssVendas.setText(produto.getIssVendas().toString().replace('.', ','));
                else
                    FTxtIssVendas.setText("0,00");
                if(produto.getIrVendas()!= null)
                    FTxtIrVendas.setText(produto.getIrVendas().toString().replace('.', ','));
                else
                    FTxtIrVendas.setText("0,00");
                if(produto.getCsllVendas()!= null)
                    FTxtCsllVendas.setText(produto.getCsllVendas().toString().replace('.', ','));
                else
                    FTxtCsllVendas.setText("0,00");
                if(produto.getEmbalagem() != null)
                    FTxtEmbalagem.setText(produto.getEmbalagem().toString().replace('.', ','));
                else
                    FTxtEmbalagem.setText("0,00");
                if(produto.getFreteVendas()!= null)
                    FTxtFrete.setText(produto.getFreteVendas().toString().replace('.', ','));
                else
                    FTxtFrete.setText("0,00");
                if(produto.getOutrosInsumos() != null)
                    FTxtOutrosInsumos.setText(produto.getOutrosInsumos().toString().replace('.', ','));
                else
                    FTxtOutrosInsumos.setText("0,00");
                if(produto.getMargemContrib()!= null){
                    FTxtMargemContrib.setText(produto.getMargemContrib().toString().replace('.', ','));
                    if(produto.getMargemContrib() - produto.getMargemContrib().intValue() == 0)
                        FTxtMargemContrib.setText(FTxtMargemContrib.getText() + "0");
                }
                else
                    FTxtMargemContrib.setText("0,00");
                TxtNcm.setText(produto.getNcm());
                id = produto.getID();
            } else{
                BtnInserirAlterar.setText("Inserir");
                BtnExcluir.setEnabled(false);
                TxtDescricao.setText("");
                CmbGrupo.setSelectedIndex(0);
                CmbFornecedor1.setSelectedIndex(0);
                CmbFornecedor2.setSelectedIndex(0);
                CmbFornecedor3.setSelectedIndex(0);
                CmbUniMed.setSelectedIndex(0);
                ChkAtivo.setSelected(false);
                FTxtPrecoVenda.setText("0,00");
                FTxtPrecoCusto.setText("0,00");
                FTxtDevVendas.setText("0,00");
                FTxtAbatVendas.setText("0,00");
                FTxtComVendas.setText("0,00");
                FTxtIcmsVendas.setText("0,00");
                FTxtIpiVendas.setText("0,00");
                FTxtPisVendas.setText("0,00");
                FTxtCofinsVendas.setText("0,00");
                FTxtSimplesVendas.setText("0,00");
                FTxtIssVendas.setText("0,00");
                FTxtIrVendas.setText("0,00");
                FTxtCsllVendas.setText("0,00");
                FTxtEmbalagem.setText("0,00");
                FTxtFrete.setText("0,00");
                FTxtOutrosInsumos.setText("0,00");
                FTxtMargemContrib.setText("0,00");
                TxtNcm.setText("");
                id = -1L;
            }
        } catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Operação mal sucedida. Motivo: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } 
        conexao.close();
        TxtDescricao.requestFocusInWindow();
        BtnInserirAlterar.setEnabled(true);
        BtnCancelar.setEnabled(true);
    }
    
    public void resizeColumnWidth(JTable table) {
        final TableColumnModel columnModel = table.getColumnModel();
        for (int column = 0; column < table.getColumnCount(); column++) {
            int width = 50; // Min width
            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer renderer = table.getCellRenderer(row, column);
                Component comp = table.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width, width);
            }
            columnModel.getColumn(column).setPreferredWidth(width);
        }
    }
    
    public void preencherCampos(String codigo){
        TxtCodigo.setText(codigo);
        buscar(codigo);
    }
    
    private void limparTabela(){
        int x = TblEstrutura.getRowCount();
        DefaultTableModel model = (DefaultTableModel) TblEstrutura.getModel();
        for(int i = 0; i < x; i++)
            model.removeRow(0);
    }
    
    private void limparCampos(){
        TxtCodigo.setText("");
        limparTabela();
        TxtCodigo.requestFocusInWindow();
        BtnInserirAlterar.setEnabled(false);
        BtnCancelar.setEnabled(false);
    }
    
    private void habilitarCamposCadastro(boolean valor){
        TblEstrutura.setEnabled(valor);
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
            java.util.logging.Logger.getLogger(Cad_Estrutura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cad_Estrutura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cad_Estrutura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cad_Estrutura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cad_Estrutura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnInserirAlterar;
    private javax.swing.JButton BtnPesquisar;
    private javax.swing.JButton BtnSair;
    private javax.swing.JLabel LblCodigo;
    private javax.swing.JTable TblEstrutura;
    private javax.swing.JTextField TxtCodigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}