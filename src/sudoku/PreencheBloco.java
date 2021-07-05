/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author laura
 */
public class PreencheBloco {
    private JTextField bloco;
    private JButton botao;
    
    public PreencheBloco() {
    }
    
    public void preencherBloco(JButton botao) {
        String numBotao = botao.getText();
        JTextField blocoSelecionado = getBlocoSelecionado();
        if (numBotao.equals("X")) {
            blocoSelecionado.setText("");
        } else {
            blocoSelecionado.setText(numBotao);
        }
    }
    
    public void setBlocoSelecionado(JTextField bloco) {
        this.bloco = bloco;
    }
    
    public JTextField getBlocoSelecionado() {
        return this.bloco;
    }
    
    public void setBotaoSelecionado(JButton botao) {
        this.botao = botao;
    }
    
    public JButton getBotaoSelecionado() {
        return this.botao;
    }
    
}
