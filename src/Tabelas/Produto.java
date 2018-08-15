/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabelas;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author cemancini
 */
@Entity
@Table(name = "Produto")
public class Produto implements Serializable {

    @Id
    @GeneratedValue
    private Long ID;

    @Column(length = 20, nullable = false)
    private String Codigo;

    @Column(length = 60, nullable = false)
    private String Descricao;
    
    @ManyToOne
    private GrupoProduto Grupo;

    @OneToMany(mappedBy = "Modelo", targetEntity = Componente.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Componente> Componentes;
    
    @ManyToOne
    private Fornecedor Fornecedor1;
    
    @ManyToOne
    private Fornecedor Fornecedor2;
    
    @ManyToOne
    private Fornecedor Fornecedor3;

    @Column(length=5, nullable=true)
    private String UnidadeMedida;
    
    @Column(nullable=true)
    private Double PrecoVenda;

    @Column(nullable=true)
    private Double PrecoCusto;

    @Column(nullable=true)
    private Double DevolucoesVendas;

    @Column(nullable=true)
    private Double AbatimentosVendas;

    @Column(nullable=true)
    private Double ComissoesVendas;

    @Column(nullable=true)
    private Double IcmsVendas;

    @Column(nullable=true)
    private Double IpiVendas;

    @Column(nullable=true)
    private Double PisVendas;

    @Column(nullable=true)
    private Double CofinsVendas;

    @Column(nullable=true)
    private Double SimplesVendas;

    @Column(nullable=true)
    private Double IssVendas;

    @Column(nullable=true)
    private Double IrVendas;

    @Column(nullable=true)
    private Double CsllVendas;

    @Column(nullable=true)
    private Double Embalagem;

    @Column(nullable=true)
    private Double FreteVendas;

    @Column(nullable=true)
    private Double OutrosInsumos;

    @Column(nullable=true)
    private Double MargemContrib;
    
    @Column(nullable=true)
    private String Ncm;

    /**
     * @return the id
     */
    public Long getId() {
        return ID;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.ID = id;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return Codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.Codigo = codigo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return Descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.Descricao = descricao;
    }

    /**
     * @return the componentes
     */
    public List<Componente> getComponentes() {
        return Componentes;
    }

    /**
     * @param componentes the componentes to set
     */
    public void setComponentes(List<Componente> componentes) {
        this.Componentes = componentes;
    }

    /**
     * @return the PrecoVenda
     */
    public Double getPrecoVenda() {
        return PrecoVenda;
    }

    /**
     * @param PrecoVenda the PrecoVenda to set
     */
    public void setPrecoVenda(Double PrecoVenda) {
        this.PrecoVenda = PrecoVenda;
    }

    /**
     * @return the PrecoCusto
     */
    public Double getPrecoCusto() {
        return PrecoCusto;
    }

    /**
     * @param PrecoCusto the PrecoCusto to set
     */
    public void setPrecoCusto(Double PrecoCusto) {
        this.PrecoCusto = PrecoCusto;
    }

    /**
     * @return the DevolucoesVendas
     */
    public Double getDevolucoesVendas() {
        return DevolucoesVendas;
    }

    /**
     * @param DevolucoesVendas the DevolucoesVendas to set
     */
    public void setDevolucoesVendas(Double DevolucoesVendas) {
        this.DevolucoesVendas = DevolucoesVendas;
    }

    /**
     * @return the AbatimentosVendas
     */
    public Double getAbatimentosVendas() {
        return AbatimentosVendas;
    }

    /**
     * @param AbatimentosVendas the AbatimentosVendas to set
     */
    public void setAbatimentosVendas(Double AbatimentosVendas) {
        this.AbatimentosVendas = AbatimentosVendas;
    }

    /**
     * @return the ComissoesVendas
     */
    public Double getComissoesVendas() {
        return ComissoesVendas;
    }

    /**
     * @param ComissoesVendas the ComissoesVendas to set
     */
    public void setComissoesVendas(Double ComissoesVendas) {
        this.ComissoesVendas = ComissoesVendas;
    }

    /**
     * @return the IcmsVendas
     */
    public Double getIcmsVendas() {
        return IcmsVendas;
    }

    /**
     * @param IcmsVendas the IcmsVendas to set
     */
    public void setIcmsVendas(Double IcmsVendas) {
        this.IcmsVendas = IcmsVendas;
    }

    /**
     * @return the IpiVendas
     */
    public Double getIpiVendas() {
        return IpiVendas;
    }

    /**
     * @param IpiVendas the IpiVendas to set
     */
    public void setIpiVendas(Double IpiVendas) {
        this.IpiVendas = IpiVendas;
    }

    /**
     * @return the PisVendas
     */
    public Double getPisVendas() {
        return PisVendas;
    }

    /**
     * @param PisVendas the PisVendas to set
     */
    public void setPisVendas(Double PisVendas) {
        this.PisVendas = PisVendas;
    }

    /**
     * @return the CofinsVendas
     */
    public Double getCofinsVendas() {
        return CofinsVendas;
    }

    /**
     * @param CofinsVendas the CofinsVendas to set
     */
    public void setCofinsVendas(Double CofinsVendas) {
        this.CofinsVendas = CofinsVendas;
    }

    /**
     * @return the SimplesVendas
     */
    public Double getSimplesVendas() {
        return SimplesVendas;
    }

    /**
     * @param SimplesVendas the SimplesVendas to set
     */
    public void setSimplesVendas(Double SimplesVendas) {
        this.SimplesVendas = SimplesVendas;
    }

    /**
     * @return the IssVendas
     */
    public Double getIssVendas() {
        return IssVendas;
    }

    /**
     * @param IssVendas the IssVendas to set
     */
    public void setIssVendas(Double IssVendas) {
        this.IssVendas = IssVendas;
    }

    /**
     * @return the IrVendas
     */
    public Double getIrVendas() {
        return IrVendas;
    }

    /**
     * @param IrVendas the IrVendas to set
     */
    public void setIrVendas(Double IrVendas) {
        this.IrVendas = IrVendas;
    }

    /**
     * @return the CsllVendas
     */
    public Double getCsllVendas() {
        return CsllVendas;
    }

    /**
     * @param CsllVendas the CsllVendas to set
     */
    public void setCsllVendas(Double CsllVendas) {
        this.CsllVendas = CsllVendas;
    }

    /**
     * @return the Embalagem
     */
    public Double getEmbalagem() {
        return Embalagem;
    }

    /**
     * @param Embalagem the Embalagem to set
     */
    public void setEmbalagem(Double Embalagem) {
        this.Embalagem = Embalagem;
    }

    /**
     * @return the FreteVendas
     */
    public Double getFreteVendas() {
        return FreteVendas;
    }

    /**
     * @param FreteVendas the FreteVendas to set
     */
    public void setFreteVendas(Double FreteVendas) {
        this.FreteVendas = FreteVendas;
    }

    /**
     * @return the OutrosInsumos
     */
    public Double getOutrosInsumos() {
        return OutrosInsumos;
    }

    /**
     * @param OutrosInsumos the OutrosInsumos to set
     */
    public void setOutrosInsumos(Double OutrosInsumos) {
        this.OutrosInsumos = OutrosInsumos;
    }

    /**
     * @return the MargemContrib
     */
    public Double getMargemContrib() {
        return MargemContrib;
    }

    /**
     * @param MargemContrib the MargemContrib to set
     */
    public void setMargemContrib(Double MargemContrib) {
        this.MargemContrib = MargemContrib;
    }

    /**
     * @return the Grupo
     */
    public GrupoProduto getGrupo() {
        return Grupo;
    }

    /**
     * @param Grupo the Grupo to set
     */
    public void setGrupo(GrupoProduto Grupo) {
        this.Grupo = Grupo;
    }

    /**
     * @return the UnidadeMedida
     */
    public String getUnidadeMedida() {
        return UnidadeMedida;
    }

    /**
     * @param UnidadeMedida the UnidadeMedida to set
     */
    public void setUnidadeMedida(String UnidadeMedida) {
        this.UnidadeMedida = UnidadeMedida;
    }

    /**
     * @return the Ncm
     */
    public String getNcm() {
        return Ncm;
    }

    /**
     * @param Ncm the Ncm to set
     */
    public void setNcm(String Ncm) {
        this.Ncm = Ncm;
    }

    /**
     * @return the Fornecedor1
     */
    public Fornecedor getFornecedor1() {
        return Fornecedor1;
    }

    /**
     * @param Fornecedor1 the Fornecedor1 to set
     */
    public void setFornecedor1(Fornecedor Fornecedor1) {
        this.Fornecedor1 = Fornecedor1;
    }

    /**
     * @return the Fornecedor2
     */
    public Fornecedor getFornecedor2() {
        return Fornecedor2;
    }

    /**
     * @param Fornecedor2 the Fornecedor2 to set
     */
    public void setFornecedor2(Fornecedor Fornecedor2) {
        this.Fornecedor2 = Fornecedor2;
    }

    /**
     * @return the Fornecedor3
     */
    public Fornecedor getFornecedor3() {
        return Fornecedor3;
    }

    /**
     * @param Fornecedor3 the Fornecedor3 to set
     */
    public void setFornecedor3(Fornecedor Fornecedor3) {
        this.Fornecedor3 = Fornecedor3;
    }
    
    
}
