package com.digitalinnovationone.aulastruturadedados.pilha;

public class ExemploPilha {
    public static void main(String[] args) {
        Pilha minhaPilha = new Pilha();
        minhaPilha.push(new NO(1));
        minhaPilha.push(new NO(2));
        minhaPilha.push(new NO(3));
        minhaPilha.push(new NO(4));
        minhaPilha.push(new NO(5));
        minhaPilha.push(new NO(6));

        System.out.println(minhaPilha  );
        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha);
        minhaPilha.push(new NO(99));
        System.out.println(minhaPilha);
    }
}
