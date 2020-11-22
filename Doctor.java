public class Doctor extends Human{
    private String name;

    public Doctor() {
        this.name = "Доктор";
    }

    public Doctor(String _name) {
        super(_name, "доктор");
        this.name = _name;
    }

    public void makeReceipt() {
        System.out.println(this.name + " выписал рецепт");
    }

    public void permission(int when, boolean per, Move move) {
        if (per)
            System.out.println(move.getTime(when) + this.name + " разрешил " + move.getMove());
        else
            System.out.println(move.getTime(when) + this.name + " не разрешил " + move.getMove());
        System.out.println();
    }
}
