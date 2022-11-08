package homework8_2;

public class Customers { //id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
private int id;
private String secondName;
private String name;
private String surName;
private String address;
private String creditCard;
private String bankAccount;
 public Customers(int id, String secondName, String name, String address, String creditCard,String bankAccount){
     this.secondName=secondName ;
     this.name=name;
     this.address=address;
     this.creditCard=creditCard;
     this.bankAccount=bankAccount;
     this.id=id;
     /*
     setId(id);
     setSecondName(secondName);
     setName(name);
     setAddress(address);
     setCreditCard(creditCard);
     setBankAccount(bankAccount);


      */

 }

    public int getId() {
     return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getSecondName () {
        return secondName ;
    }
    public void setSecondName (String secondName ) {
        this.secondName = secondName ;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address=address;
    }

    public String getCreditCard() {
        return creditCard;
    }
    public void setCreditCard(String creditCard) {
this.creditCard=creditCard;
    }

    public String getBankAccount() {
        return bankAccount;
    }
    public void setBankAccount(String bankAccount) {
     this.bankAccount=bankAccount;
    }
    public String toString() {
        return "Student{"+" id " +id+
                ", secondName='" + secondName + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ",creditCard='" + creditCard + '\'' +
                ", bankAccount='" + bankAccount + '\'' +
                '}';
    }











}
