public class Main
{
    public static void main(String[] args)
    {
        Pair<Integer,String> pair= new Pair<>(1,"Zahl");
        System.out.println(pair.toString());
        Integer integer = pair.getKey();
        System.out.println(integer);
        String string = pair.getValue();
        System.out.println(string);
        pair.setKey(20);
        pair.setValue("geändert");
        System.out.println(pair.toString());
        Pair<String,String> pair2=new Pair<>("hello","world");
        System.out.println(pair2.toString());
        System.out.println(pair2);

    }
}