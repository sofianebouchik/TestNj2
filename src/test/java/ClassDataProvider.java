import org.testng.annotations.DataProvider;

public class ClassDataProvider {
    @DataProvider(name = "data")
    public static Object[][] dtProvider(){
        Object[][] a=new Object[1][2];
        a[0][0]="5";
        a[0][1]="6";
        return a;

    }
}
