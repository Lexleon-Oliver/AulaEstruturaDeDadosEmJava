package com.digitalinnovationone.aulastruturadedados.fila;

//public class ExemploFila {
//    public static void main(String[] args) {
//        Fila minhaFila = new Fila();
////        minhaFila.enqueue(new No("Primeiro"));
////        minhaFila.enqueue(new No("Segundo"));
////        minhaFila.enqueue(new No("Terceiro"));
////        minhaFila.enqueue(new No("Quarto"));
////        ----------------------------------------------------------
////        Refatorando
//        minhaFila.enqueue("Primeiro");
//        minhaFila.enqueue("Segundo");
//        minhaFila.enqueue("Terceiro");
//        minhaFila.enqueue("Quarto");
//
//        System.out.println(minhaFila);
//        System.out.println(minhaFila.dequeue());
//        System.out.println(minhaFila);
////        minhaFila.enqueue(new No("Ultimo"));
////        ------------------------------------------------------------
////        Refatorando
//        minhaFila.enqueue("Ultimo");
//        System.out.println(minhaFila);
//        System.out.println(minhaFila.first());
//        System.out.println(minhaFila);
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
//  Refatorando
public class ExemploFila {
    public static void main(String[] args) {
        Fila<String>minhaFila=new Fila<>();
        minhaFila.enqueue("Primeiro");
        minhaFila.enqueue("Segundo");
        minhaFila.enqueue("Terceiro");
        minhaFila.enqueue("Quarto");

        System.out.println(minhaFila);
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);
        minhaFila.enqueue("Ultimo");
        System.out.println(minhaFila);
        System.out.println(minhaFila.first());
        System.out.println(minhaFila);
    }
}