public class Treatment implements Successable{
    private boolean treat;

    public Treatment() {}

    @Override
    public void success(boolean s) {
        this.treat = s;
        if (treat)
            System.out.println("Лечение прошло успешно");
        else
            System.out.println("Лечение прошло неуспешно");
    }

    public void toDo(Patient patient, Move moveWhat) {
        System.out.println("Пациенту " + patient.getName() + " нужно " + moveWhat.getMove());
    }

    public void toDo(Patient patient, Move moveWhat, Move moveFor) {
        System.out.println("Пациенту " + patient.getName() + " нужно " + moveWhat.getMove() + ", чтобы " + moveFor.getMove());
    }

    public String toString() {
        return "Происходит лечение";
    }

    public int hashCode() {
        int sum = 0;
        for (int i = 0; i<18; i++) {
            if (treat)
                sum = (sum + (int)"Лечение прошло успешно".charAt(i)) % 1000000000;
            else
                sum = (sum + (int)"Лечение прошло неуспешно".charAt(i)) % 1000000000;
        }
        return sum;
    }

    public boolean equals(Treatment treatment) {
        return (this.treat == treatment.treat);
    }
}
