import org.testng.annotations.DataProvider;

public class ClassDataProvider {
    @DataProvider(name = "data")
    public static Object[][] dtProvider(){
        Object[][] a=new Object[2][7];
        a[0][0]="5";
        a[0][1]="6";
        a[1][0]="13";
        a[1][1]="9";
        return a;

    }
}
