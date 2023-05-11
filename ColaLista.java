/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasYColas;

/**
 *
 * @author ASUS
 */
public class ColaLista<E> {

    private NodoCola<E> frente;
    private NodoCola<E> fin;
    private int size;

    public void insertar(E element) {
        NodoCola<E> nuevo = new NodoCola<E>(element);
        if (colaVacia()) {
            frente = nuevo;
            fin = nuevo;
            size++;
        } else {
            NodoCola<E> temp = frente;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(nuevo);
            fin = nuevo;
            size++;
        }
    }

    public E quitar() {
        E rta = frente.getData();
        
        if(!colaVacia()){
            frente = frente.getNext();
            size--;
        }
        return rta;
    }

    public boolean colaVacia() {
        return size == 0;
    }
    
    public E getFrente() throws Exception{
        if(!colaVacia()){
            return frente.getData();
        }
        else{
            throw new Exception("La cola esta vacia, por lo que no se puede obtener el primer elemento");
        }
    }
    
    public int tamañoDeLaCola(){
        return size;
    }
    public String print() {
        StringBuffer sb = new StringBuffer("");

        if (!colaVacia()) {
            NodoCola<E> current = frente;
            sb.append("[");
            for (int i = 0; i < size; i++) {
                sb.append(current.getData());
                current = current.getNext();
                if (current != null) {
                    sb.append(", ");
                } else {
                    sb.append("]");
                }
            }

        } else {
            sb.append("No se puede imprimir, la lista se encuentra vacia");
        }
        return sb.toString();
    }
}
