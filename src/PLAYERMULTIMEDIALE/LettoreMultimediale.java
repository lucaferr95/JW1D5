package PLAYERMULTIMEDIALE;

import java.lang.reflect.Array;
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
        Image foto = new Image("Programmatore che piange", 2);
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
        //----------------ARRAY--------------------
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

                for (int i = 0; i < 5; i++) {
                    System.out.println("Inserisci tipo elemento (1: Immagine, 2: Video, 3: Audio):");
                    int sceltaTipo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Titolo: ");
                    String titolo = scanner.nextLine();

                    switch (sceltaTipo) {
                        case 1:
                            System.out.print("Luminosità: ");
                            int lum = scanner.nextInt();
                            elementi[i] = new Image(titolo, lum);
                            break;
                        case 2:
                            System.out.print("Durata: ");
                            int durataVideo = scanner.nextInt();
                            System.out.print("Volume: ");
                            int volVideo = scanner.nextInt();
                            System.out.print("Luminosità: ");
                            int lumVideo = scanner.nextInt();
                            elementi[i] = new Video(titolo, durataVideo, volVideo, lumVideo);
                            break;
                        case 3:
                            System.out.print("Durata: ");
                            int durataAudio = scanner.nextInt();
                            System.out.print("Volume: ");
                            int volAudio = scanner.nextInt();
                            elementi[i] = new RegistrazioneAudio(titolo, durataAudio, volAudio);
                            break;
                        default:
                            System.out.println("Scelta non valida. Riprova.");
                            i--;
                    }
                }

                int scelta;
                do {
                    System.out.println("Scegli un elemento da 1 a 5 da eseguire, oppure 0 per uscire:");
                    scelta = scanner.nextInt();

                    if (scelta >= 1 && scelta <= 5) {
                        ElementoMultimediale elemento = elementi[scelta - 1];

                        if (elemento instanceof Video) {
                            ((Video) elemento).play();
                        } else if (elemento instanceof RegistrazioneAudio) {
                            ((RegistrazioneAudio) elemento).play();
                        } else if (elemento instanceof Image) {
                            ((Image) elemento).show();
                        }

                    } else if (scelta != 0) {
                        System.out.println("Scelta non valida.");
                    }

                } while (scelta != 0);

                System.out.println("Fine esecuzione. Saluta Andonioooo");
            }
        }
