package Reservas;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ManageReservations {
    private List<Reserva> reservations=new ArrayList<>();

    public void AddReservations( String fullName, int idNumber, LocalDateTime dateTime, int numPeople ){
        reservations.add(new Reserva(fullName, idNumber, dateTime, numPeople ));
        System.out.println("Reservation successfully recorded. ");
    }
    public void SeeReservationForId(int idNumber){
        for(Reserva r : reservations){
            if(r.getIdNumber()==idNumber){
                r.showReserva();
                return;
            }
        }
        System.out.println("No reservation found with that DNI: " + idNumber);
    }
}
