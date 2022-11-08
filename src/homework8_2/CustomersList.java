package homework8_2;

import homework8_1.Student;

import java.util.*;

public class CustomersList {
    //1) список покупателей в алфавитном порядке;
    //2) список покупателей, у которых номер кредитной карточки находится
    private List<Customers> CustomersList = new ArrayList<>();

    public void addCustomer(Customers a) {
        CustomersList.add(a);
    }

    public void CustomersPrint(){
        System.out.println("List of customers ");
        for(Customers customers:CustomersList)
                System.out.println(customers.toString());
    }
    public void SortBySecondName(){
        System.out.println("List of customers sort by secondName");
     //Arrays.sort(empArr, Employee.SalaryComparator);
        Collections.sort(CustomersList,Comparator.comparing(Customers::getSecondName));
        for(Customers customers:CustomersList)
            System.out.println(customers.toString());
    }
    public void SortByNameAndSecondName(){
        System.out.println("List of customers sort by secondName");
        //Arrays.sort(empArr, Employee.SalaryComparator);
        Collections.sort(CustomersList,Comparator.comparing(Customers::getSecondName));
        Collections.sort(CustomersList,Comparator.comparing(Customers::getName));
        for(Customers customers:CustomersList)
            System.out.println(customers.toString());
    }
    public void RangeCreditCard(String range1,String range2){
        System.out.println("List of customers whose credit card located in range("+range1+" to "+range2+")");
       for(Customers customers:CustomersList)
           if(parseRange1(customers.getCreditCard())>=parseRange1(range1)
                   &&
                   parseRange2(customers.getCreditCard())<=parseRange2(range2))
               System.out.println(customers.toString());

    }

    public int parseRange1(String range1 ){
        return Integer.parseInt(range1);
    }
    public int parseRange2(String range2 ){
        return Integer.parseInt(range2);
    }
}
