package Ejercicio18;

public class Videojuego implements Entregable{
    protected String titulo;
    protected int horas_estimadas = 10;
    protected boolean entregado = false;
    protected String genero;
    protected String company;

    public Videojuego(){

    }

    public Videojuego(String Titulo, int Horas){
        this.titulo = Titulo;
        this.horas_estimadas = Horas;
    }

    public Videojuego(String titulo, int horas_estimadas, String genero, String company) {
        this.titulo = titulo;
        this.horas_estimadas = horas_estimadas;
        this.genero = genero;
        this.company = company;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras_estimadas() {
        return horas_estimadas;
    }

    public void setHoras_estimadas(int horas_estimadas) {
        this.horas_estimadas = horas_estimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Nombre del juego: " + this.titulo + ", Horas Estimadas: " + this.horas_estimadas + ", Género: " + this.genero + ", Compañía: " + this.company;
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
        int seasons = this.horas_estimadas;
        int ff = ((Integer) horas_estimadas).compareTo(((Videojuego) o).getHoras_estimadas());
    }
}
