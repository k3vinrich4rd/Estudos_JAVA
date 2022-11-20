package comportamentodememoriaarrayslistas.listas.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many employees will be registered? ");
        int N = input.nextInt();


        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            System.out.println("\nEmployee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = input.nextInt();
            while (hasId(employees, id)) { //Verifica se o id já foi informado anteriormente
                System.out.println("Id already taken! Try again: "); //Se sim, exige a digitação de um id diferente
                id = input.nextInt();
            }

            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Salary: ");
            Double salary = input.nextDouble();

            Employee employee = new Employee(id, name, salary);
            employees.add(employee); //Para adicionar os elementos na lista
        }

        //Parte 2 - Aumento salarial do empregado
        System.out.print("\nEnter the employee id that will have salary increase: ");
        int idEmployee = input.nextInt();


        //Método para pegar o id do primeiro funcionário(a) que se encaixa nesse contexto
        Employee employee = employees.stream().filter(x -> x.getId() == idEmployee).findFirst().orElse(null);


        // Integer pos = positionIdInList(employees, idEmployee);
        if (employee == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = input.nextDouble();
            employee.increaseSalary(percent);

        }

        System.out.println("\nList of employees: ");
        for (Employee employee1 : employees) {
            System.out.println(employee1);
        }


        input.close();

    }


    //Papel do método: dizer qual é posição do id na lista
    public static Integer positionIdInList(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }


    //Para verificar se já tem um id existente
    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
