/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasYColas;

/**
 *
 * @author ASUS
 */
public class MenoresYMayoresAX {
    ColaLista<Integer> colaPrincipal = new ColaLista<>();
    ColaLista<Integer> colaMenor =new ColaLista<>();
    ColaLista<Integer> colaMayor = new ColaLista<>();
    
    public MenoresYMayoresAX(){
        
    }
    
    public void llenarCola(int element){
        colaPrincipal.insertar(element);
    }
    public String imprimirColaPrincipal(){
        return colaPrincipal.print();
    }
    
    public void dividirCola(int numero){
        int size = colaPrincipal.tamañoDeLaCola();
        int numeroDiv;
        for (int i = 0; i < size; i++) {
            numeroDiv=colaPrincipal.quitar();
            if(numeroDiv<numero){
                colaMenor.insertar(numeroDiv);
            }
            else{
                colaMayor.insertar(numeroDiv);
            }
        }
    }
    
    public String imprimirColaMenores(){
        return colaMenor.print();
    }
    
    public String imprimirColaMayores(){
        return colaMayor.print();
    }
}
