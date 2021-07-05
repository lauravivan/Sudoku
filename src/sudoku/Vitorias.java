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
public class Vitorias {
    
    public void vitoriaIndividual(JFrame janela) {
        JOptionPane.showMessageDialog(janela, "PARABÉNS, VOCÊ VENCEU!");
        int resp2 = JOptionPane.showConfirmDialog(janela, "Quer continuar jogando?", 
                "Selecione uma opção", JOptionPane.YES_NO_OPTION);
        if (resp2 == JOptionPane.YES_OPTION) {
            janela.dispose();
            new TelaPrincipal().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(janela, "Obrigada por jogar!"
                                        + "\nAté a próxima!");
            janela.dispose();
        }
    }
    
    public void vitoriaDesafio(JFrame janela, JFrame proxJanela, String msg, String msg2, 
            String msgCuriosidade) {
        JOptionPane.showMessageDialog(janela, msg);
        JOptionPane.showMessageDialog(janela, msgCuriosidade, "Curiosidade", JOptionPane.INFORMATION_MESSAGE);
        int resp = JOptionPane.showConfirmDialog(janela, "Quer tentar jogar?", 
                "Selecione uma opção", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            janela.dispose();
            proxJanela.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(janela, "Obrigada por jogar!\nAté a próxima!");
            janela.dispose();
            proxJanela.dispose();
        }
    }
}
