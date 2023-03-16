package com.capgemini;

import java.time.DateTimeException;
import java.util.Date;

public class Pessoa {
    private int idade=0;
    private String saude="";
    private String nome = "";
    private String sexo = "";

    public void setSaude(String saude){
        this.saude = saude;
    }
    public String getSaude(){
        System.out.println(this.saude);
        return this.saude;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        System.out.println(this.nome);
        return this.nome;
    }
    public void setDataNascimento(int ano){
        int data = ano;
        int anoAtual = new Date().getYear() ;
        this.idade = data - anoAtual;
        System.out.println(this.idade);
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        System.out.println(this.idade);
        return this.idade;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getSexo(){
        System.out.println(this.sexo);
        return this.sexo;
    }

    public void getPessoa(){
        System.out.println(this.nome+" tem "+this.idade+" anos e tem o sexo "+this.sexo);
    }
}
