package Ejercicio17;
public class Main {
    public static void main(String[] args) {
        double precioTV = 0;
        double precioLav = 0;
        double precioElec = 0;
        Electrodomestico[] lista = new Electrodomestico[10];
        lista[0] = new Television(290.0,false);
        lista[1] = new Lavadora(200,40.0);
        lista[2] = new Television(290.0,true);
        lista[3] = new Lavadora(130.0,80.0);
        lista[4] = new Television(290.0,true);
        lista[5] = new Electrodomestico(290.0,"Blanco",'F',26.0);
        lista[6] = new Lavadora(350.0,80.0);
        lista[7] = new Television(290.0,true);
        lista[8] = new Television(290.0,false);
        lista[9] = new Lavadora(290.0,35.0);

        for(int i = 0;i< lista.length;i++){
            System.out.println("El precio inicial de este electrodomestico es: $" + lista[i].getPrecioBase() + " Y el precio final es: $"+lista[i].precioFinal());
        }

        for(Electrodomestico electrodomestico : lista){
            if(electrodomestico instanceof Television){
                precioTV += electrodomestico.precioFinal();
            }else if(electrodomestico instanceof Lavadora){
                precioLav += electrodomestico.precioFinal();
                }else{
                precioElec += electrodomestico.precioFinal();
            }
            }
        System.out.println("En total gastate:\n"+"$"+precioTV+" En televisores\n"+"$"+precioLav+" En lavadoras\n"+"$"+precioElec+" En el resto de electrodomesticos\n"+"Para un total de $"+(precioTV+precioElec+precioLav));
        }
    }
