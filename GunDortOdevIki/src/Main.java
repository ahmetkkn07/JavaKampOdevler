import Abstract.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
        BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new CustomerCheckManager());
        try {
            neroCustomerManager.save(new Customer(1, "Ahmet", "KÖKEN", new Date(), "1111111111"));
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        try {
            starbucksCustomerManager.save(new Customer(2, "Engin", "DEMİROĞ", new Date(), "22222222222"));
        } catch (Exception exception) {
            System.out.println(exception.getMessage());

        }
    }
}
