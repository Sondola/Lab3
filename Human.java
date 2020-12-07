abstract class Human implements Namable{
    private String name;
    private String occupasion;
    private String sex;
    private int age;

    public Human() {}

    public Human(String name) {
        this.name = name;
        System.out.println("Появление " + this.name);
    }


    public Human(String name, String sex) {
        this.name = name;
        this.sex = sex;
        System.out.println("Появление " + this.name + " (" + this.sex + ")");
    }

    public Human(String name, String sex, String occupasion) {
        this.name = name;
        this.occupasion = occupasion;
        this.sex = sex;
        System.out.println("Появление " + this.name + " (" + this.occupasion + ", " + this.sex + ")");
    }

    public Human(String name, String sex, String occupasion, int age) {
        this.name = name;
        this.occupasion = occupasion;
        this.sex = sex;
        this.age = age;
        System.out.println("Появление " + this.name + " (" + this.occupasion + ", " + this.sex + ", " + this.age + " лет)");
    }


    @Override
    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getOccupasion() {
        return occupasion;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Его/ее называли когда-то " + this.getName();
    }

    public int hashCode() {
        int sum = 0;
        for (int i = 0; i<this.getName().length(); i++) {
            sum = (sum + this.getName().hashCode() * 23 + this.getOccupasion().hashCode() * 15) % 10000000;
        }
        return sum;
    }

    public boolean equals(Object object) {
        Human human = (Human) object;
        return (this.getName()==human.getName() && this.getSex() == human.getSex() && this.getAge() == human.getAge());
    }
}
