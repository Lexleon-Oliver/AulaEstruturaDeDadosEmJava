package com.digitalinnovationone.aulastruturadedados.arvoresbinarias.model;

import com.digitalinnovationone.aulastruturadedados.arvoresbinarias.ArvoreBinaria;

public class ExemploArvoreBinaria {
    public static void main(String[] args) {
        ArvoreBinaria<Obj> arvoreBinaria = new ArvoreBinaria<>();
        arvoreBinaria.add(new Obj(13));
        arvoreBinaria.add(new Obj(10));
        arvoreBinaria.add(new Obj(25));
        arvoreBinaria.add(new Obj(2));
        arvoreBinaria.add(new Obj(12));
        arvoreBinaria.add(new Obj(20));
        arvoreBinaria.add(new Obj(31));
        arvoreBinaria.add(new Obj(29));
        arvoreBinaria.add(new Obj(32));
        arvoreBinaria.exibirEmOrdem();
        arvoreBinaria.exibirPreOrdem();
        arvoreBinaria.exibirPosOrdem();
    }
}
