import java.time.LocalDate;

public class Lab05{
    public static void main(String[] args) throws Exception
    {
        User john = new User("John", 2000, 12, 18);
        john.displayInfo();
        john.displayHappyBirthday();

        Admin nicolas = new Admin("Nicolas", 2005, 12, 18);
        nicolas.displayInfo();
        nicolas.displayHappyBirthday();


        nicolas.displayInfo(true);
        nicolas.displayInfo(false);

        User today = new User();

    }
}