package com.digitalinnovationone.aulastruturadedados.pilha;

import com.digitalinnovationone.aulastruturadedados.encadeamentonos.No;

public class Pilha {

    private NO refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha=null;
    }

    public boolean isEmpty(){
      return refNoEntradaPilha ==null ? true:false;
    }

    public NO top(){
        return refNoEntradaPilha;
    }

    public void push(NO novoNo){
        NO refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNO(refAuxiliar);
    }

    public NO pop(){
        if (!this.isEmpty()){
            NO noPoped = refNoEntradaPilha;
            refNoEntradaPilha= refNoEntradaPilha.getRefNO();
            return noPoped;
        }
        return null;
    }

    public String toString(){
        String retorno = "------------\n";
        retorno += "       Pilha\n";
        retorno += "------------\n";

        NO noAuxiliar = refNoEntradaPilha;
        while (true){
            if (noAuxiliar!= null){
                retorno+= "[No{dado="+ noAuxiliar.getDado()+"}]\n";
                noAuxiliar=noAuxiliar.getRefNO();
            }else{
                break;
            }
        }
        retorno+="------------\n";
        return retorno;
    }
}
