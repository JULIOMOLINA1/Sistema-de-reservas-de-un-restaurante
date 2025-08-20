package Reservas;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reserva implements ShowData{
    private String fullName;
    private int idNumber;
    private LocalDateTime dateTime;
    private int numPeople;

    public Reserva(String fullName, int idNumber, LocalDateTime dateTime, int numPeople){
        this.fullName = fullName;
        this. idNumber = idNumber;
        this.dateTime = dateTime;
        this.numPeople = numPeople;
    }

    public int getIdNumber(){
        return idNumber;
    }
    public void showReserva(){
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.printf("Name: %s             DNI: %d           Date & time: %s               Group of: %d.%n"
                , fullName, idNumber, dateTime.format(formatDate), numPeople);
    }
}
