
package P2_Prob1_Etapa2_F;

import java.security.InvalidParameterException;

public class AIFFAdapter implements FormatoAudio{

    private AIFFSuperPlayer aiff;
    
    public AIFFAdapter(String arquivo) {
        abrir(arquivo);
    }    

    @Override
    public void abrir(String s) {
        if (s == null) {
            throw new InvalidParameterException("Nome de arquivo de audio INVÁLIDO!");
        }
        aiff = new AIFFSuperPlayer(s);
    }

    @Override
    public void reproduzir() {
        aiff.play();
    }

    @Override
    public void pausar() {
        aiff.pause();
    }

    @Override
    public void parar() {
        aiff.stop();
        aiff.setCursor(0);
    }

    @Override
    public void avancar(int i) {
        aiff.setCursor(aiff.pause() + i);
        aiff.play();
    }

    @Override
    public void retornar(int i) {
        aiff.setCursor(aiff.pause() - i);
        aiff.play();
    }

    @Override
    public void liberar() {
        aiff.release();
    }   
}
