public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Андреев Андрей Андреевич", 1, 15000);
        employees[1] = new Employee("Елисеев Елисей Елисеевич", 2, 150000);
        employees[2] = new Employee("Иванов Иван Иванович", 3, 55000);
        employees[3] = new Employee("Володин Владимир Владимирович", 4, 25000);
        employees[4] = new Employee("Дмитриев Дмитрий Дмитриевич", 5, 45000);
        employees[5] = new Employee("Зинчина Зинаида Михайловна", 6, 75000);
        employees[6] = new Employee("Павлов Павел Павлович", 7, 250000);
        employees[7] = new Employee("Сергеев Сергей Сергеевич", 8, 155000);
        employees[8] = new Employee("Николаев Николай Николаевич", 9, 25000);
        employees[9] = new Employee("Михайлов Михаил Михайлович", 10, 100000);

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);

        }
    }
}