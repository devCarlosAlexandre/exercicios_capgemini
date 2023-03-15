package com.capgemini;

public class Pessoa {
    private int idade=0;
    private String nome = "";
    private String sexo = "";

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        System.out.println(this.nome);
        return this.nome;
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
