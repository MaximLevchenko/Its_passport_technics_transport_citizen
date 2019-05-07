package packages.transport;

/**
 * Created by Brainacad3 on 07.05.2019.
 */
public class Passport {
    public String passport;
    public String passportOnTechnics;
    public String passportOnCar;

    void setPassport(String passport) {
        this.passport = passport;
    }

    public String getPassport() {
        return passport;
    }

    void setPassportOnTechnics(String passportOnTechnics) {
        this.passportOnTechnics = passportOnTechnics;
    }

    public String getPassportOnTechnics() {
        return passportOnTechnics;
    }

    void setPassportOnCar(String passportOnCar) {
        this.passportOnCar = passportOnCar;
    }

    public String getPassportOnCar() {
        return passportOnCar;
    }

    public static void main(String[] args) {
        Passport passport=new Passport();
    }
}

