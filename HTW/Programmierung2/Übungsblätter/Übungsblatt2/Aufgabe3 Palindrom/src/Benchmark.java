import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Benchmark {
int[] laengen = new int[] {10,30,50,100,500,1000,2000,5000};
private Palindrom iterativ = new PalindromIterativ();
private Palindrom rekursiv = new PalindromRekursiv();


    public void benchmarkSchreiben(String dateiname){
        String[] palindrome = erzeugePalindrome(laengen);
        StringBuilder csv = new StringBuilder();
        csv.append("laenge,iterativ_ns,rekursiv_ns\n");

        for (int i=0; i<palindrome.length; i++){
            String wort = palindrome[i];

            long zeitIterativ = zeitMessen(iterativ,wort);
            long zeitRekursiv = zeitMessen(rekursiv,wort);

            csv.append(laengen[i])
                    .append(",")
                    .append(zeitIterativ)
                    .append(",")
                    .append(zeitRekursiv)
                    .append("\n");

        }
        try {
            Files.writeString(Path.of(dateiname), csv.toString());
        } catch (IOException e) {
            throw new RuntimeException("Datei konnte nicht geschrieben werden: " + dateiname, e);
        }

    }

    private String[] erzeugePalindrome(int[] laengen){
        String[] palindrome = new String[laengen.length];

        for(int i=0; i<laengen.length; i++){
        palindrome[i]="a".repeat(laengen[i]);
        }
        return palindrome;
    }

    private long zeitMessen(Palindrom algorithmus, String wort){
        long start = System.nanoTime();
        algorithmus.istPalindrom(wort);
        long end = System.nanoTime();
        return end - start;
    }

}
