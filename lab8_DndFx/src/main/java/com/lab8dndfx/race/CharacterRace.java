package com.lab8dndfx.race;

import com.lab8dndfx.Stats;
import com.lab8dndfx.visitor.DataElement;
import com.lab8dndfx.visitor.DataElementsVisitor;

import java.util.TreeMap;

public abstract class CharacterRace implements DataElement {
    protected String name;
    protected Stats bonuses;

    public abstract int getRaceBonuses(String type);

    public abstract void battleCry();

    @Override
    public TreeMap accept(DataElementsVisitor visitor){
        return visitor.visit(this);
    }
}
