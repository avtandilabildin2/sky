public class Task1 {
    public static void main(String[] args){
        int value = 33;
        changeValue(value);
        System.out.println("value = " + value);
    }

    public static void changeValue(int value){
        value = 22;
    }
    /**
     * Здесь выводится 33 и значение не изменяется потому что
     * значения является примитивным типом и не сохраняется в куче а в стеке
     * и поэтому они не изменяются а присваиваются новые значения
     * и потому то они не могут выйти вне метода
     */
}
