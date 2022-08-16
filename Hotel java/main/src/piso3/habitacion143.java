package piso3;
import java.util.Scanner;
import Habitaciones.Phabitaciones;
public class habitacion143 {
    public void cuarto2(){
        Scanner pregunta = new Scanner(System.in);
        System.out.println("Habitacion 143, piso 3");
        System.out.println("""
            contenido de la habitacion:\n
            2 Camas \n
            2 televisor smart tv \n
            Wi-fi 5G \n
            2 baños \n
            servicio al cuarto: 24h  \n
            PRECIO: 290.000 POR NOCHE \n""");
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

