public class IteratorApp {

    public static void printItemsFrom(Iterator iterator)
    {
        while (!iterator.isDone())
        {
            System.out.println(iterator.currentItem());
        }
    }
}
