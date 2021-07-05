/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author laura
 */
public class EspacoEmBranco {
    
    public EspacoEmBranco(JFrame janela) {
        JOptionPane.showMessageDialog(janela, "Há espaço em branco", "Error Message", JOptionPane.ERROR_MESSAGE);
    }
}
