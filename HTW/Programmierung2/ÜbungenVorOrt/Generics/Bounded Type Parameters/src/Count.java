public class Count {
    public static<T extends Integer> int countGreaterThan(T[] array,T value){
        int count = 0;
        for (T i = 0; i < array.length; i++){
            if(array[i] > value){
                count++;
            }
        }
        return count;
    }
}
