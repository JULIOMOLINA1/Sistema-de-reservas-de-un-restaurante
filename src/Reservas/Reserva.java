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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Name: " + fullName + "DNI: " + idNumber + "Date & time: "
                                              + dateTime + "Group of : " + numPeople);
    }
}
