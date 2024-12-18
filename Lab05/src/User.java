import java.time.LocalDate;

public class User
{
    protected String name ;
    protected LocalDate dob ;
    public LocalDate today = LocalDate.now();
    public  User()
    {
        this.name = null;
        this.dob= LocalDate.now();
    }
    public  User(String name , int year, int month, int day)
    {
        this.name = name;
        this.dob= LocalDate.of(year,month, day);
    }
    public boolean isBirthday()
    {
        return today.getMonth() == dob.getMonth() && today.getDayOfMonth() == dob.getDayOfMonth();
    }

    public void displayHappyBirthday() {

        if(isBirthday())
            System.out.println("Happy birthday " + this.name + "!");
    }

    public void displayInfo()    //เเสดง
    {
        System.out.println("Name :" +name);
        System.out.println("Locale :" +dob);
    }
    public String getName()
    {
        return name;
    }
    public LocalDate getDob() {
         return dob;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setDob(LocalDate dob)
    {
        this.dob = dob;
    }

}


