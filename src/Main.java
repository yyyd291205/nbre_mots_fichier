import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
        File monfichier = new File("fichierexo.txt");
        Scanner lignefichier = new Scanner(monfichier);

        int compteurmots = 0;
        while (lignefichier.hasNextLine()) {
            String line = lignefichier.nextLine();


            if (line.charAt(0) != ' ') {
                compteurmots++;
            }

            for (int i = 0; i < line.length() - 1; i++) {
                if (line.charAt(i) == ' ' && line.charAt(i + 1) != ' ') {
                    compteurmots++;
                }
            }


        }
            lignefichier.close();

            System.out.println("nombre de mots du fichier est: " + compteurmots);
        }

        catch (FileNotFoundException exception) {
                System.out.println("Le fichier est introuvable.");
            }

    }
}
