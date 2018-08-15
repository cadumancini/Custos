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
@Table(name="GrupoProduto")
public class GrupoProduto implements Serializable {
    @Id
    @GeneratedValue
    private Long ID;

    @Column(length=20, nullable=false)
    private String Codigo;
    
    @Column(length=50, nullable=false)
    private String Descricao;
    
    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * @return the Codigo
     */
    public String getCodigo() {
        return Codigo;
    }

    /**
     * @param Codigo the Codigo to set
     */
    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    /**
     * @return the Descricao
     */
    public String getDescricao() {
        return Descricao;
    }

    /**
     * @param Descricao the Descricao to set
     */
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    
    
}
