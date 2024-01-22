/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author josan
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String result;
        //result = (nome1==nome2)?"igual":"diferente"; // igual, pois são dois objetos iguais
        //result = (nome1==nome3)?"igual":"diferente"; // diferente, pois são dois objetos instanciados diferentes, somente o conteúdo é igual
        result = (nome1.equals(nome3))?"igual":"diferente"; // igual, pois o método equals() verifica se o conteúdo é o mesmo
        System.out.println(result);
    }
    
}
