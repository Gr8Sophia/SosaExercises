
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class Main {
    public static void main(String[] args) {
        System.out.println("Benutzung: ");
        System.out.println("java -cp src Main iterativ Otto");
        System.out.println("java -cp src Main rekursiv Otto");
        System.out.println("java -cp src Main iterativ file datei.txt");
        System.out.println("java -cp src Main rekursiv file datei.txt");
        System.out.println("java -cp src Main benchmark datei.csv");
        System.out.println();

        if (args.length < 2) {
            return;
        }
        if (args[0].equalsIgnoreCase("benchmark")) {
            Benchmark benchmark = new Benchmark();
            benchmark.benchmarkSchreiben(args[1]);
            System.out.println("Benchmark wurde geschrieben nach: " + args[1]);
            return;
        }
        Palindrom palindrom = waehleAlgorithmus(args);
        String wort = wortLesen(args);
        boolean ergebnis = palindrom.istPalindrom(wort);

        if (ergebnis) {
            System.out.println(wort + ": ist ein Palindrom");
        } else {
            System.out.println(wort + ": ist kein Palindrom");
        }

    }

    private static Palindrom waehleAlgorithmus(String[] args) {
        if (args[0].equalsIgnoreCase("iterativ")) {
            return new PalindromIterativ();
        }

        if (args[0].equalsIgnoreCase("rekursiv")) {
            return new PalindromRekursiv();
        }
        throw new IllegalArgumentException("So ein Algorithmus gibt es nicht");
    }

    private static String wortLesen(String[] args) {
        if (args[1].equalsIgnoreCase("file")) {
            if (args.length < 3) {
                throw new IllegalArgumentException("Dateiname fehlt");
            }
            return dateiLesen(args[2]);
        }
        return args[1];
    }


    private static String dateiLesen(String dateiname) {
        try {
            return Files.readString(Path.of(dateiname)).trim();
        } catch (IOException e) {
            throw new RuntimeException("Datei konnte nicht gelesen werden: " + dateiname, e);
        }
    }
}

