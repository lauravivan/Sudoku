/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author laura
 */
public class DesafioOuIndividual {
    boolean desafio;
    boolean individual;
    
    public DesafioOuIndividual() {
    }
    
    public void desafioOuIndividual(String escolha) {
        if (escolha.toLowerCase().equals("desafio")) {
            setDesafio(true);
        } else if (escolha.toLowerCase().equals("individual")) {
            setIndividual(true);
        }
    } 
    
    public void setDesafio(boolean desafio) {
        this.desafio = desafio;
    }
    
    public boolean isDesafio() {
        return this.desafio;
    }
    
    public void setIndividual(boolean individual) {
        this.individual = individual;
    }
    
    public boolean isIndividual() {
        return this.individual;
    }
}
