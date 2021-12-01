package finch.project.controller;

public class Produtos {
    String nome;
    String itens;
    float preco;

    public Produtos (String nome, String itens, float preco){
        this.nome = nome;
        this.itens = itens;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public String getitens(){
        return itens;
    }

    public float getpreco(){
        return preco;
    }

}


