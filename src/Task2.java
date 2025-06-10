public class Task2 {
    public static void main(String[] args){
        Integer value = 33;
        changeValue(value);
        System.out.println("value = " + value);
    }

    public static void changeValue(Integer value){
        value = 22;
    }
    /**
     * здесь тоже выводится 33 потому что это обьект но иммутабельный неизменяемый
     * ты не изменяяешь но создаешь и эта ссылка не сохраняется вне метода
     */
}
