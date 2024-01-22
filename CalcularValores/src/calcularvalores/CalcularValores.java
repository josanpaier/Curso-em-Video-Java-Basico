/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcularvalores;

import javax.swing.JOptionPane;

/**
 *
 * @author josan
 */
public class CalcularValores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Olá, Mundo!", "Boas Vindas", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Olá, Mundo!", "Boas Vindas", JOptionPane.ERROR_MESSAGE);
        int n, s = 0, contVal = 0, contPar = 0, contImpar = 0, contAcima100 = 0;        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
            contVal++;
            s += n;            
            if (n % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
            if (n > 100) {
                contAcima100++;
            }
        //JOptionPane.showMessageDialog(null, "Você digitou o valor " + n);
        } while (n != 0);        
        // SOMA = JOptionPane.showMessageDialog(null, "<html>Resultado final <hr>" + "<br>Somatório vale " + s + "</html>");
        JOptionPane.showMessageDialog(null, "<html>Resultado:<br><hr>" + 
                "<br>Total de Valores: " + (contVal - 1) +
                "<br>Total de Pares: " + (contPar - 1) +
                "<br>Total de Ímpares: " + contImpar +
                "<br>Acima de 100: " + contAcima100 +
                "<br>Média dos valores: " + (s / (contVal - 1)) +
                "</html>");
    }
    
}
