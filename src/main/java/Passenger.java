public class Passenger {
    private String name;
    private String phoneNumber;
    private String uniqueIdentifier;

    public Passenger(String inputName, String phoneNumber, String inputUniqueIdentifier){
        this.name = inputName;
        this.phoneNumber = phoneNumber;
        this.uniqueIdentifier = inputUniqueIdentifier;
    }
    public String update(){
        return "The passenger name is " + this.name + ", their phone number is " + this.phoneNumber + ", and their unique identifier is " + this.uniqueIdentifier + ".";
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
