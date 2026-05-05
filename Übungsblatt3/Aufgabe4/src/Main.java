public class Main{
    public static void main(String[] args){
        final int a = 10;
        final int b = 5;
        Calculator calc = new Calculator();

        System.out.println(calc.compute(a,b,new BinaryOperation(){
            @Override
            public int apply(int a, int b) {
                return a+b;
            }
        }));

        System.out.println(calc.compute(a,b,new BinaryOperation(){
            @Override
            public int apply(int a, int b) {
                return a-b;
            }
        }));

        System.out.println(calc.compute(a,b,new BinaryOperation(){
            @Override
            public int apply(int a, int b) {
                return a*b;
            }
        }));

        System.out.println(calc.compute(a,b,new BinaryOperation(){
            @Override
            public int apply(int a, int b) {
                return a/b;
            }
        }));
    }
}
