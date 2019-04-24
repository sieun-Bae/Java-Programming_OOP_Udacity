class Item{
    int weight;
}

/** There can be bunch of items that extends Item class.
*/

class Crossbow extends Item {}
class Map extends Item {}

class Bag{
    int currentWeight;

    public boolean canAddItem(Item item) {
        if(currentWeight + item.weight > 20) {
            return false;
        } else{
            return true;
        }
    }

    public void addItem(Item item) {
        currentWeight += item.weight;
    }
}

public class bagItem {
    public static void main(String [] args){
        Bag bag = new Bag();

        Crossbow crossbow = new Crossbow();

        if(bag.canAddItem(crossbow)){
            bag.addItem(crossbow);
        }
    }
}
