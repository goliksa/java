import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
  @Test
  public void testDistance () {
    Point p1 = new Point(2, 2);
    Point p2 = new Point(6, 5);
    Assert.assertEquals(p1.distance(p2), 5);
  }

  @Test
  public void testDistance2 () {
    Point p1 = new Point(2, 2);
    Point p2 = new Point(5, 5);
    Assert.assertEquals(p1.distance(p2), 4.242640687119285);
  }
}
