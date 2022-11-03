
package source;

public class Main {

    public static void main(String[] args){

        Character character = new Character(
                "Hero",
                ClassFactory.getClass("Paladin"));
        character.setAttributes(Stats.generate());
        character.printSheet();

    }
}
