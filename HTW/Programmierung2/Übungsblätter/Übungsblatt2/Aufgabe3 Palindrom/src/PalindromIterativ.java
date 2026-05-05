import java.util.Locale;

public class PalindromIterativ implements Palindrom {

    @Override
    public boolean istPalindrom(String wort) {
        if (wort == null || wort.isEmpty()) {
            throw new IllegalArgumentException("Palindrom ist length 0");
        }
        wort = wort.toLowerCase();

        for (int i = 0; i < wort.length() / 2; i++) {
            int endOfWord = wort.length() - 1 - i;
            if(wort.charAt(i) != wort.charAt(endOfWord)) {
                return false;
            }
        }
    return  true;
    }


}
/*
otto Rentner

 */