
package P2_Prob1_Etapa2_F;

import java.security.InvalidParameterException;

public class FormatoAudioFactory {
    
    public static FormatoAudio getFormatoAudio(String arq) {
        if (arq != null) {
            String extensao = arq;

            switch (extensao) {
                case "wma":
                    return new wmaAdapter(arq);
                case "aiff":
                    return new AIFFAdapter(arq);
                case "wav":
                    return new WAVAdapter(arq);
                case "aac":
                    return new AACAdapter(arq);
                case "mp3":
                    return new MP3Adapter(arq);
                default:
                    throw new InvalidParameterException("Formato de arquivo de audio INVÁLIDO!");
            }
        }
        return null;
    }
}
