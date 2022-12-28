package com.lab8dndfx.visitor;

import com.lab8dndfx.Stats;

import java.util.TreeMap;
import com.lab8dndfx.Character;
import com.lab8dndfx.classes.CharacterClass;
import com.lab8dndfx.race.CharacterRace;

public interface DataElementsVisitor {
    public TreeMap visit(Character character);
    public TreeMap visit(CharacterClass characterClass);
    public TreeMap visit(CharacterRace characterRace);
    public TreeMap visit(Stats stats);
}
