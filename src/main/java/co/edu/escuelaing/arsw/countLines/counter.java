package co.edu.escuelaing.arsw.countLines;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class counter {
    public static int countlines(String, filePath, String linetype){
        Path file = Paths.get(filePath);
        int numberofLines = 0;

        Charset charset = Charset.forName("UTF-8");
        try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                numberofLines += 1;
                System.out.println(line);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
        return numberofLines;
    }
}
