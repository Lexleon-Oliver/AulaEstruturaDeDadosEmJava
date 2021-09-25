package com.digitalinnovationone.aulastruturadedados.listascirculares;

public class ExemploListaCircular {
    public static void main(String[] args) {
        ListaCircular<String> listaCircular = new ListaCircular<>();
        listaCircular.add("C0");
        System.out.println(listaCircular);
        listaCircular.remove(0);
        System.out.println(listaCircular);
        listaCircular.add("C0");
        listaCircular.add("C1");
        listaCircular.add("C2");
        listaCircular.add("C3");
        listaCircular.add("C4");
        listaCircular.add("C5");
        System.out.println(listaCircular);
        for (int i= 0; i<20; i++){
            System.out.println(listaCircular.get(i));
        }

    }
}
