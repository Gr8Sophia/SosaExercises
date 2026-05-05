public class PalindromRekursiv implements Palindrom {
    public boolean istPalindrom(String wort) {
        if(wort == null || wort.isEmpty()) {
            return false;
        }
        wort = wort.toLowerCase();
        return comparePositions(wort, 0);
    }

    private boolean comparePositions(String wort, int position){
        int endOfword = wort.length() - 1 -position;
        if (position >= wort.length()/2) {
            return true;
        }
        if (wort.charAt(position) != wort.charAt(endOfword)) {
            return false;
        }
        return comparePositions(wort, position +1);
    }
}
//Cosmos Rentner
