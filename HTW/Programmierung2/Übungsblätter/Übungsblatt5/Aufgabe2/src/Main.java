import java.util.function.IntUnaryOperator;

class Main {
    public static void main(String[] args) {


        // Implemenation des Funktionalen Interfaces IntUnaryOperator als Lamda Funktion
        IntUnaryOperator operatorPower = x -> x * x;

        IntUnaryOperator operatorFakult = x -> {
            int ergebnis = 1;
            for (int i = x; i > 0; i--) {
                ergebnis *= i;
            }
            return ergebnis;
        };

        IntUnaryOperator operatoriii = x -> {
            int power = x + 1;
            int ergebnis = x;
            return (int) Math.pow(ergebnis, power);
        };

        IntUnaryOperator operatorFibonacci = x -> {
            if (x == 0) {
                return 0;
            }
            if (x == 1) {
                return 1;
            }
            int jetzige = 1;
            int vorherige = 0;
            for (int i = 2; i <= x; i++) {
                int neueZahl = vorherige + jetzige;
                vorherige = jetzige;
                jetzige = neueZahl;
            }
            return jetzige;
            // fib(n) = fib(n-1) + fib(n-2)
        };

        System.out.println("x^2: Lamda");
        Printer.applyAndPrint(2,5,operatorPower);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("x!: Lamda");
        Printer.applyAndPrint(2,5,operatorFakult);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("x: x^(x+1)");
        Printer.applyAndPrint(2,5, operatoriii);
        System.out.println(" ");
        System.out.println(" ");



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

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Fibonacci Folge: ");
        Printer.applyAndPrint(2,5, operatorFibonacci);
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