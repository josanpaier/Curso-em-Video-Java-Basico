/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadorternario;

/**
 *
 * @author josan
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, result;
        num1 = 14;
        num2 = 18;
        //result = (num1>num2)?num1:num2;
        result = (num1>num2)?num1+num2:num1-num2;
        System.out.println(result);
    }
    
}
