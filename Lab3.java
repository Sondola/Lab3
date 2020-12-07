public class Lab3 {
    public static void main(String[] args) {
        Doctor doc = new Doctor("Доктор", "мужчина");
        Patient kozel = new Patient("Козлик", "мужчина");
        Treatment treatment = new Treatment();

        System.out.println();
        Receipt receipt1 = doc.makeReceipt(true, true);
        receipt1.addMed(Medicine.VITAMINS, Medicine.ANTIBIOTICS, Medicine.PYRAMIDON, Medicine.STREPTOCIDE, Medicine.NOVOCAIN, Medicine.EMULSION);

        System.out.println();
        receipt1.showMedIn();
        receipt1.showMedOut();

        System.out.println();
        treatment.takePills(kozel, receipt1);
        System.out.println(doc.permission(2, true, Move.STAND));

        System.out.println();
        System.out.println(kozel.success());
        System.out.println(doc.permission(1, true, Move.STOPVISIT));

        System.out.println();
        System.out.println(treatment.toDo(kozel, Move.EAT, Move.RECOVER));
    }
}
