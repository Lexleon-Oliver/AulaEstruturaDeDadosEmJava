package com.digitalinnovationone.aulastruturadedados.listaencadeada;

public class ExemploListaEncadeada {
    public static void main(String[] args) {
        ListaEncadeada<String > minhaListaEncadeada = new ListaEncadeada<>();
        minhaListaEncadeada.add("Valor01");
        minhaListaEncadeada.add("Valor02");
        minhaListaEncadeada.add("Valor03");
        minhaListaEncadeada.add("Valor04");
        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada.get(1));
        System.out.println(minhaListaEncadeada.get(2));
        System.out.println(minhaListaEncadeada.get(3));
        System.out.println(minhaListaEncadeada);

        System.out.println(minhaListaEncadeada.remove(3));
        System.out.println(minhaListaEncadeada);
    }
}
