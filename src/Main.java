public class Main {
    public static void main(String[] args) {
        //Задание1
        String firstName= "Ivanov ";
        String middleName= "Ivan ";
        String lastName= "Ivanovich ";
        System.out.println("ФИО сотрудника "+firstName+middleName+lastName);
        //Задание2
        String fullName=firstName+middleName+lastName;
        String hightFullName= fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+hightFullName);
        //Задание3
        String fullNameTwo="Иванов Семён Семёныч";
        String fullNameTwoNew= fullNameTwo.replace('ё','е');
        System.out.println("Данные ФИО сотрудника — "+fullNameTwoNew);

    }
}
