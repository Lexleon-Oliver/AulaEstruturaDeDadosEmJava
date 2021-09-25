package com.digitalinnovationone.aulastruturadedados.listascirculares;

public class ListaCircular<T> {
    private No<T> cabeca;
    private No<T> cauda;
    private int tamLista;

    public ListaCircular() {
        this.cauda =null;
        this.cabeca =null;
        this.tamLista=0;
    }

    public int size(){
        return tamLista;
    }

    public boolean isEmpty(){
        return this.tamLista==0 ? true: false;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public void remove (int index){
        if (index>= this.tamLista){
            throw new IndexOutOfBoundsException("O índice é maior que o tamanho da Lista");
        }
        No<T> noAux = this.cauda;
        if (index == 0){
            this.cauda = this.cauda.getProximoNo();
            this.cabeca.setProximoNo(this.cauda);
        } else if (index == 1) {
            this.cauda.setProximoNo(this.cauda.getProximoNo().getProximoNo());
        }else{
            for (int i= 0;i<index-1;i++){
                noAux=noAux.getProximoNo();
            }
            noAux.setProximoNo(noAux.getProximoNo().getProximoNo());
        }
        this.tamLista--;
    }

    public void add(T elemento){
        No<T>novoNo = new No<>(elemento);
        if (this.isEmpty()){
            this.cabeca= novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setProximoNo(this.cauda);
        }else {
            novoNo.setProximoNo(this.cauda);
            this.cabeca.setProximoNo(novoNo);
            this.cauda=novoNo;
        }
        this.tamLista++;
    }

    @Override
    public String toString(){
        String retorno="";
        No<T> noAux = this.cauda;
        for (int i =0; i<this.size();i++){
            retorno+="[No{conteudo=" + noAux.getConteudo()+ "}]--->";
            noAux = noAux.getProximoNo();
        }
        retorno+= this.size() != 0 ? "(Retorna ao início)": "[]";
        return retorno;
    }

    private No<T> getNo(int index){
        if (this.isEmpty()){
            throw new IndexOutOfBoundsException("A lisa está vazia!");
        }
        if (index==0){
            return this.cauda;
        }
        No<T> noAux = this.cauda;
        for (int i=0; i<index; i++){
            noAux=noAux.getProximoNo();
        }
        return noAux;
    }

}
