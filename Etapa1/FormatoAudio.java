
package Problema1;


public interface FormatoAudio {
    public void abrir(String s);
    public void reproduzir();
    public void pausar();
    public void parar();
    public void avancar(int i);
    public void retornar(int i);
    public void liberar();
    public void pararSimples();
    public void reproduzirSimples(String s);    
}
