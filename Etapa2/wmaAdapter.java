
package P2_Prob1_Etapa2_F;

public class wmaAdapter implements FormatoAudio {

    private wmaPlay wma;
    
    public wmaAdapter(String arquivo) {
        abrir(arquivo);
    }   
    
    @Override
    public void abrir(String s) {       
        wma.setFile(s);
        wma.open();
        wma.setLocatio(0);
    }

    @Override
    public void reproduzir() {
        wma.open();
        if (wma.getLocation() != 0) {
            wma.setLocatio(wma.getLocation());
        } else {
            wma.setLocatio(0);
        }    
        wma.play();
    }

    @Override
    public void pausar() {
        wma.stop();
        if (wma.getLocation() != 0) {
            wma.setLocatio(0);
        }
        wma.getLocation();
        
    }

    @Override
    public void parar() {
        wma.stop();
        wma.stop();
    }

    @Override
    public void avancar(int i) {
        wma.setLocatio(wma.getLocation() + i);
    }

    @Override
    public void retornar(int i) {
        wma.setLocatio(wma.getLocation() - i);
    }

    @Override
    public void liberar() {
        wma = null;
        System.gc(); //Coletor de lixo
    }    
}
