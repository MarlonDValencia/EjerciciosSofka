package Ejercicio18;

public class Main {
    public static void main(String[] args) {
        Videojuego[] juegos = new Videojuego[5];
        Serie[] series = new Serie[5];
        juegos[0] = new Videojuego("Resident Evil",30,"Terror","Capcom");
        juegos[1] = new Videojuego("Dragon Ball Fighterz",400,"Fighting","Bandai");
        juegos[2] = new Videojuego("League Of Legends",1200,"MOBA","Riot Games");
        juegos[3] = new Videojuego("Grand Theft Auto",200);
        juegos[4] = new Videojuego("Dark Souls",310,"RPG","FromSoftware");

        series[0] = new Serie("Breaking Bad",5,"Ficción","Vince Gilligan");
        series[1] = new Serie("Naruto",2,"Shonen","Masashi Kishimoto");
        series[2] = new Serie("Dragon Ball Z",3,"Shonen","Akira Toriyama");
        series[3] = new Serie("Harry Potter","J.K Rowling");
        series[4] = new Serie("Game Of Thrones",8,"Ficción", "David Benioff");

        juegos[3].entregar();
        juegos[4].entregar();
        series[0].entregar();
        series[2].entregar();
        series[1].entregar();

        int seriesDevueltas = 0;
        int juegosDevueltos = 0;
        for(int i=0;i< juegos.length;i++){
            if(series[i].isEntregado()){
                seriesDevueltas += 1;
                series[i].devolver();
            }
            if(juegos[i].isEntregado()){
                juegosDevueltos += 1;
                juegos[i].devolver();
            }
        }
        System.out.println("Devolviste "+juegosDevueltos+" juegos");
        System.out.println("Devolviste "+seriesDevueltas+" series");

        Videojuego LongestGame = new Videojuego();
        Serie LongestSerie = new Serie();

        for(int i=0;i< juegos.length;i++){
            if(series[i].getNumero_temporadas() > LongestSerie.getNumero_temporadas()){
                LongestSerie = series[i];
            }
            if(juegos[i].getHoras_estimadas() > LongestGame.getHoras_estimadas()){
                LongestGame = juegos[i];
            }
        }

        System.out.println("Juego Más Largo = "+LongestGame);
        System.out.println("Serie Más Larga = "+LongestSerie);

    }
}
