public class Patient extends Human implements Successable{
    private int health = 0;

    public Patient() {
        super("Пациент", "пациент");
    }

    public Patient(String name, String sex) {
        super(name, sex, "пациент");
    }

    public Patient(String name, String sex, int age) {
        super(name, sex, "пациент", age);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health += health;
    }

    @Override
    public String success() {
        if (health > 10)
            return "Пациент " + this.getName() + " выздоровел";
        else
            return "Пациент " + this.getName() + " еще не выздоровел";
    }
}
