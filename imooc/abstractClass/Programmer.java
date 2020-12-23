/*
 * @Description: Define a Programmer class inherit from Employee
 *              which must implement methods inside Employee class
 * @Version: 
 * @Autor: kiasher
 * @Date: 2020-12-23 16:02:38
 * @LastEditors: kiasher
 * @LastEditTime: 2020-12-23 16:10:00
 */
public class Programmer extends Employee {
    public Programmer(String name, String id, double pay) {
        super(name, id, pay);
    }
    public void work() {
        System.out.println("I am a Programmer.");
    }
}