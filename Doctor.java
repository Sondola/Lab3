public class Doctor extends Human{

    public Doctor() {
        super();
    }

    public Doctor(String name, String sex) {
        super(name, sex,"доктор");
    }

    public Doctor(String name, String sex, int age) {
        super(name, sex,"доктор", age);
    }

    public Receipt makeReceipt(boolean in, boolean out) {
        Receipt receipt1 = new Receipt(in, out);
        return receipt1;
    }

    public String permission(int when, boolean per, Move move) {
        if (per)
            return move.getTime(when) + this.getName() + " разрешил " + move.getMove();
        else
            return move.getTime(when) + this.getName() + " не разрешил " + move.getMove();
    }
}
