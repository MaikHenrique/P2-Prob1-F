
package P2_Prob1_Etapa2_F;

public class AACAdapter implements FormatoAudio{
    
    private AACPlayer aac;
    
    public AACAdapter(String arquivo) {
        abrir(arquivo);
    }

    @Override
    public void abrir(String s) {
        aac = new AACPlayer(s);
        aac.open();
        aac.setLocation(0);
    }

    @Override
    public void reproduzir() {
        aac.play();
    }

    @Override
    public void pausar() {
        aac.stop();
    }

    @Override
    public void parar() {
        aac.stop();
        aac.stop();
    }

    @Override
    public void avancar(int i) {
        aac.setLocation(aac.getLocation() + i);
    }

    @Override
    public void retornar(int i) {
        aac.setLocation(aac.getLocation() - i);
    }

    @Override
    public void liberar() {
        aac = null;
        System.gc();
    }
}
