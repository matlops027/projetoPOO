public class Musica extends Audio implements Interegir {

    @Override
    public void reproduzirAudio() {
        System.out.println("Musica reproduzida");
        this.totalReproducao += 1;
    }

    @Override
    public void curtirAudio() {
        System.out.println("Musica curtida!");
        this.curtidas += 1;
    }
}
