package com.digitalinnovationone.aulastruturadedados.atribuicaoreferencia;

class Objeto {
    Integer num;

    public void setNum(Integer num){
        this.num=num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }

    public Objeto(Integer num) {
        this.num = num;
    }
}
