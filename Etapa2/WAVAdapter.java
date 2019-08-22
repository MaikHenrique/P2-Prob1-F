
package P2_Prob1_Etapa2_F;

import java.security.InvalidParameterException;

public class WAVAdapter implements FormatoAudio{
    
    public WAVAdapter(String arquivo) {
        abrir(arquivo);
    }
    
    private WAVPlayer wav;

    @Override
    public void abrir(String s) {
         if (s == null) {
            throw new InvalidParameterException("Nome de arquivo de audio INVÁLIDO!");
        }
        wav = new WAVPlayer(s);
    }

    @Override
    public void reproduzir() {
        wav.play();
    }

    @Override
    public void pausar() {
        wav.stop();
    }

    @Override
    public void parar() {
        wav.stop();
        wav.reward(0);
    }

    @Override
    public void avancar(int i) {
        wav.forward(i * 1000);
    }

    @Override
    public void retornar(int i) {
        wav.reward(i * 1000);
    }

    @Override
    public void liberar() {
        wav = null;
        System.gc(); //Chama o coletor de lixo
    }
}
