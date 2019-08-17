/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nfrasson
 */
public class WAVAdapter implements WAVPlayer {

    public WAVAdapter(String arquivo) {
        
        abrir(arquivo);
        
    }
    
    FormatoAudio fa;
    
    public void play(){
          
        fa.reproduzir();
        
    }
    
    public void stop(){
        
        fa.parar();
        
    }
    
    public int foward (int f){
        fa.avancar();
        return f;
    }
    
    public int rewind (int r){
        fa.retornar();
        return r;
    }
    
    protected void finalize(){
        fa.liberar();
    }
    
    @Override
    private void abrir(String s) {
        System.out.println("abrindo arquivo blabla.wav");
    }

    @Override
    private void reproduzir() {
        System.out.println("reproduzindo arquivo blabla.wav");
    }

    @Override
    private void pausar() {
        System.out.println("arquivo blabla.wav pausado");
    }

    @Override
    private void parar() {
        System.out.println("reprodução do arquivo blabla.wav encerrada");
    }

    @Override
    private void avancar(int i) {
        System.out.println("avança para o próximo arquivo *.wav");
    }

    @Override
    private void retornar(int i) {
        System.out.println("retorna para o arquivo anterior");
    }

    @Override
    private void liberar() {
        System.out.println("memória liberada");
    }        

    @Override
    private void pararSimples() {
        liberar();
    }

    @Override
    private void reproduzirSimples(String s) {
        abrir(s);
        reproduzir();
    }
    
    
}
