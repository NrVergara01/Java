package Piso5;
import java.util.Scanner;
import Habitaciones.Phabitaciones;
public class habitacion300 {
    public void cuarto4(){
        Scanner pregunta = new Scanner(System.in);
        System.out.println("Habitacion 300, piso 5");
        System.out.println("""
            contenido de la habitacion:\n
            2 Camas matrimoniales \n
            3 televisor smart tv \n
            Wi-fi 5G \n
            3 baños \n
            Mini bar incluido
            Con vista al mar
            servicio al cuarto: 24h  \n
            PRECIO: 500.000 POR NOCHE \n""");
        System.out.println("¿Acepta la habitacion? (1)Yes - (2)No");
        Integer respuesta = pregunta.nextInt();
        if(respuesta == 1){
            System.out.println("Has aceptado la habitacion, la recepcionista te hara entrega de la llave. GRACIAS! \n");
        }else{
            System.out.println("No has aceptado la habitacion, si te interesa otra habitacion  \n");
            Phabitaciones regreso = new Phabitaciones();
            regreso.PHabitaciones();
        }
        pregunta.close();
    }
}

