import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,2,3);
        sumOfList(myList);

    }
    public double sumOfList(List<?> list){
        double count = 0;
        for(Object o : list){
            count += o;
        }
        return count;
    }
}