package Classes;

public class ClassFactory {
    public static CharacterClass getClass(String type){
        if("classes.Assassin".equalsIgnoreCase(type))
            return new Assassin();
        else if ("classes.Fighter".equalsIgnoreCase(type))
            return new Fighter();

        return null;
    }
}
