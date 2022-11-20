public class Eva extends Adam{
    protected String birthday = "00.00.0000", name = "Фригг", surname = "";
    protected Integer birthCertificateNumber = 2;

    @Override
    public String toString() {
        return "Eva{" +
                "birthday='" + birthday + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthCertificateNumber=" + birthCertificateNumber +
                '}';
    }
}
