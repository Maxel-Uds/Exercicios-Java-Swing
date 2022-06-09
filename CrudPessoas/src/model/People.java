package model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class People {
    private String nome;
    private String doc;
    private Date nascimento;
    private Map<String, String> email = new HashMap<String, String>();
    private Map<String, String> telefone = new HashMap<String, String>();
    private Map<String, Address> endereco = new HashMap<String, Address>();

    public People(String nome, String doc, Date nascimento) {
        this.nome = nome;
        this.doc = doc;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public Map<String, String> getEmail() {
        return email;
    }

    public void setEmail(Map<String, String> email) {
        this.email = email;
    }

    public Map<String, String> getTelefone() {
        return telefone;
    }

    public void setTelefone(Map<String, String> telefone) {
        this.telefone = telefone;
    }

    public Map<String, Address> getEndereco() {
        return endereco;
    }

    public void setEndereco(Map<String, Address> endereco) {
        this.endereco = endereco;
    }

}
