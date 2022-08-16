package piso1;
import java.util.Scanner;
import Habitaciones.Phabitaciones;
public class habitacion23 {
    public void Cuarto1(){
        Scanner pregunta = new Scanner(System.in);
        System.out.println("Habitacion 23, piso 1");
        System.out.println("""
            contenido de la habitacion:\n
            1 Cama para 2 personas \n
            1 televisor smar tv \n
            Wi-fi 5G \n
            1 baño \n
            servicio al cuarto: 7:30 AM - 9:30 PM \n
            PRECIO: 100.000 POR NOCHE \n""");
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

