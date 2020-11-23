abstract class Human implements Namable{
    private String name;
    private String occupasion;

    public Human() {}

    public Human(String name, String occupasion) {
        this.name = name;
        this.occupasion = occupasion;
        System.out.println("Появление " + this.name + " (" + this.occupasion + ")");
    }

    @Override
    public String getName() {
        return name;
    }


    public String toString() {
        return "Его/ее называли когда-то " + this.getName();
    }

    public int hashCode() {
        int sum = 0;
        for (int i = 0; i<this.getName().length(); i++) {
            sum = (sum + this.getName().hashCode() * 23) % 10000000;
        }
        return sum;
    }

    public boolean equals(Human human) {
        return (this.getName()==human.getName() && this.hashCode()==human.hashCode());
    }
}
