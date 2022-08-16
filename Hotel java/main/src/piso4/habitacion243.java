package piso4;
import java.util.Scanner;
import Habitaciones.Phabitaciones;
public class habitacion243 {
    public void cuarto3(){
        Scanner pregunta = new Scanner(System.in);
        System.out.println("Habitacion 243, piso 4");
        System.out.println("""
            contenido de la habitacion:\n
            2 Camas \n
            2 televisor smart tv \n
            Wi-fi 5G \n
            2 baños \n
            Con vista al mar
            servicio al cuarto: 24h  \n
            PRECIO: 360.000 POR NOCHE \n""");
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

