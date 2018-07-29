package clientservice;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Citizen {

    private String name;
    private String surname;
    private String fatherName;
    private String passport;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    public String getFatherName() {
        return fatherName;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
    public String getPassport() {
        return passport;
    }


    public void registerCitizen() {
        System.out.println("Здесь будет метод регистрации гражданина");
    }

    public void respectLaw() {

    }

    public void commitCrime() {

    }

    public void giveUp() {

    }

    public void hide() {

    }

    public void writeStatement() {

    }

    public void takeAwayStatement() {

    }

    public void payBribe() {

    }

}