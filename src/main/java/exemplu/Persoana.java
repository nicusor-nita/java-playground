package exemplu;

public class Persoana {
    private String firstName;
    private String lastName;

    private Integer age;

    public Persoana(String firstName,String lastName){
        this(firstName,lastName,null);
    }

    public Persoana(String firstName,String lastName,Integer age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
