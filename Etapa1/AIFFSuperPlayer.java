
package Problema1;


public class AIFFSuperPlayer implements FormatoAudio{
    @Override
    public void abrir(String s) {
        System.out.println("abrindo arquivo blabla.aiff");
    }

    @Override
    public void reproduzir() {
        System.out.println("reproduzindo arquivo blabla.aiff");
    }

    @Override
    public void pausar() {
        System.out.println("arquivo blabla.aiff pausado");
    }

    @Override
    public void parar() {
        System.out.println("reprodução do arquivo blabla.aiff encerrada");
    }

    @Override
    public void avancar(int i) {
        System.out.println("avança para o próximo arquivo *.aiff");
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
