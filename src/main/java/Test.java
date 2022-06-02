import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Test {
    public static void main(String[] args) {

        Screen s = new Screen();
        try{
            s.click("c:\\Users\\Hrom\\Documents\\11.sikuli\\1654199190349.png");
            s.doubleClick("c:\\Users\\Hrom\\Documents\\11.sikuli\\1654200964434.png");
            s.wait("c:\\Users\\Hrom\\Documents\\11.sikuli\\1654201043994.png", 2);

        }
        catch(FindFailed e){
            e.printStackTrace();
        }
    }
}
