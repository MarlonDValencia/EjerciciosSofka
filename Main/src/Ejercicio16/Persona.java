package Ejercicio16;

public class Persona {
    private String nombre;
    private String sexo = "H";
    private int edad;
    private String DNI;
    private double peso;
    private double altura;

    public Persona() {
        this.DNI = this.generarDNI();
    }

    public Persona(String nombre, int edad, String sexo) {
        this.DNI = this.generarDNI();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, String sexo, double altura, double peso) {
        this.DNI = this.generarDNI();
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        double IMC = this.peso / (this.altura * this.altura);
        if (IMC < 20) {
            return -1;
        } else if (IMC >= 20 && IMC <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    private boolean comprobarSexo(char Sexo) {
        if (Character.compare(Sexo, 'H') == 0 || Character.compare(Sexo, 'M') == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String IMC = "";
        if (this.calcularIMC()==-1){
            IMC = "Estás por debajo de tu peso ideal";
        }else if(this.calcularIMC()==0){
            IMC = "Estás en tu peso ideal";
        }else{
            IMC = "Estás por encima de tu peso ideal";
        }
        return "Nombre: " + nombre + " Sexo: " + sexo + " Edad: " + edad + " DNI: " + DNI + " Peso: " + peso + " Altura: " + altura +" IMC: "+IMC;
    }

    private String generarDNI(){
        int num = (int) (Math.random() * (99999999 + 1 - 10000000)) + 10000000;
        int resto = num%23;
        String[] Letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        String DNIGen = String.valueOf(num).concat(Letras[resto]);
        this.DNI = DNIGen;
        return DNIGen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}


