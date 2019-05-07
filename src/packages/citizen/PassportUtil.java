package packages.citizen;

/**
 * Created by Brainacad3 on 07.05.2019.
 */
public class PassportUtil {
    public String female;
    public String male;
    public int spousehold;
    static void marriageRegistrate(int spousehold,String male,String female){
        PassportUtil passportUtil=new PassportUtil();
        passportUtil.spousehold=spousehold;
        passportUtil.male=male;
        passportUtil.female=female;
    }public void setFemale(String female){
        this.female="Zhenya";
    }public void setMale(String male){
        this.male="Alex";
    }public void setSpousehold(int spousehold){
        this.spousehold=23124;
    }

    public static void main(String[] args) {

    }
}
