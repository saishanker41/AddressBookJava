

public class Contact {

    private final String firstName;
    private final String lastName;
    private final String address;
    private final String city;
    private final String state;
    private final int zip;
    private final long phoneNumber;
    private final String email;

    public Contact(String firstName, String lastName, String address, String city, String state, int zip, long phoneNumber, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String toString(){
        return "First Name : " +this.firstName + "\nLast Name : " +this.lastName + "\nAddress : " +this.address + "\nCity : " +city + "\nState : " +this.state + "\nZip : " +this.zip + "\nPhone Number : " +this.phoneNumber + "\nEmail : " +this.email;
    }

    public static void main(String[] args) {
         System.out.println("adding contacts class");
    }

}
