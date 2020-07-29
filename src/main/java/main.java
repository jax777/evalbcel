import com.sun.org.apache.bcel.internal.classfile.Utility;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class main {
    public static void main(String []args) throws Exception{
        //There also should be compiled class file,not java file
        Path path = Paths.get("/Users/777apple/Desktop/tmp/evalbcel/target/classes/eval.class.gz");
        byte[] bytes = Files.readAllBytes(path);
        String code = Utility.encode(bytes, false);
        System.out.println("$$BCEL$$" + code);
        byte[] nbytes = Utility.decode(code, true);
        System.out.println("$$BCEL$$" + code);
    }
}
