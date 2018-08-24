/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabelas;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author cemancini
 */

@Entity
@Table(name="Componente")
public class Componente implements Serializable {
    @Id
    @GeneratedValue
    private Long ID;
    
    @ManyToOne
    @JoinColumn
    private Produto Modelo;
    
    @Column(nullable=false)
    private Long Sequencia;
    
    @Column(nullable=false)
    private Produto Componente; 
    
    @Column(nullable=false)
    private Double Quantidade;

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
     * @return the quantidade
     */
    public Double getQuantidade() {
        return Quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(Double quantidade) {
        this.Quantidade = quantidade;
    }

    /**
     * @return the modelo
     */
    public Produto getModelo() {
        return Modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(Produto modelo) {
        this.Modelo = modelo;
    }

    /**
     * @return the componente
     */
    public Produto getComponente() {
        return Componente;
    }

    /**
     * @param componente the componente to set
     */
    public void setComponente(Produto componente) {
        this.Componente = componente;
    }

    /**
     * @return the Sequencia
     */
    public Long getSequencia() {
        return Sequencia;
    }

    /**
     * @param Sequencia the Sequencia to set
     */
    public void setSequencia(Long Sequencia) {
        this.Sequencia = Sequencia;
    }
}
