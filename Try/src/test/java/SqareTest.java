import org.testng.Assert;
import org.testng.annotations.Test;

public class SqareTest {

  @Test
  public void testArea () {
    Square s = new Square(5);
    Assert.assertEquals(s.area(), 25.0);
  }

  @Test
  public void testArea2 () {
    Square s = new Square(7);
    Assert.assertEquals(s.area(), 49);
  }

}
