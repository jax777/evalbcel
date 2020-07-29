
import java.io.*;

public class eval {
    public eval() {

    }

    public String exec(String cmd) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(cmd).getInputStream()));
        String line;
        while((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line).append("\n");
        }
        String res = stringBuilder.toString();
        return res;
    }
    public static void main(String[] args) {
    }
}