package com.digitalinnovationone.aulastruturadedados.pilha;

public class NO {

    private int dado;

    private NO refNO;

    public NO(int dado) {
        this.dado = dado;
    }

    public NO() {
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public NO getRefNO() {
        return refNO;
    }

    public void setRefNO(NO reNO) {
        this.refNO = reNO;
    }

    @Override
    public String toString() {
        return "NO{" +
                "dado=" + dado +
                '}';
    }
}
