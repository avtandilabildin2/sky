public class Task8 {
    public static void main(String[] args) {
        var total = 640;
        var one =8;
        /**
         * «Всего работников в компании — … человек»
         */
        System.out.println("Всего работников в компании —"+total/one+" человек");
        var worker=total/one;
        worker+=94;
        /**
         * «Если в компании работает … человек, то всего …
         * часов работы может быть поделено между сотрудниками».
         */
        System.out.println("«Если в компании работает " +worker+ " человек, то всего " +total+
                " часов работы может быть поделено между сотрудниками");
    }
}
