public class Main {
    public static void main(String[] args) {
        Musica evidencias = new Musica();
        Podcast spaceToday = new Podcast();
        ControleMidia controle = new ControleMidia();

        evidencias.setTitulo("Evidencias");
        evidencias.setDuracao(200);
        evidencias.setClassificacao(9);

        controle.reproduzirMidia(evidencias);
        controle.curtirMidia(evidencias);

        spaceToday.setTitulo("Serjão dos foguete");
        spaceToday.setDuracao(1360);
        spaceToday.setClassificacao(10);

        controle.reproduzirMidia(spaceToday);
        controle.curtirMidia(spaceToday);

        System.out.println("Nome: " + evidencias.getTitulo());
        System.out.println("Duração: " + evidencias.getDuracao());
        System.out.println("Classificação: " + evidencias.getClassificacao());
        System.out.println("Curtidas: " + evidencias.getCurtidas());
        System.out.println("Reproduções: " + evidencias.getTotalReproducao());

        System.out.println("Nome: " + spaceToday.getTitulo());
        System.out.println("Duração: " + spaceToday.getDuracao());
        System.out.println("Classificação: " + spaceToday.getClassificacao());
        System.out.println("Curtidas: " + spaceToday.getCurtidas());
        System.out.println("Reproduções: " + spaceToday.getTotalReproducao());

    }
}