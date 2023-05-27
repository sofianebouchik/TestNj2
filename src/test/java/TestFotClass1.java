import org.classToTest.Class1;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Array;

public class TestFotClass1 {
  @Test(dataProvider ="data",dataProviderClass = ClassDataProvider.class)
    public void firstTest(String a,String b){

      Class1 class1 = new Class1();
      System.out.println(class1.add(a,b));
  }


}
