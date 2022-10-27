package source;

public class Main {

    public static void main(String[] args){
        Character player = new Character("Ahmad", "Shawawreh");

        Stats temp = Stats.generate();
        player.setAttributes(temp);
        player.printSheet();

        CareTaker careTaker = new CareTaker();
        Memento mem = new Memento(temp);

        mem.setState(temp);
        careTaker.add(mem.getState());

        temp = Stats.generate();
        temp.print();
        mem.setState(temp);
        careTaker.add(mem.getState());

        mem.setState(careTaker.get(0));
        temp = mem.getState();
        temp.print();
    }
}
