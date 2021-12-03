package Model;

import Controller.CustomerController;
import Controller.EmployeeController;
import Controller.ItemController;
import Controller.OrderController;

import java.math.BigDecimal;

public class Database {
    ItemController itemController = new ItemController();
    EmployeeController employeeController = new EmployeeController();
    OrderController orderController = new OrderController();
    CustomerController customerController = new CustomerController();

    Item item1 = new Item('T', 11, "Hammer", true, new BigDecimal("50.0"));
    Item item2 = new Item('D', 12, "Nails", false, new BigDecimal("20.0"));
    Item item3 = new Item('T', 13, "Bolts", false, new BigDecimal("15.0"));
    Item item4 = new Item('D', 14, "Chair", true, new BigDecimal("10.0"));
    Item item5 = new Item('T', 15, "Table", true, new BigDecimal("200.0"));


    public void addItemsToInContainer(){
        itemController.addItemToInventory(item1);
        itemController.addItemToInventory(item2);
        itemController.addItemToInventory(item3);
        itemController.addItemToInventory(item4);
        itemController.addItemToInventory(item5);
    }

    Employee employee1 = new Employee("Bob", "Dylan", "sales assistant");
    Employee employee2 = new Employee("Anders", "Olesen", "manager");
    Employee employee3 = new Employee("Casper", "Olesen", "manager");
    Employee employee4 = new Employee("Joey", "Joes", "accountant");
    Employee employee5 = new Employee("Secondbob", "Notdylan", "sales assistant");

    public void addEmployeesToContainer(){
        employeeController.addEmployee(employee1);
        employeeController.addEmployee(employee2);
        employeeController.addEmployee(employee3);
        employeeController.addEmployee(employee4);
        employeeController.addEmployee(employee5);
    }

    Customer customer1 = new Customer("Ted", "regular");
    Customer customer2 = new Customer("Bozhidar", "standard");
    Customer customer3 = new Customer("Luka", "premium");
    Customer customer4 = new Customer("Andreea", "standard");
    Customer customer5 = new Customer("Vladdy", "regular");

    public void addCustomersToContainer(){
        customerController.addCustomer(customer1);
        customerController.addCustomer(customer2);
        customerController.addCustomer(customer3);
        customerController.addCustomer(customer4);
        customerController.addCustomer(customer5);
    }

    // TODO
    // Will get called at the start of the application
    public void populateDatabase(){

        addItemsToInContainer();
        item1.setQuantity(2);
        item3.setQuantity(3);
        System.out.println(item1);
        System.out.println(item3);
        addEmployeesToContainer();
        addCustomersToContainer();
    }
}
