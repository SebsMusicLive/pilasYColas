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
        } else {
            E aux = cima.getData();
            cima = cima.getNext();
            return aux;
        }

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

    public E obtenerFondoPila() throws Exception {

        if (estaPilaVacia()) {
            throw new Exception("Pila vacía, no se puede leer cima.");
        }
        
        NodoPila<E> current = cima;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current.getData();
    }

    public void limpiarPila() {
        NodoPila<E> t;
        while (!estaPilaVacia()) {
            t = cima;
            cima = cima.getNext();
            t.setNext(null);
        }
    }

    public int getSize() {
        return this.size;
    }

    public String print() throws Exception {
        StringBuffer sb = new StringBuffer("");

        if (!estaPilaVacia()) {
            NodoPila<E> current = cima;
            String rta = "";

            while (current != null) {
                rta += current.getData();
                if (current.getNext() != null) {
                    rta += " - ";
                }
                current = current.getNext();
            }
            return rta;
        } else {
            throw new Exception("No se puede imprimir la pila, esta vacia");
        }

    }

}
