/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasYColas;

/**
 *
 * @author ASUS
 */
public class Cliente {
    public static void main(String[] args) {
        Test test = new Test();
        
        test.llenarCola(8);
        test.llenarCola(5);
        test.llenarCola(2);
        test.llenarCola(4);
        test.llenarCola(2);
        test.llenarCola(2);
        test.llenarCola(2);
        test.llenarCola(4);
        
        System.out.println(test.imprimirCola());
        System.out.println(test.hallarDato(2));
        System.out.println(test.imprimirCola());
        
        test.sacarElementoDeCola(4);
        System.out.println(test.imprimirCola());
        
        
        
    }
}
