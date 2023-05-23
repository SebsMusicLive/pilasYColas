/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasYColas;

/**
 *
 * @author ASUS
 */
public class InvertirElementosPila {
    PilaLista<Integer> pilaOriginal = new PilaLista<>();
    PilaLista<Integer> pilaInvertida = new PilaLista<>();
    
    public InvertirElementosPila(){
        
    }
    
    public void llenarPilaOriginal(int element){
        pilaOriginal.push(element);
    }
    
    public void invertirPila() throws Exception{
        for (int i = 0; i < pilaOriginal.getSize(); i++) {
            pilaInvertida.push(pilaOriginal.pop());
            
        }
        
    }
    
    public String imprimirPilaOriginal() throws Exception{
        return pilaOriginal.print();
    }
    
    public String imprimirPilaInvertida() throws Exception{
        return pilaInvertida.print();
    }
    
    public int obtenerDatoFinalOriginal() throws Exception{
        return pilaOriginal.obtenerFondoPila();
    }
    
    public int obtenerDatoFinalInvertida() throws Exception{
        return pilaInvertida.obtenerFondoPila();
    }
}
