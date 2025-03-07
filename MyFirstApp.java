import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyFirstApp {
    public static void main(String[] args) {

        String fullName = "Richard R. Batenga"; 
        System.out.println("My name is " + fullName + ".");

       
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);

        
        System.out.println("The current date and time is: " + formattedDateTime);
    }
}