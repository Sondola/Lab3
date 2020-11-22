public enum Move {
    STAND("вставать"),
    VISIT("прекратить посещения"),
    EAT("лучше питаться"),
    RECOVER("восстановиться силы");

    private String move;
    private String time;

    Move(String move) {
        this.move = move;
    }

    public String getTime(int _time) {
        switch (_time) {
            case(1): this.time = "Через 1 неделю ";
                break;
            case(2): this.time = "Через 2 недели ";
                break;
            case(3): this.time = "Через 3 недели ";
                break;
            case(4): this.time = "Через 4 недели ";
                break;
            default: this.time = "Через " + _time + " недель ";
        }
        return this.time;
    }

    public String getMove() {
        return this.move;
    }
}
