package l12inheritance.ex5;

public class Ex5 {
    public static void main(String[] args) {
        ShapeInventory inventory = new ShapeInventory();

        inventory.add(new Rectangle(5, 4));
        inventory.add(new Rectangle(3,2));
        inventory.add(new Rectangle(6,7));

        inventory.displayInventory();
    }
}
