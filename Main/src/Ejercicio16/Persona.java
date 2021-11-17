package Ejercicio16;
public class Persona {
    private String nombre;
    private String sexo;
    private int edad;
    private int DNI;
    private double peso;
    private double altura;

    public Persona(){
    }
    public Persona(String nombre, int edad, String sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    public Persona(String nombre,String sexo,int edad,int DNI,double peso,double altura){
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.DNI = DNI;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(){
        double IMC = this.altura/(this.peso*this.peso);
        if(IMC < 20){
            return -1;
        }else if(IMC>20 && IMC<25){
            return 0;
        }else{
            return 1;
        }
    }

    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }

    public boolean comprobarSexo(char Sexo){
        if(this.sexo.equals(Sexo)){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        return "Nombre: "+nombre+" Sexo: "+sexo+" Edad: "+edad+" DNI: "+DNI+" Peso: "+peso+" Altura: "+altura;
    }

    public int generarDNI(){

    }
}
