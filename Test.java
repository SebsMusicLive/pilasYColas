/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasYColas;

/**
 *
 * @author ASUS
 */
public class Test<E> {

    ColaLista<Object> cola = new ColaLista<>();
    ColaLista<Object> colaTemp = new ColaLista<>();

    public Test() {

    }

    public void llenarCola(E dato) {
        cola.insertar(dato);
    }

    public boolean buscar(E dato) {
        boolean hayDato = false;
        E datoCola;
        int size = cola.tamañoDeLaCola();

        for (int i = 0; i < size; i++) {
            datoCola = (E) cola.quitar();
            if (estaElementoEnCola(datoCola, dato)) {
                hayDato = true;
            }
            colaTemp.insertar(datoCola);
        }
        volverALlenarCola();
        return hayDato;
    }

    public String hallarDato(E dato) {
        String msg = "";
        if (buscar(dato)) {
            msg = "El dato esta en la cola";
        } else {
            msg = "El dato no esta en la cola";
        }
        return msg;
    }

    public void volverALlenarCola() {
        if (!colaTemp.colaVacia()) {
            int size = colaTemp.tamañoDeLaCola();
            for (int i = 0; i < size; i++) {
                cola.insertar(colaTemp.quitar());
            }
        }
    }

    public void sacarElementoDeCola(E dato) {
        if (!cola.colaVacia()) {
            E datoCola;
            int size = cola.tamañoDeLaCola();
            
            for (int i = 0; i < size; i++) {
                datoCola = (E) cola.quitar();
                if(!estaElementoEnCola(datoCola, dato)){
                    colaTemp.insertar(datoCola);
                }
            }
            volverALlenarCola();
        }
    }

    public boolean estaElementoEnCola(E datoCola, E dato) {
        return datoCola.equals(dato);
    }

    public String imprimirCola() {
        return cola.print();
    }

}
