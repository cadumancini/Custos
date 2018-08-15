/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabelas;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author cemancini
 */

@Entity
@Table(name="Fornecedor")
public class Fornecedor implements Serializable {
    @Id
    @GeneratedValue
    private Long ID;

    @Column(length=20, nullable=false)
    private String Codigo;
    
    @Column(length=60, nullable=false)
    private String Nome;

    @Column(length=40, nullable=true)
    private String Email;
    
    @Column(length=40, nullable=true)
    private String Contato;

    @Column(length=14, nullable=true)
    private String Celular;
    
    @Column(length=13, nullable=true)
    private String TelefoneFixo;

    /**
     * @return the ID
     */
    public Long getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
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
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Contato
     */
    public String getContato() {
        return Contato;
    }

    /**
     * @param Contato the Contato to set
     */
    public void setContato(String Contato) {
        this.Contato = Contato;
    }

    /**
     * @return the Celular
     */
    public String getCelular() {
        return Celular;
    }

    /**
     * @param Celular the Celular to set
     */
    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    /**
     * @return the TelefoneFixo
     */
    public String getTelefoneFixo() {
        return TelefoneFixo;
    }

    /**
     * @param TelefoneFixo the TelefoneFixo to set
     */
    public void setTelefoneFixo(String TelefoneFixo) {
        this.TelefoneFixo = TelefoneFixo;
    }
    
    
}
