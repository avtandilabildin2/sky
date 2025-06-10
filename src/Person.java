public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString(){
        return this.name + " " + this.surname;
    }
    public static void main(String[] args){
        Person person = new Person("Fedor","Dostoevskiy");
        changePerson(person);
        System.out.println("person = " + person);
    }

    public static void changePerson(Person person){
        person = new Person("Lev", "Tolstoy");
    }
    /**
     * Здесь тоже не меняется как и в 4 названии с помощью ключевого
     * слово new мы создаем а не изменяем если бы были геттеры и сеттеры то
     * другое дело
     */
}

