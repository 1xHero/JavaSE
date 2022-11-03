package source;
import source.Race.ElfFactory;
import source.Race.RaceFactory;
import source.classes.ClassFactory;
import java.util.Objects;


public class Main {

    public static void main(String[] args){

        Character character = new Character("Hero",
                Objects.requireNonNull(ClassFactory.getClass("classes.Paladin")),
                RaceFactory.getRace(new ElfFactory()));
        character.setAttributes(Stats.generate());
        character.addRaceBonuses();
        character.printSheet();

    }
}
