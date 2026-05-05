public class Main{
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        NumberProcessor numberProcessor = new NumberProcessor(array);
        numberProcessor.printGreaterThan(1);
        System.out.println("Even Numbers: ");
        numberProcessor.printEvenNumbers();
        System.out.println();
        System.out.println("Print in Range: ");
        numberProcessor.printInRange(1,10);
        numberProcessor.printInRange(1,10);
        System.out.println();
        System.out.println("Print Stats: ");
        numberProcessor.printStatistsics();
    }
}