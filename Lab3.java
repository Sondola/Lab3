public class Lab3 {
    public static void main(String[] args) {
        Doctor doc = new Doctor("Доктор");
        Patient kozel = new Patient("Козлик");
        Treatment treatment = new Treatment();

        doc.makeReceipt();
        Receipt receipt = new Receipt(true, true);
        receipt.addMedIn(Medicine.VITAMINS, Medicine.ANTIBIOTICS, Medicine.PYRAMIDON, Medicine.STREPTOCIDE, Medicine.NOVOCAIN);
        receipt.showMedIn();
        receipt.addMedOut(Medicine.EMULSION);
        receipt.showMedOut();

        treatment.success(true);
        doc.permission(2, true, Move.STAND);

        kozel.success(true);
        doc.permission(1, true, Move.VISIT);

        treatment.toDo(kozel, Move.EAT, Move.RECOVER);
    }
}
