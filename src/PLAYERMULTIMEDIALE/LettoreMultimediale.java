package PLAYERMULTIMEDIALE;

import java.util.Scanner;

public class LettoreMultimediale {
    public static void main(String[] args) {
        //----------------------AUDIO---------------
//        RegistrazioneAudio traccia1= new RegistrazioneAudio("Cry Baby", 2, 5);
//        traccia1.play();
//
//        //ABBASSO IL VOLUME DI 1
//        traccia1.abbassaVolume();
//        traccia1.play();
//
//        //ALZA IL VOLUME DI 2
//        traccia1.alzaVolume();
//        traccia1.alzaVolume();
//        traccia1.play();
//    }
        //----------------------VIDEO---------------------------------

        Video videoclip = new Video("Ngueee", 3, 4, 2);
        videoclip.play();
        //ABBASSO IL VOLUME E LA LUMINOSITA DI 1
      videoclip.abbassaVolume();
      videoclip.abbassaLuminosita();
      videoclip.play();
        //---------------------IMMAGINE-------------------------------
        Image foto= new Image("Programmatore che piange", 2);
        foto.show();
        //AUMENTO LA LUMINOSITA DI 1
        foto.aumentaLuminosita();
        foto.show();

        //Eseguo Show se scelgo foto o play se scelgo un video

        Scanner scanner = new Scanner(System.in);
        System.out.println("Esegui foto o video");
        String esegui = scanner.nextLine();

        switch (esegui.toLowerCase()) {
            case "foto":
                foto.show();
                break;
            case "video":
                videoclip.play();
                break;
            default:
                System.out.println("Scelta non valida");
        }

    }}
