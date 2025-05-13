import org.junit.jupiter.api.Test;

public class TestGoogleUserIterator {

    @Test
    public void testGoogleIterator()
    {
        Aggregate googleAggregate = new GoogleUserAggregate();
        IteratorApp.printItemsFrom(googleAggregate.createIterator());

    }

    @Test
    public void testFacebookIterator()
    {
        Aggregate facebookAggregate = new FacebookUserAggregate();
        IteratorApp.printItemsFrom(facebookAggregate.createIterator());
    }

    @Test
    public void testCREIterator()
    {
        Aggregate creAggregate = new CREUserAggregate();
        IteratorApp.printItemsFrom(creAggregate.createIterator());
    }
}
