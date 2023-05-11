/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasYColas;

/**
 *
 * @author ASUS
 */
public class PilaLista<E> {
    
    private NodoPila<E> cima;
    private int size;
    
    public void push(E element) {
        NodoPila<E> nuevo;
        nuevo = new NodoPila<E>(element);
        nuevo.setNext(cima);
        cima = nuevo;
        
        size++;
    }
    
    public E pop() throws Exception {
        if (estaPilaVacia()) {
            throw new Exception("Pila vacía, no se puede extraer.");
        }
        E aux = cima.getData();
        cima = cima.getNext();
        return aux;
    }
    
    private boolean estaPilaVacia() {
        return cima == null;
    }
    
    public Object obtenerCimaPila() throws Exception {
        if (estaPilaVacia()) {
            throw new Exception("Pila vacía, no se puede leer cima.");
        }
        return cima.getData();
    }
    
    public void limpiarPila() {
        NodoPila<E> t;
        while (!estaPilaVacia()) {
            t = cima;
            cima = cima.getNext();
            t.setNext(null);
        }
    }
    
    public String print() throws Exception{
        StringBuffer sb = new StringBuffer("");

        if (!estaPilaVacia()) {
//            Node<E> current = head;
//            sb.append("[");
//            for (int i = 0; i < size; i++) {
//                sb.append(current.getData());
//                current = current.getNext();
//                if (current != null) {
//                    sb.append(", ");
//                } else {
//                    sb.append("]");
//                }
//            }
            while(cima!=null){
                cima = cima.getNext();
                if(cima==null){
                    break;
                }
                sb.append(cima.getData()+"\n");
            }
            return sb.toString();

        } else {
            throw new Exception("No se puede imprimir la pila, esta vacia");
        }
    }
}
