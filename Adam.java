public class Adam {
    protected String birthday = "00.00.0000", name = "Один", surname = "";
    protected Integer birthCertificateNumber = 1;

    @Override
    public String toString() {
        return "Adam{" +
                "birthday='" + birthday + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthCertificateNumber=" + birthCertificateNumber +
                '}';
    }
}
