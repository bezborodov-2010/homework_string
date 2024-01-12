import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        String firstName = "Семён ";
        String middleName = "Семёнович";
        String lastName = "Иванов ";
        String fullName = lastName + firstName + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println("Задача 2");

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println("Задача 3");

        String rusFullName = fullName.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + rusFullName);

    }
}