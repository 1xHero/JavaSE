package com.lab8dndfx.dnd;

import com.lab8dndfx.Stats;
import com.lab8dndfx.classes.ClassFactory;
import com.lab8dndfx.memento.CareTaker;
import com.lab8dndfx.race.DwarfFactory;
import com.lab8dndfx.race.HumanFactory;
import com.lab8dndfx.race.RaceAbstractFactory;
import com.lab8dndfx.race.RaceFactory;
import com.lab8dndfx.visitor.ElementVisitor;
import com.lab8dndfx.Character;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Model {
    private static Model inst = new Model();
    private List<Character> items = new ArrayList<Character>();
    private Stats stats;
    private CareTaker careTaker;
    private Character character = null;
    private ElementVisitor visitor = new ElementVisitor();
    private JSONObject jsonObject = new JSONObject();
    private JSONArray jsonArray = new JSONArray();

    public static Model getInst() {
        return inst;
    }

    public List<Character> getItems(){
        return items;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public CareTaker getCareTaker() {
        return careTaker;
    }

    public void setCareTaker(CareTaker careTaker) {
        this.careTaker = careTaker;
    }

    public Character getCharacter() {
        return character;
    }

    public ElementVisitor getVisitor() {
        return visitor;
    }

    public void setVisitor(ElementVisitor visitor) {
        this.visitor = visitor;
    }

    public JSONObject getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(TreeMap treeMap) {
        this.jsonObject.putAll(treeMap);
    }

    public JSONArray getJsonArray() {
        return jsonArray;
    }

    public void addToJArray(JSONObject jsonObject){
        this.jsonArray.add(jsonObject);
    }

    public void setCharacter(String name, String clas, String race){
        RaceAbstractFactory factory = null;
        if(race.contains("Human"))
            factory = new HumanFactory();
        else if (race.contains("Dwarf"))
            factory = new DwarfFactory();

        this.character = new Character(name, ClassFactory.getClass(clas), RaceFactory.getRace(factory));
    }

    public Character getItem(int i){
        return items.get(i);
    }

    public void addItem(Character item){
        this.items.add(item);
    }

    public  void deleteItem(int item){
        this.items.remove(item);
    }
}
