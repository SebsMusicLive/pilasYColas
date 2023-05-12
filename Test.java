/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasYColas;

/**
 *
 * @author ASUS
 */
public class Test <E>{
    ColaLista<Object> cola = new ColaLista<>();
    ColaLista<Object> colaEnd = new ColaLista<>();
    
    public Test(){
        
    }
    
    public void llenarCola(E dato){
        cola.insertar(dato);
    }
    
    public boolean estaEnLaCola(E dato){
        boolean hayDato=false;
        E datoCola;
        int size = cola.tamañoDeLaCola();
        for (int i = 0; i <size; i++) {
            datoCola = (E) cola.quitar();
            if(datoCola.equals(dato)){
                hayDato = true;   
            }
            colaEnd.insertar(datoCola);
        }
        return hayDato;
    }
    
    public String hallarDato(E dato){
        String msg="";
        if(estaEnLaCola(dato)){
            msg="El dato esta en la cola";
        }else{
            msg = "El dato no esta en la cola";
        }
        return msg;
    }
    
    public String imprimirCola(){
        return cola.print();
    }
    
    public String toString(){
        return colaEnd.print();
    }
}
