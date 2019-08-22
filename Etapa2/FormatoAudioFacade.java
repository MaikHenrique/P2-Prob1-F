
package P2_Prob1_Etapa2_F;

public class FormatoAudioFacade {
    private static FormatoAudio fa;
    
    public static void reproduzirSimples(String arquivo) {
        fa = FormatoAudioFactory.getFormatoAudio(arquivo);
        fa.abrir(arquivo);
        fa.reproduzir();
    }

    public static void pararSimples() {
        fa.parar();
        fa.liberar();
    }
}
