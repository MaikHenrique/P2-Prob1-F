/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1;

/**
 *
 * @author Maik
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        wmaPlay wma = new wmaPlay();
        AIFFSuperPlayer aiff = new AIFFSuperPlayer();
        WAVPlayer wav = new WAVPlayer();
        
        wma.reproduzirSimples("arquivo audio");
        wma.pausar();
        wma.parar();
        wma.avancar(0);
        wma.retornar(0);
        wma.pararSimples();
        
        aiff.reproduzirSimples("arquivo audio");
        aiff.pausar();
        aiff.parar();
        aiff.avancar(0);
        aiff.retornar(0);
        aiff.pararSimples();
        
        wav.reproduzirSimples("arquivo audio");
        wav.pausar();
        wav.parar();
        wav.avancar(0);
        wav.retornar(0);
        wav.pararSimples();
        
    }
}
