import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class Task01 {
    public static void main(String[] args) throws StackOverflowError { 
        InputStream inputStream; 
        try {
            String[] strings = {"asdf", "asdf"};
            String strings1 = strings[2]; 
            test () ;
            int a = 1 / 0;
            inputStream = new FileInputStream("sdafgdsaf");
        } catch (Throwable e) { 
            e.printStackTrace () ;
        } finally {
            System.out.println("Я всё равно выполнился!");
        }
        System.out.println("Я жив!");
    }

    public static void test() throws IOException {
        File file = new File("1"); 
        file.createNewFile();
        FileReader reader = new FileReader(file); 
        reader.read();
        test();
    }
}