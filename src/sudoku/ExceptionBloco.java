/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author laura
 */
public class ExceptionBloco {
    PreencheBloco botaoBloco = new PreencheBloco();
    
    public void mostraExcecao (JFrame janela) {
        JOptionPane.showMessageDialog(janela, "Você precisa primeiramente clicar em um botão", "Alerta", JOptionPane.ERROR_MESSAGE);
    }
    
    public void trataExcecao (JTextField bloco, JFrame janela, JButton botao) {
        try {
            botaoBloco.setBlocoSelecionado(bloco);
            botaoBloco.preencherBloco(botao);
        } catch(Exception e) {
            mostraExcecao(janela);
        }
    }
}
