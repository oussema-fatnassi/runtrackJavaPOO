package Jour07.Job0;

public class Person {
    public String name;
    public String surname;
    protected String dateOfBirth;
    protected String placeOfBirth;
    private String address;
    private String phoneNumber;

    public Person(String name, String surname, String dateOfBirth, String placeOfBirth, String address, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Date of birth: " + dateOfBirth);
        System.out.println("Place of birth: " + placeOfBirth);
        System.out.println("Address: " + address);
        System.out.println("Phone number: " + phoneNumber);
    }

    public static void main(String[] args) {
        Person person = new Person("John", "Doe", "01/01/1970", "Paris", "1 rue de Paris", "0123456789");
        person.display();
    }
}
