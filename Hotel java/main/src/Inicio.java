import java.util.Scanner;

import Piso5.habitacion300;
import piso1.habitacion23;
import piso3.habitacion143;
import piso4.habitacion243; 
public class Inicio{
public static void main(String[] args){
    System.out.println("Bienvenido al hotel 'EL Continental'");
    Scanner preguntas = new Scanner(System.in);
    while(true){
    System.out.println("Estas son las habitaciones del hotel, por favor seleccione una para saber la disponibilidad");
    System.out.println("Habitacion 1: Suite normal (1)");
    System.out.println("Habitacion 2: Suite premium (2)");
    System.out.println("Habitacion 3: Suite premium con vista al mar (3)");
    System.out.println("Habitacion 4: Suite presidencial (4)");
    Integer respuesta = preguntas.nextInt();
    if(respuesta > 5){
    System.out.println("Por favor ingresa una opcion valida");
    continue;
    }
    else if(respuesta==1) {
    habitacion23 cuarto1 = new habitacion23();
    cuarto1.Cuarto1();
    }
    else if(respuesta==2) {
        habitacion143 cuarto2 = new habitacion143();
        cuarto2.cuarto2();
    }
    else if(respuesta==3) {
        habitacion243 cuarto3 = new habitacion243();
        cuarto3.cuarto3();
    }
    else if(respuesta==4) {
        habitacion300 cuarto4 = new habitacion300();
        cuarto4.cuarto4();
    }
    preguntas.close();
}
}
}

