public class Passenger {
    private String name;
    private int phoneNumber;
    private String uniqueIdentifier;

    public Passenger(String inputName, int phoneNumber, String inputUniqueIdentifier){
        this.name = inputName;
        this.phoneNumber = phoneNumber;
        this.uniqueIdentifier = inputUniqueIdentifier;
    }
    public void setPhoneNumber(int newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
    }
    public String update(){
        return "The passenger name is " + this.name + ", their phone number is " + this.phoneNumber + ", and their unique identifier is " + this.uniqueIdentifier + ".";
    }

}
