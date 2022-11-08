package homework8_2;

import homework8_1.Student;
import homework8_1.StudentList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class homework8_2 {
    public static void main(String[] args) {

Customers customer1=new Customers(1,"Konovalchenko","Anthony","Moskovskiy,13","527678","315");
Customers customer2=new Customers(2,"Lampo","Jack","Moskovskiy,19","863012","394");
Customers customer3=new Customers(3,"Tea","Alex","Frunze,53","681235","512");
Customers customer4=new Customers(4,"Dreeg","Misa","Lenin,85","512389","381");
Customers customer5=new Customers(5,"Array","Bettie","Freedom,77","926502","929");
Customers customer6=new Customers(6,"Bold","Oliver","Three,33","333333","333");
Customers customer7=new Customers(7,"Wenny","Jacob","Whisky,72","513863","628");

CustomersList customersList=new CustomersList();
customersList.addCustomer(customer1);
customersList.addCustomer(customer2);
customersList.addCustomer(customer3);
customersList.addCustomer(customer4);
customersList.addCustomer(customer5);
customersList.addCustomer(customer6);
customersList.addCustomer(customer7);
//customersList.CustomersPrint();
//customersList.SortBySecondName();
// customersList.SortByNameAndSecondName();
customersList.RangeCreditCard("500000","600000"); // нужный диапазон


    }



}

