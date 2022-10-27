package source;

public class Stats {
    protected int strength;
    protected int dexterity;
    protected int constitutoin;
    protected int intellect;
    protected int wisdom;
    protected int charisma;

    public Stats(int str, int dex, int con, int in, int ws, int ch){
        strength = str;
        dexterity = dex;
        constitutoin = con;
        intellect = in;
        wisdom = ws;
        charisma = ch;
    }

    public static Stats generate(){
        Dice dice = new Dice();

        return new Stats(dice.roll(), dice.roll(), dice.roll(), dice.roll(),
                dice.roll(), dice.roll());
    }

    public void print(){
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Constitution: " + constitutoin);
        System.out.println("Intellect: " + intellect);
        System.out.println("Wisdom: " + wisdom);
        System.out.println("Charisma: " + charisma);
    }
}
