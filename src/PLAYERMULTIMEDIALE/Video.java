package PLAYERMULTIMEDIALE;

public class Video extends ElementoMultimediale implements Riproducibile{
    int volume;
    int luminosita;
    int durata;

    public Video(String titolo, int volume, int luminosita, int durata ) {
        super(titolo);
        this.volume = volume;
        this.luminosita = luminosita;
        this.durata=durata;
    }

    @Override
    public int getDurata() {
        return durata;
    }


    @Override
    public void play() {  for (int i = 0; i < durata ; i++) {
        System.out.println("In riproduzione il brano:" +  " " + titolo +  "/" + " Volume lettore: " + "!".repeat(volume) + "/" + " La luminosità del lettore è: " + "*".repeat(luminosita));

    }


    }
    public void aumentaLuminosita(){
       if(luminosita<10) luminosita++;}
    public void  abbassaLuminosita(){
        if (luminosita<0) luminosita--;

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
