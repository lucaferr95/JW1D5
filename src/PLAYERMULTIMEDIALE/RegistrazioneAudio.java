package PLAYERMULTIMEDIALE;

public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile {
int volume;
int durata;

    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    @Override
    public int getDurata() {
        return durata;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata ; i++) {
            System.out.println("In riproduzione il brano:" +  " " + titolo +  "/" + " " + " Volume lettore: " + "!".repeat(volume));
        }
    }

    @Override
    public String getTitolo() {
        return super.getTitolo();
    }

    public void alzaVolume(){
        if (volume<10) volume++;
    }
    public void  abbassaVolume(){
        if(volume>0) volume--;
    }
}
