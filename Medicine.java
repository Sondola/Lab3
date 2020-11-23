public enum Medicine implements Namable{
    VITAMINS("витаминчики", Condition.IN),
    ANTIBIOTICS("антибиотики", Condition.IN),
    EMULSION("синтомициновая эмульсия для прикладывания к распухшей шее", Condition.OUT),
    STREPTOCIDE("стрептоцид", Condition.IN),
    PYRAMIDON("пирамидон", Condition.IN),
    NOVOCAIN("новокаин", Condition.IN);

    private String name;
    private Condition con;

    Medicine(String med, Condition con) {
        this.name = med;
        this.con = con;
        //System.out.println("Выписано новое лекарство: " + med);
    }

    public Condition getCondition() {
        return con;
    }

    public String getName() {
        return name;
    }
}
