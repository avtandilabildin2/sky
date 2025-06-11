import java.util.Arrays;

public class Task3 {
    public static void main(String[] args){
        Integer[] value = {3,4};
        changeValue(value);
        System.out.println("value = " + Arrays.toString(value));
    }

    public static void changeValue(Integer[] value){
        value = new Integer[]{1, 2};
    }
    /**
     * здесь массив не изменяется потому что в методе мы создаем новый обьект
     * а не меняем старый
     *
     */
}
