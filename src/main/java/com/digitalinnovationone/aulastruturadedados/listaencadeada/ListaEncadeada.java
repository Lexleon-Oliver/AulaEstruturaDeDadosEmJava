package com.digitalinnovationone.aulastruturadedados.listaencadeada;

public class ListaEncadeada<T> {
    No<T> referenciaEntrada;

    public ListaEncadeada(){
        this.referenciaEntrada= null;
    }

    public int size(){
        int tamList= 0;
        No<T> referenciaAux= referenciaEntrada;
        while (true){
            if (referenciaAux!= null){
                tamList++;
                if (referenciaAux.getProximoNo()!= null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else {
                    break;
                }
            }else{
                break;
            }
        }
        return tamList;
    }

    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()) {
            referenciaEntrada= novoNo;
            return;
        }
        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i<this.size()-1; i++){
            noAuxiliar=noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    public T remove(int index){
        No<T> noParaRemover= this.getNo(index);
        if (index== 0){
            referenciaEntrada = noParaRemover.getProximoNo();
            return noParaRemover.getConteudo();
        }
        No<T> noAnterior = getNo(index-1);
        noAnterior.setProximoNo(noParaRemover.getProximoNo());
        return noParaRemover.getConteudo();
    }

    public String toString(){
        String retorno ="";
        No<T>noAux = referenciaEntrada;
        for (int i=0; i<this.size();i++){
            retorno += "[No{conteudo="+ noAux.getConteudo()+"}]--->";
            noAux= noAux.getProximoNo();
        }
        retorno += "null";
        return retorno;
    }

    private No<T> getNo(int index) {
        validaIndice(index);
        No<T> noAux = referenciaEntrada;
        No<T> noRetorno = null;
        for (int i = 0; i<=index; i++){
            noRetorno=noAux;
            noAux=noAux.getProximoNo();
        }
        return noRetorno;
    }

    private void validaIndice(int index) {
        if (index >= size()){
            int ultimoIndice = size() -1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice "+ index + " desta lista. Esta lista so " +
                    "vai até o índice "+ultimoIndice+ ".");
        }
    }
}
