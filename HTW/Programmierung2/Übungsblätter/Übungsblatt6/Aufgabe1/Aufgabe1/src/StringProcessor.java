
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;


public class StringProcessor {
    List<String> list = new java.util.LinkedList<>();

    public StringProcessor() {
        List<String> newList = new java.util.LinkedList<>();

    }
    public StringProcessor(List<String> newList) {
        this.list.addAll(newList);
    }

    public void add(String newValue) {
        list.add(newValue);
    }

    public ArrayList<String> filter(Predicate<String> listFilter) {
        ArrayList<String> newList = new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            if(listFilter.test(this.list.get(i))){
            newList.add(this.list.get(i));
            }
        }
        return newList;
    }

    public void applyToAll(ToIntFunction<String> applyFunction) {
        for(String s:this.list){
            applyFunction.applyAsInt(s);
        }
    }

    public ArrayList<Integer> mapToInt(ToIntFunction<String> function){
        ArrayList<Integer> newList = new ArrayList<>();
        for(String s:this.list){
            newList.add(function.applyAsInt(s));
        }
        return newList;
    }

    public void forEach(Consumer<String> consumer){
        for(String s:this.list){
            consumer.accept(s);
        }
    }


}
