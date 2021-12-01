package finch.project.controller;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import java.util.ArrayList;


public class Pedido {

    private int codPedido;
    private String data;
    private String nome;
    private int quantidade;
    private int total;
    private ArrayList<Item> lista;
    private Item item;



    public Pedido(int codPedido, String data, String nome, int quantidade) {
        this.codPedido = codPedido;
        this.data = data;
        this.nome = nome;
        lista = new ArrayList<>();
        addItem(quantidade);


    }

    public float getValorPedido()  {
        return getValor("getValor");
    }

    public float getValorImposto()  {
        return getValor("getValorImposto");
    }

    public float getValorTotal()  {
        return getValor("getValorTotal");
    }

    public float getValorLiquido()  {
        return getValor("getValorLiquido");
    }

    private float getValor(String nomeMetodo)  {
        Method getValorItem;
        float valor = 0;
        for (Item item : lista) {
            getValorItem = item.getClass().getMethod(nomeMetodo);
            valor += (float) getValorItem.invoke(item);
        }
        return valor;
    }




    public void print() {
        System.out.println(" - Informações do Pedido - ");
        System.out.println("Código: " + codPedido);
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor a pagar: " + total);
        System.out.println(" - Lista dos Itens do Pedido - ");

        }




}
