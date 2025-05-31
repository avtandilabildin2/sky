public class Arrays1 {
    public static void main(String[] args) {
        /**
         * Задача 1
         *
         * Объявите три массива:
         *
         *     Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 —
         *     с помощью ключевого слова
         *
         *     new
         *
         *     .
         */
        byte[] bytes=new byte[3];
        bytes[0]=1;
        bytes[1]=2;
        bytes[2]=3;
        /**
         * Массив, в котором можно хранить три дробных числа —
         * 1.57, 7.654, 9.986. Массив сразу заполните значениями.
         */
        double[] doubles=new double[3];
        doubles[0]=1.57;
        doubles[1]=7.654;
        doubles[2]=9.986;
        /**
         * Произвольный массив. Тип и количество данных определите сами.
         * Самостоятельно выберите способ создания массива: с помощью ключевого
         * слова или сразу заполненный элементами.
         */
        int[] ints={12,32,44};
        System.out.println(bytes[0]+", "+bytes[1]+", "+bytes[2]);
        System.out.println(doubles[0]+", "+doubles[1]+", "+doubles[2]);
        System.out.println(ints[0]+", "+ints[1]+", "+ints[2]);
        /**
         * Задача 3
         *
         * Распечатайте на отдельной строчке элементы каждого массива в
         * обратном порядке через запятую. В конце строки запятую ставить не надо.
         *
         * Если в задаче 2 в консоль у вас вывелся результат:
         */
        System.out.println(bytes[2]+", "+bytes[1]+", "+bytes[0]);
        System.out.println(doubles[2]+", "+doubles[1]+", "+doubles[0]);
        System.out.println(ints[2]+", "+ints[1]+", "+ints[0]);
        for (int i = 0; i <bytes.length ; i++) {
            if(bytes[i]%2==1){
                bytes[i]+=1;
            }
            System.out.print(bytes[i]+" ");
        }
    }
}
