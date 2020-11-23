public class Patient extends Human implements Successable{
    private String name;

    public Patient() {
        this.name = "Пациент";
    }

    public Patient(String _name) {
        super(_name, "пациент");
        this.name = _name;
    }

    @Override
    public void success(boolean suc) {
        if (suc)
            System.out.println("Пациент " + this.name + " выздоровел");
        else
            System.out.println("Пациент " + this.name + " не выздоровел");
    }
}
