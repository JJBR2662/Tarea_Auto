package trabajo.en.clase;

import java.util.Scanner;

public class TrabajoEnClase {
    
   /*Buenas noches Inge,
    Este programa lo quise hacer para un taller o un mecanico en este caso el cajero, entonces lo que hace es identificar
    el precio para modificar un carro a full dependiendo de su color, queria hacerlo dependiendo la marca, pero decidi
    hacerlo asi para que sea mas facil y no confuncirnos en una palabra y que cobre la cantidad inadecuada.
    
    Lo hice asi por que vi que el de Rodrigo lo estaba haciendo dinamico con unas cosas de unas llaves, entonces yo
    decidi hacer un programa que ayudara a un taller mecanico. En si lo que pedia el trabajo en clase esta en todo el
    programa, pero intente hacerlo mas dinamico para ponerme en una situacion de la vida real.
    */

    public static void main(String[] args) {
        System.out.println("Solo se pueden listar 20 carros por pagina!");
        System.out.println("");
        Auto[] lista = new Auto[20];
        double[] fulltuning = new double[20];
        int cont = 0;
        boolean continuar = false;
        double ganancia = 0;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese el nombre del carro: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese el motor del carro: ");
            String motor = sc.nextLine();
            System.out.print("Ingrese el color del carro: ");
            String color = sc.nextLine();
            System.out.print("Ingrese el year del carro: ");
            int year = sc.nextInt();
            Scanner otro = new Scanner(System.in);
            System.out.print("Ingrese la marca del carro: ");
            String marca = otro.nextLine();
            System.out.print("Ingrese el nombre del propietario del carro: ");
            String owner = otro.nextLine();
            System.out.print("Ingrese el precio del carro: ");
            double precio = otro.nextDouble();
            Auto carro = new Auto(nombre, motor, color, year, marca, owner, precio);
            lista[cont]=carro;
            fulltuning[cont]=comparar(carro);
            System.out.println("El precio a pagar es de: "+fulltuning[cont]);
            cont++;
            Scanner respu = new Scanner(System.in);
            System.out.print("Desea ingresar otro auto?[s/n]");
            char resp = respu.next().charAt(0);
            System.out.println();
            if (resp=='n') {
                break;
            }   
        }while((cont<20)||(continuar==false));
        
        for (int i = 0; i < cont; i++) {
            System.out.println(i+". "+lista[i]+", ingreso= "+fulltuning[i]);
        }
        for (int j = 0; j < fulltuning.length; j++) {
            ganancia+=fulltuning[j];
        }
        System.out.println();
        System.out.println("Ingreso total en esta lista es de: "+ganancia);
    }
    
    public static double comparar(Auto carro){
        double precio=0;
        String minus = carro.color.toLowerCase();
        if (minus.equals("rojo")) {
            precio=carro.precio*0.05;
        }else if(minus.equals("azul")){
            precio=carro.precio*0.07;
        }else if (minus.equals("verde")){
            precio=carro.precio*0.03;
        }else if(minus.equals("blanco")){
            precio=carro.precio*0.02;
        }else if (minus.equals("negro")) {
            precio=carro.precio*0.10;
        }else{
            precio=carro.precio*0.15;
        }
        return precio;
    }
    
}
