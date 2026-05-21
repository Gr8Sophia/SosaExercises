import java.util.function.IntUnaryOperator;

class Main {
    public static void main(String[] args) {


        // Implemenation des Funktionalen Interfaces IntUnaryOperator als Lamda Funktion
        IntUnaryOperator operatorPower = x -> x*x;

        IntUnaryOperator operatorFakult = x -> {
            int ergebnis = 1;
            for (int i = x; i > 0; i--) {
            ergebnis*=i;
            }
            return ergebnis;
        };

        IntUnaryOperator operatoriii = x -> 



        System.out.println("x^2: Lamda");
        Printer.applyAndPrint(2,5,operatorPower);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("x!: Lamda");
        Printer.applyAndPrint(2,5,operatorFakult);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("x: x^(x+1)");
        Printer.applyAndPrint(2,5,operatorPower);



        // Implemenation des Funktionalen Interfaces IntUnaryOperator als Anonyme Klasse
        System.out.println("x^2: Anonyme Klasse :");
        Printer.applyAndPrint(2,5, new IntUnaryOperator(){
            @Override
            public int applyAsInt(int operand) {
                return operand*operand;
            }
        });
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("x!: Anonyme Klasse");
        Printer.applyAndPrint(2,5, new IntUnaryOperator(){
            @Override
            public int applyAsInt(int operand) {
                int ergebnis = 1;
                for (int i = operand; i > 0; i--) {
                    ergebnis*=i;
                }
                return ergebnis;
            }
        });

        // Benutzung der Top Level Klasse, die das Funktionale Iterface implementiert
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Top Level Klasse: ");
        TopLevelClass topLevelClass = new TopLevelClass();
        Printer.applyAndPrint(2,5,topLevelClass);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Innere Klasse: ");
        Main main = new Main();
        InnerClass innerClass = main.new InnerClass();
        Printer.applyAndPrint(2,5,innerClass);
    }

    public class InnerClass implements IntUnaryOperator {
        @Override
        public int applyAsInt(int operand) {
            int ergebnis = 1;
            for(int k = operand; k>0; k--) {
                ergebnis *= k;
            }
            return ergebnis;

        }
    }
}