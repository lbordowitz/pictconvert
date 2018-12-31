import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1 || "-h".equals(args[0])) {
            System.err.println("Please provide a file name as a command line argument");
            return;
        }
        String raw_filename = args[0];
        try {
            File filename = new File(raw_filename);
            BufferedImage image = ImageIO.read(filename);
            File outputfile = new File(filename.getName() + ".png");
            ImageIO.write(image, "png", outputfile);
        } catch (IOException e) {
            System.err.println("Error reading or writing file: " + raw_filename);
            e.printStackTrace();
        }
    }
}
