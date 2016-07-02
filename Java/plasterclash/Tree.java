/**
 * Represents a Tree.
 *
 * @author Krishna Ramdeep
 * @version 1.0
 */
public class Tree extends Zone {
    /**
     * Creates a tree
     */
    public Tree() {
        super();
        for (int i = 1; i <= 10; i++) {
            this.add(new GardenBread());
        }
        this.add(new Gnome());
    }
}