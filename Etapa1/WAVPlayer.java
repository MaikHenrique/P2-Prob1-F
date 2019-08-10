
package Problema1;


public class WAVPlayer implements FormatoAudio{
    @Override
    public void abrir(String s) {
        System.out.println("abrindo arquivo blabla.wav");
    }

    @Override
    public void reproduzir() {
        System.out.println("reproduzindo arquivo blabla.wav");
    }

    @Override
    public void pausar() {
        System.out.println("arquivo blabla.wav pausado");
    }

    @Override
    public void parar() {
        System.out.println("reprodução do arquivo blabla.wav encerrada");
    }

    @Override
    public void avancar(int i) {
        System.out.println("avança para o próximo arquivo *.wav");
    }

    @Override
    public void retornar(int i) {
        System.out.println("retorna para o arquivo anterior");
    }

    @Override
    public void liberar() {
        System.out.println("memória liberada");
    }        

    @Override
    public void pararSimples() {
        liberar();
    }

    @Override
    public void reproduzirSimples(String s) {
        abrir(s);
        reproduzir();
    }
}
