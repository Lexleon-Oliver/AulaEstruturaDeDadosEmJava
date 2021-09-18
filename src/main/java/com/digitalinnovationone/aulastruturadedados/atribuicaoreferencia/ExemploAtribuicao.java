package com.digitalinnovationone.aulastruturadedados.atribuicaoreferencia;

public class ExemploAtribuicao {
    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;

        System.out.println("intA= "+intA+", intB= "+intB);
        intA =2;
        System.out.println("intA= "+intA+", intB= "+intB);

        Objeto objA = new Objeto(1);
        Objeto objB = objA;

        System.out.println("objA= "+objA+", objB= "+objB);
        objA.setNum(2);
        System.out.println("objA= "+objA+", objB= "+objB);
    }
}
