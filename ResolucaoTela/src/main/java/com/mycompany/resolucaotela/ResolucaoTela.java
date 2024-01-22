/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author josan
 */
public class ResolucaoTela {

    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução da minha tela é " + d.width + " x " + d.height);
    }
}
