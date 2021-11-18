package Ejercicio18;
public class Serie implements Entregable{
    protected String titulo;
    protected int numero_temporadas = 3;
    protected boolean entregado = false;
    protected String genero;
    protected String creador;

    public Serie(){
    }

    public Serie(String Titulo, String Creador){
        this.titulo = Titulo;
        this.creador = Creador;
    }

    public Serie(String Titulo, int Seasons, String Genero, String Creador){
        this.titulo = Titulo;
        this.numero_temporadas = Seasons;
        this.genero = Genero;
        this.creador = Creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumero_temporadas() {
        return numero_temporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumero_temporadas(int numero_temporadas) {
        this.numero_temporadas = numero_temporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Titulo de la serie: " + this.titulo + ", Temporadas: " + this.numero_temporadas + ", Entregado: " + this.entregado + ", Genero: " + this.genero + ", Creador de la serie: " + this.creador;
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public void compareTo(Object o) {
        int seasons = this.numero_temporadas;
        int ff = ((Integer) numero_temporadas).compareTo(((Serie) o).getNumero_temporadas());
    }
}
