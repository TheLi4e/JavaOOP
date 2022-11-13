import java.util.Date;
import java.util.Random;

public class Children extends Adam implements ToDo{
    private String patronymic;
    private Children mother, father;
    private Adam firstFather;
    private Eva firstMother;
    private Children spose;

    public Children(Children mother, Children father, String name, String surname, String patronymic, String birthday,
                    Integer birthCertificateNumber){
    this.mother = mother;
    this.father = father;
    this.name = name;
    this.surname = surname;
    this.patronymic = patronymic;
    this.birthday = birthday;
    this.birthCertificateNumber = birthCertificateNumber;
    }

    public Children(Eva mother, Adam father, String name, String surname, String patronymic, String birthday,
                    Integer birthCertificateNumber){
        this.firstFather = father;
        this.firstMother = mother;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.birthCertificateNumber = birthCertificateNumber;
    }
    public Integer takeBCN() {
        Random random = new Random(System.currentTimeMillis());
        int bCN = 1 + random.nextInt(10000000 - 1 + 1);
        return bCN;
    }

    @Override
    public void makeFamily(Children parent1, Children parent2) {
        System.out.println(parent1.name+" и "+parent2.name+ " теперь семья");
        parent1.spose = parent2;
        parent2.spose = parent1;
    }

    @Override
    public Children makeChild(Children mother, Children father) {
        Date date = new Date();
        String birthday = date.toString();
        char[] firstPart=new char[3];
        father.name.getChars(0,3,firstPart,0);
        char[] secondPart=new char[3];
        mother.name.getChars(0,3,secondPart,0);
        String name = String.join("",String.valueOf(firstPart), String.valueOf(secondPart));
        String surname = father.surname;
        String patronymic = String.join("",father.name,"ich");
        Integer birthCertificateNumber = takeBCN();
        Children child = new Children(mother,father,name,surname,patronymic,birthday,birthCertificateNumber);
        return child;
    }

    @Override
    public String toString() {
        return "Children{" +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthCertificateNumber=" + birthCertificateNumber +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}

