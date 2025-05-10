package PLAYERMULTIMEDIALE;

public class Image extends ElementoMultimediale {
    int luminosita;


    public Image(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;

    }

    @Override
    public String getTitolo() {
        return super.getTitolo();
    }

    public Image(String titolo) {
        super(titolo);
    }
    public void show() {

            System.out.println("Immagine: " + " " + titolo + "/" + " La luminosità del lettore è: " + "*".repeat(luminosita));

        }
    public void aumentaLuminosita(){
        if(luminosita<10) luminosita++;}
    public void  abbassaLuminosita(){
        if (luminosita<0) luminosita--;

    }

    }
