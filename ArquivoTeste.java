import java.util.HashMap;
import java.util.Map;

public class ArquivoTeste {
    public static void main(String[] args) {
        Map<String,String> teste = new HashMap<String, String>();
        for (int i = 0; i < 4; i++) {
            teste.put(Integer.toString(i), "i + 2");
        }

        teste.forEach((k, v) -> System.out.printf("\n \nkey: %s | value: %s", k, v));

    }
}
