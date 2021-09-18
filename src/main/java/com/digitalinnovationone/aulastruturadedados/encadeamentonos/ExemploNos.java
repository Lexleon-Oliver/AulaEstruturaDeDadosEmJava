package com.digitalinnovationone.aulastruturadedados.encadeamentonos;

public class ExemploNos {
    public static void main(String[] args) {
        No<String> no1 = new No<>("Conteúdo nó1");
        No<String> no2 = new No<>("Conteúdo nó2");
        no1.setProximoNo(no2);
        No<String> no3 = new No<>("Conteúdo nó3");
        no2.setProximoNo(no3);
        No<String> no4 = new No<>("Conteúdo nó4");
        no3.setProximoNo(no4);
        System.out.println("-------------------------------------------------------------");
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());


    }
}
