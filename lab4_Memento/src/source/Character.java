package source;

public class Character {
    private String name;
    private String dndClass;
    private Stats attributes;

    public Character(String name, String dndClass){
        this.name = name;
        this.dndClass = dndClass;
    }

    public void setAttributes(Stats attributes){
        this.attributes = attributes;
    }

    public void printSheet(){
        System.out.println("[+] \n==== " + name.toUpperCase() + " ====");
        System.out.println("Class: " + dndClass);
        attributes.print();
    }


}
