import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class HTMLExample {

    public static void main(String[] args) {
        HTMLExample ex = new HTMLExample();
    }

    public HTMLExample() {
        try {
            URL url = new URL("https://en.wikipedia.org/wiki/Jaguar");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(url.openStream())
            );
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.toLowerCase();
                if (line.contains("/wiki") && line.contains("<p>")) {
                    int n = line.indexOf("/wiki");
                    int endIndex = line.indexOf("\"", n);
                    if (endIndex > n) {
                        String wikiLink = line.substring(n, endIndex);
                        System.out.println(wikiLink);
                    }
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
