import java.util.LinkedList;

public class Receipt {
    private LinkedList<Medicine> medicinesIn = new LinkedList<Medicine>();
    private LinkedList<Medicine> medicinesOut = new LinkedList<Medicine>();

    public Receipt(boolean in, boolean out) {
        System.out.println("Рецепт состоял из:");
        if (in)
            System.out.println("прием внутрь");
        if (out)
            System.out.println("наружное применение");
        System.out.println();
    }

    public void addMedIn(Medicine... medicines) {
        for (Medicine med : medicines)
            medicinesIn.add(med);
    }

    public void addMedOut(Medicine... medicines) {
        for (Medicine med : medicines)
            medicinesOut.add(med);
    }

    public void showMedIn() {
        System.out.println("Для приема внутрь:");
        for (Medicine med : medicinesIn) {
            System.out.println(med.getName());
        }
        System.out.println();
    }
    public void showMedOut() {
        System.out.println("Для наружного применения:");
        for (Medicine med : medicinesOut) {
            System.out.println(med.getName());
        }
        System.out.println();
    }

    public String toString() {
        return "Это.. ну.. просто какой-то рецепт";
    }

    public int hashCode() {
        int sum = 0;
        for (Medicine med : medicinesIn) {
            sum = sum + (int)med.getName().length();
        }
        for (Medicine med : medicinesOut) {
            sum = sum + (int)med.getName().length();
        }
        return sum;
    }

    public boolean equals(Receipt receipt) {
        return (this.medicinesOut==receipt.medicinesOut && this.medicinesIn==receipt.medicinesIn);
    }
}
