package com.digitalinnovationone.aulastruturadedados.listaduplamenteencadeada;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista = 0;

    public void add(T elemento){
        NoDuplo<T> novoNo = new NoDuplo<T>(elemento);
        novoNo.setProximoNo(null);
        novoNo.setNoAnterior(ultimoNo);
        if(primeiroNo == null){
            primeiroNo = novoNo;
        }
        if(ultimoNo != null){
            ultimoNo.setProximoNo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T elemento){
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setProximoNo(noAuxiliar);

        if(novoNo.getProximoNo() != null){
            novoNo.setNoAnterior(noAuxiliar.getNoAnterior());
            novoNo.getProximoNo().setNoAnterior(novoNo);
        }else {
            novoNo.setNoAnterior(ultimoNo);
            ultimoNo = novoNo;
        }
        if(index == 0){
            primeiroNo = novoNo;
        }else {
            novoNo.getNoAnterior().setProximoNo(novoNo);
        }
        tamanhoLista++;
    }

    public void remove(int index){
        if(index == 0){
            primeiroNo = primeiroNo.getProximoNo();
            if(primeiroNo != null){
                primeiroNo.setNoAnterior(null);
            }
        }else{
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoAnterior().setProximoNo(noAuxiliar.getProximoNo());
            if(noAuxiliar != ultimoNo){
                noAuxiliar.getProximoNo().setNoAnterior(noAuxiliar.getNoAnterior());
            }else{
                ultimoNo = noAuxiliar;
            }
        }
        tamanhoLista--;
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noAuxiliar;
    }

    public int size(){
        return tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() +"}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
