package TiendaElectrodomesticos;

import java.util.ArrayList;

/**
 * Clase ejecutable
 */
public class AplicacionElectrodomesticos2 {
 
    public static void main(String[] args) {
   
        //Creamos un array de Electrodomesticos
        ArrayList<Electrodomestico> listaElectrodomesticos =new ArrayList<Electrodomestico>();
   
        //Asignamos cada una de las posiciones como queramos
        listaElectrodomesticos.add(new Electrodomestico(200, 60, 'C', "Verde"));
        listaElectrodomesticos.add(new Lavadora(150, 30));
        listaElectrodomesticos.add(new Televisor(500, 80, 'E', "negro", 42, false));
        listaElectrodomesticos.add(new Electrodomestico());
        listaElectrodomesticos.add(new Electrodomestico(600, 20, 'D', "gris"));
        listaElectrodomesticos.add(new Lavadora(300, 40, 'Z', "blanco", 40));
        listaElectrodomesticos.add(new Televisor(250, 70));
        listaElectrodomesticos.add(new Lavadora(400, 100, 'A', "verde", 15));
        listaElectrodomesticos.add(new Televisor(200, 60, 'C', "naranja", 30, true));
        listaElectrodomesticos.add(new Electrodomestico(50, 10));
   
        //Creamos las variables que usaremos para almacenar la suma de los precios
        double sumaElectrodomesticos=0;
        double sumaTelevisiones=0;
        double sumaLavadoras=0;
   
        //Recorremos el array invocando el metodo precioFinal
        for(int i=0;i<listaElectrodomesticos.size();i++){
            /*
             * Cuando una Television o una Lavadora este en la posicion del array actual,
             * pasara por su clase y por la de electrodomestico, ya que una television es un electrodomestico.
             * Ejecutamos en cada uno su propia version del metodo precioFinal
             */
   
            if(listaElectrodomesticos.get(i) instanceof Electrodomestico){
                sumaElectrodomesticos+=listaElectrodomesticos.get(i).precioFinal();
            }
            if(listaElectrodomesticos.get(i) instanceof Lavadora){
                sumaLavadoras+=listaElectrodomesticos.get(i).precioFinal();
            }
            if(listaElectrodomesticos.get(i) instanceof Televisor){
                sumaTelevisiones+=listaElectrodomesticos.get(i).precioFinal();
            }
        }
        
        System.out.println(listaElectrodomesticos.toString());
   
        //Mostramos los resultados
        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisiones);
   
    }
   
}