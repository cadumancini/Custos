/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Consultas;

import Tabelas.GrupoProduto;
import Tabelas.Produto;
import Telas.Cadastros.Cad_Produto;
import Util.HibernateUtil;
import java.awt.Component;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author cemancini
 */
public class Cons_Produto extends javax.swing.JFrame {
    Session conexao;
    private static Cons_Produto instance = null;
    
    /**
     * Creates new form Cons_Produto
     */
    public Cons_Produto() {
        initComponents();
    }

    public static Cons_Produto getInstance() {
        if (instance == null)
           instance = new Cons_Produto();
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
        LblCodigo1 = new javax.swing.JLabel();
        CmbDescricao = new javax.swing.JComboBox<>();
        TxtDescricao = new javax.swing.JTextField();
        LblCodigo2 = new javax.swing.JLabel();
        CmbGrupo = new javax.swing.JComboBox<>();
        LblCodigo3 = new javax.swing.JLabel();
        CmbAtivo = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        BtnCancelar = new javax.swing.JButton();
        BtnSair = new javax.swing.JButton();
        BtnPesquisar = new javax.swing.JButton();
        BtnCadastro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblProdutos = new javax.swing.JTable();
        BtnPesquisarExis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Consulta de Produtos");

        LblCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LblCodigo.setText("Código:");

        TxtCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtCodigo.setNextFocusableComponent(CmbDescricao);

        LblCodigo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblCodigo1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LblCodigo1.setText("Descrição:");

        CmbDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CmbDescricao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "É exatamente", "Começa com", "Contém", "Termina com" }));
        CmbDescricao.setNextFocusableComponent(TxtDescricao);

        TxtDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtDescricao.setNextFocusableComponent(CmbGrupo);

        LblCodigo2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblCodigo2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LblCodigo2.setText("Grupo:");

        CmbGrupo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CmbGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CmbGrupo.setNextFocusableComponent(CmbAtivo);

        LblCodigo3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblCodigo3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LblCodigo3.setText("Ativo:");

        CmbAtivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CmbAtivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Sim", "Não" }));

        BtnCancelar.setText("Cancelar");
        BtnCancelar.setNextFocusableComponent(BtnSair);
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnSair.setText("Sair");
        BtnSair.setNextFocusableComponent(TxtCodigo);
        BtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSairActionPerformed(evt);
            }
        });

        BtnPesquisar.setText("Pesquisar");
        BtnPesquisar.setNextFocusableComponent(BtnCancelar);
        BtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPesquisarActionPerformed(evt);
            }
        });

        BtnCadastro.setText("Cadastro");
        BtnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastroActionPerformed(evt);
            }
        });

        TblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Grupo", "Fornecedor 1", "Fornecedor 2", "Fornecedor 3", "Uni. Med.", "Ativo", "Preço Venda (R$)", "Preço Custo (R$)", "Devoluções Vendas (%)", "Abatimentos Vendas (%)", "Comissões Vendas (%)", "ICMS Vendas (%)", "IPI Vendas (%)", "PIS Vendas (%)", "Cofins Vendas (%)", "Simples Vendas (%)", "ISS Vendas (%)", "IR Vendas (%)", "CSLL Vendas (%)", "Embalagem (%)", "Frete Vendas (%)", "Outros Insumos (%)", "Margem Contribuição (R$)", "NCM", "Nível"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblProdutos.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(TblProdutos);
        TblProdutos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        BtnPesquisarExis.setText("...");
        BtnPesquisarExis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPesquisarExisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(BtnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnPesquisarExis, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(LblCodigo2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CmbGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblCodigo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CmbDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblCodigo3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CmbAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnSair)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblCodigo)
                            .addComponent(TxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CmbDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblCodigo1)
                            .addComponent(BtnPesquisarExis, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CmbGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblCodigo3)
                            .addComponent(CmbAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblCodigo2))
                        .addGap(37, 37, 37)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnCadastro)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Tem certeza que deseja cancelar?", "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            limparCampos();
            limparTabela();
        }
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSairActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Tem certeza que deseja sair?", "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            limparCampos();
            this.dispose();
        }
    }//GEN-LAST:event_BtnSairActionPerformed

    private void BtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesquisarActionPerformed
        conexao = HibernateUtil.openSession();
        
        limparTabela();
        DefaultTableModel model = (DefaultTableModel) TblProdutos.getModel();
        
        String codigo = TxtCodigo.getText();
        String descricao = TxtDescricao.getText();
        boolean ativo;
        
        Criteria crit = conexao.createCriteria(Produto.class);
        if(!codigo.isEmpty())
            crit.add(Restrictions.eq("Codigo", codigo));
        if(!descricao.isEmpty()){
            switch(CmbDescricao.getSelectedIndex()){
                case 0:
                    //É exatamente
                    crit.add(Restrictions.eq("Descricao", descricao));
                    break;
                case 1:
                    //Começa com
                    crit.add(Restrictions.like("Descricao", descricao, MatchMode.START));
                    break;
                case 2:
                    //Contém
                    crit.add(Restrictions.like("Descricao", descricao, MatchMode.ANYWHERE));
                    break;
                default:
                    //Termina com
                    crit.add(Restrictions.like("Descricao", descricao, MatchMode.END));
                    break;
            }
        }
        if(CmbGrupo.getSelectedIndex() > 0)
            crit.add(Restrictions.eq("Grupo", (GrupoProduto) conexao.createCriteria(GrupoProduto.class).add(Restrictions.eq("Codigo", CmbGrupo.getSelectedItem())).list().get(0)));
        if(CmbAtivo.getSelectedIndex() > 0){
            if(CmbAtivo.getSelectedIndex() == 1)
                ativo = true;
            else
                ativo = false;
            crit.add(Restrictions.eq("Ativo", ativo));
        }
        
        crit.addOrder(Order.asc("Codigo"));
        
        List<Produto> produtos = crit.list();
        if(produtos.isEmpty())
            JOptionPane.showMessageDialog(this, "Nenhum produto encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
        else{
            for(Produto prod : produtos){
                codigo = prod.getCodigo();
                descricao = prod.getDescricao();
                String grupo = "", forn1 = "", forn2 = "", forn3 = "";
                if(prod.getGrupo() != null)
                    grupo = prod.getGrupo().getDescricao();
                if(prod.getFornecedor1() != null)
                    forn1 = prod.getFornecedor1().getNome();
                if(prod.getFornecedor2() != null)
                    forn2 = prod.getFornecedor2().getNome();
                if(prod.getFornecedor3() != null)
                    forn3 = prod.getFornecedor3().getNome();
                String uniMed = prod.getUnidadeMedida();
                String prodAtivo = "Não";
                if(prod.isAtivo())
                    prodAtivo = "Sim";
                Double precVen = 0D, precCus = 0D, devVen = 0D, abatVen = 0D, comiVen = 0D, icmsVen = 0D,
                        ipiVen = 0D, pisVen = 0D, cofVen = 0D, simVen = 0D, issVen = 0D, irVen = 0D, csllVen = 0D,
                        embal = 0D, freVen = 0D, outIns = 0D, marCon = 0D;
                String ncm = "";
                Long nivel = 0L;
                if(prod.getPrecoVenda() != null)
                    precVen = prod.getPrecoVenda();
                if(prod.getPrecoCusto() != null)
                    precCus = prod.getPrecoCusto();
                if(prod.getDevolucoesVendas()!= null)
                    devVen = prod.getDevolucoesVendas();
                if(prod.getAbatimentosVendas()!= null)
                    abatVen = prod.getAbatimentosVendas();
                if(prod.getComissoesVendas()!= null)
                    comiVen = prod.getComissoesVendas();
                if(prod.getIcmsVendas()!= null)
                    icmsVen = prod.getIcmsVendas();
                if(prod.getIpiVendas()!= null)
                    ipiVen = prod.getIpiVendas();
                if(prod.getPisVendas()!= null)
                    pisVen = prod.getPisVendas();
                if(prod.getCofinsVendas()!= null)
                    cofVen = prod.getCofinsVendas();
                if(prod.getSimplesVendas()!= null)
                    simVen = prod.getSimplesVendas();
                if(prod.getIssVendas()!= null)
                    issVen = prod.getIssVendas();
                if(prod.getIrVendas()!= null)
                    irVen = prod.getIrVendas();
                if(prod.getCsllVendas()!= null)
                    csllVen = prod.getCsllVendas();
                if(prod.getEmbalagem()!= null)
                    embal = prod.getEmbalagem();
                if(prod.getFreteVendas()!= null)
                    freVen = prod.getFreteVendas();
                if(prod.getOutrosInsumos()!= null)
                    outIns = prod.getOutrosInsumos();
                if(prod.getMargemContrib()!= null)
                    marCon = prod.getMargemContrib();
                if(prod.getNcm()!= null)
                    ncm = prod.getNcm();
                if(prod.getNivel() != null)
                    nivel = prod.getNivel();
                
                Object[] linha = new Object[]{codigo, descricao, grupo, forn1, forn2, forn3, uniMed, prodAtivo, precVen, precCus, devVen, abatVen, comiVen,
                                                icmsVen, ipiVen, pisVen, cofVen, simVen, issVen, irVen, csllVen, embal, freVen, outIns, marCon, ncm, nivel};
                model.addRow(linha);
            }
            resizeColumnWidth(TblProdutos);
        }
        
        conexao.close();
    }//GEN-LAST:event_BtnPesquisarActionPerformed

    private void BtnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastroActionPerformed
        if(TblProdutos.getSelectedRow() < 0)
            JOptionPane.showMessageDialog(this, "Nenhum produto selecionado!", "Erro", JOptionPane.ERROR_MESSAGE);
        else{
            String produto = TblProdutos.getValueAt(TblProdutos.getSelectedRow(), 0).toString();
            Cad_Produto tela = Cad_Produto.getInstance();
            tela.AtualizaCombos();
            tela.preencherCampos(produto);
            tela.setVisible(true);
            tela.setExtendedState(this.getExtendedState() | MAXIMIZED_BOTH);
        }
    }//GEN-LAST:event_BtnCadastroActionPerformed

    private void BtnPesquisarExisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesquisarExisActionPerformed
        ConsExis_Produto janela = ConsExis_Produto.getInstance();
        janela.setJanelaPai(this, "CONS_PRO");
        janela.alimentarTabela();
        janela.setVisible(true);
    }//GEN-LAST:event_BtnPesquisarExisActionPerformed

    private void limparCampos(){
        TxtCodigo.setText("");
        CmbDescricao.setSelectedIndex(0);
        TxtDescricao.setText("");
        CmbGrupo.setSelectedIndex(0);
        CmbAtivo.setSelectedIndex(0);
        TxtCodigo.requestFocusInWindow();
    }
    
    private void limparTabela(){
        int x = TblProdutos.getRowCount();
        DefaultTableModel model = (DefaultTableModel) TblProdutos.getModel();
        for(int i = 0; i < x; i++)
            model.removeRow(0);
    }
    
    public void preencherCampos(String codigo){
        TxtCodigo.setText(codigo);
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
    
    public void AtualizaCombos(){
        CmbGrupo.removeAllItems();
        
        // Abrindo conexão:
        conexao = HibernateUtil.openSession();
        
        // Buscando e preenchendo grupos:
        Criteria crit = conexao.createCriteria(GrupoProduto.class);
        crit.addOrder(Order.asc("Codigo"));
        List<GrupoProduto> grupos = crit.list();
        CmbGrupo.addItem("Selecione o Grupo");
        for(GrupoProduto grupo : grupos)
            CmbGrupo.addItem(grupo.getCodigo());
        
        // Fechando conexão:
        conexao.close();
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
            java.util.logging.Logger.getLogger(Cons_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cons_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cons_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cons_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cons_Produto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCadastro;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnPesquisar;
    private javax.swing.JButton BtnPesquisarExis;
    private javax.swing.JButton BtnSair;
    private javax.swing.JComboBox<String> CmbAtivo;
    private javax.swing.JComboBox<String> CmbDescricao;
    private javax.swing.JComboBox<String> CmbGrupo;
    private javax.swing.JLabel LblCodigo;
    private javax.swing.JLabel LblCodigo1;
    private javax.swing.JLabel LblCodigo2;
    private javax.swing.JLabel LblCodigo3;
    private javax.swing.JTable TblProdutos;
    private javax.swing.JTextField TxtCodigo;
    private javax.swing.JTextField TxtDescricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
