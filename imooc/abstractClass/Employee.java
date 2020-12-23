/*
 * @Description: Define an abstract Employee class with several 
 *              states and a null method.
 * @Version: 
 * @Autor: kiasher
 * @Date: 2020-12-23 15:33:02
 * @LastEditors: kiasher
 * @LastEditTime: 2020-12-23 16:12:07
 */

public abstract class Employee {
    String name;
    String id;
    double pay;

    Employee(String name, String id, double pay) {
        this.name = name;
        this.id = id;
        this.pay = pay;
        System.out.println("Name: "+name+" Id: "+id+
            " Salary: "+pay);
    }
    public abstract void work();
}