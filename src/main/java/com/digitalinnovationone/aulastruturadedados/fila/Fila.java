package com.digitalinnovationone.aulastruturadedados.fila;

import static org.apache.logging.log4j.ThreadContext.isEmpty;

//public class Fila {
//    private No refNoEntradaFila=null;
//
////    public void enqueue(No novoNo){
////        novoNo.setRefNo(refNoEntradaFila);
////        refNoEntradaFila=novoNo;
////    }
////    ------------------------------------------------------------------
////    Refatorando
//    public void enqueue(Object obj){
//        No novoNo= new No(obj);
//        novoNo.setRefNo(refNoEntradaFila);
//        refNoEntradaFila=novoNo;
//    }
//
//
////    public No dequeue(){
////        if (!isEmpty()){
////            No primeiroNo = refNoEntradaFila;
////            No noAuxiliar = refNoEntradaFila;
////            while (true){
////                if (primeiroNo.getRefNo()!=null){
////                    noAuxiliar=primeiroNo;
////                    primeiroNo = primeiroNo.getRefNo();
////                }else{
////                    noAuxiliar.setRefNo(null);
////                    break;
////                }
////            }
////            return primeiroNo;
////        }
////        return null;
////    }
////    --------------------------------------------------------------------------
////    Refatorando
//    public Object dequeue(){
//        if (!isEmpty()){
//            No primeiroNo = refNoEntradaFila;
//            No noAuxiliar = refNoEntradaFila;
//            while (true){
//                if (primeiroNo.getRefNo()!=null){
//                    noAuxiliar=primeiroNo;
//                    primeiroNo = primeiroNo.getRefNo();
//                }else{
//                    noAuxiliar.setRefNo(null);
//                    break;
//                }
//            }
//            return primeiroNo.getObject();
//        }
//        return null;
//    }
//
////    public No first(){
////        if (!isEmpty()){
////            No primeiroNo = refNoEntradaFila;
////            while (true){
////                if (primeiroNo.getRefNo()!=null){
////                    primeiroNo = primeiroNo.getRefNo();
////                }else{
////                    break;
////                }
////            }
////            return primeiroNo;
////        }
////        return null;
////    }
////    -------------------------------------------------------------------
////    Refatorando:
//        public Object first(){
//        if (!isEmpty()){
//            No primeiroNo = refNoEntradaFila;
//            while (true){
//                if (primeiroNo.getRefNo()!=null){
//                    primeiroNo = primeiroNo.getRefNo();
//                }else{
//                    break;
//                }
//            }
//            return primeiroNo.getObject();
//        }
//        return null;
//    }
//
//    public boolean isEmpty(){
//        return refNoEntradaFila == null ? true : false;
//    }
//
//    @Override
//    public String toString() {
//        String retorno = "";
//        No noAuxiliar = refNoEntradaFila;
//
//        if (refNoEntradaFila != null){
//            while (true){
//                retorno+= "[No{objeto="+ noAuxiliar.getObject() +"}]--->";
//                if (noAuxiliar.getRefNo()!= null){
//                    noAuxiliar = noAuxiliar.getRefNo();
//                }else {
//                    retorno += "null";
//                    break;
//                }
//            }
//        }else {
//            retorno = "null";
//        }
//        return retorno;
//    }
//
//    public Fila() {
//        this.refNoEntradaFila=null;
//    }
//}
// ---------------------------------------------------------------------------------------------------------------------
//  Refatorando:
public class Fila<T> {

    private No<T> refNoEntradaFila = null;

    public void enqueue(T object) {
        No novoNo = new No(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T dequeue() {
        if (!isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }
    public T first(){
        if (!isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while (true){
                if (primeiroNo.getRefNo()!=null){
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public boolean isEmpty(){
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String retorno = "";
        No noAuxiliar = refNoEntradaFila;

        if (refNoEntradaFila != null){
            while (true){
                retorno+= "[No{objeto="+ noAuxiliar.getObject() +"}]--->";
                if (noAuxiliar.getRefNo()!= null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else {
                    retorno += "null";
                    break;
                }
            }
        }else {
            retorno = "null";
        }
        return retorno;
    }

    public Fila() {
        this.refNoEntradaFila=null;
    }
}
