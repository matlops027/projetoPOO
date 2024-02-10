public class Podcast extends Audio implements Interegir{
    @Override
    public void reproduzirAudio() {
        System.out.println("Podcast reproduzido!");
        this.totalReproducao += 1;
    }

    @Override
    public void curtirAudio() {
        System.out.println("Podcast curtido!");
        this.curtidas += 1;
    }
}
