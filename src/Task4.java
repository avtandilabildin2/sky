import java.util.Arrays;

public class Task4 {
    public static void main(String[] args){
        Integer[] value = {3,4};
        changeValue(value);
        System.out.println("value = " + Arrays.toString(value));
    }

    public static void changeValue(Integer[] value){
        value[0] = 99;
    }
    /**
     * здесь меняется потому что мы не создаем новый обьект
     * а меняем старый
     */
}
