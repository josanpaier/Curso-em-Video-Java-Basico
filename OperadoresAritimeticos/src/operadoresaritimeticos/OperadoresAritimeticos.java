/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritimeticos;

/**
 *
 * @author josan
 */
public class OperadoresAritimeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é igual a " + m);*/
        
        /*int numero = 10;
        int valor = 4 + numero--;
        System.out.println(valor);
        System.out.println(numero);*/
        
        /*int x = 4;
        x += 2; // x = x + 2
        System.out.println(x);*/
        
        /*float v = 8.4f;
        //int ar = (int) Math.floor(v);
        //int ar = (int) Math.ceil(v);
        int ar = (int) Math.round(v);
        System.out.println(ar);*/
        
        double ale = Math.random();
        //int n = (int) (5 + ale * (10-5)); // gera números random de 5 a 10
        int n = (int) (15 + ale * (50-15)); // gera números random de 15 a 50
        System.out.println(n);
    }
    
}
