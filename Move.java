public enum Move {
    STAND("вставать"),
    STOPVISIT("прекратить посещения"),
    EAT("хорошо питаться"),
    RECOVER("восстановить силы");

    private String move;
    private String time;

    Move(String move) {
        this.move = move;
    }

    public String getTime(int time) {
        switch (time) {
            case(1): this.time = "Через 1 неделю ";
                break;
            case(2): this.time = "Через 2 недели ";
                break;
            case(3): this.time = "Через 3 недели ";
                break;
            case(4): this.time = "Через 4 недели ";
                break;
            default: this.time = "Через " + time + " недель ";
        }
        return this.time;
    }

    public String getMove() {
        return move;
    }
}
