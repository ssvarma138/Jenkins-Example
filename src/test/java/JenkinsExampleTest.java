import org.junit.Assert;
import org.junit.Test;



public class JenkinsExampleTest {
   JenkinsExample obj = new JenkinsExample();
   @Test
   public void addTest(){
      int result= obj.add(10,14);
      Assert.assertEquals(24,result);
   }
   @Test
   public void subTest(){
      int result = obj.sub(24,14);
      Assert.assertEquals(10,result);
   }
}
