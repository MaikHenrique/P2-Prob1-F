
package P2_Prob1_Etapa2_F;

public class MP3Adapter implements FormatoAudio{
    
    private MP3DJ mp3;
    
    public MP3Adapter(String s) {
        abrir(s);
    }

    @Override
    public void abrir(String s) {
        mp3 = new MP3DJ();
        mp3.setFile(s);
    }

    @Override
    public void reproduzir() {
        mp3.play();
    }

    @Override
    public void pausar() {
        mp3.stop();
    }

    @Override
    public void parar() {
        mp3.stop();
        mp3.reward(mp3.reward(0));
    }

    @Override
    public void avancar(int i) {
        mp3.forward(i);
    }

    @Override
    public void retornar(int i) {
        mp3.reward(i);
    }

    @Override
    public void liberar() {
        mp3 = null; 
        System.gc();
    }
}
