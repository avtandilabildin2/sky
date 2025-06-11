import java.util.Objects;

public class Person2 {
    public String name;
    public String surname;

    public Person2(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public static void main(String[] args){
        Person2 person2 = new Person2("Fedor","Dostoevskiy");
        changePerson(person2);
        System.out.println("person = " + person2);
    }

    public static void changePerson(Person2 person2){
        person2.name = "Lev";
        person2.surname = "Tolstoy";
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Person2 person2)) return false;

        return Objects.equals(name, person2.name) && Objects.equals(surname, person2.surname);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(surname);
        return result;
    }

    @Override
    public String toString(){
        return this.name + " " + this.surname;
    }
}
/**
 * здесь меяется потому что мы изменяем а не создаем конструктор создает сеттер измен
 * яет здесь работает как сеттер
 */


