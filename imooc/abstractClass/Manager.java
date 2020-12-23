/*
 * @Description: Define a Manager class inherit from Employee
 *              which must implement methods inside Employee class
 * @Version: 
 * @Autor: kiasher
 * @Date: 2020-12-23 16:14:40
 * @LastEditors: kiasher
 * @LastEditTime: 2020-12-23 16:20:38
 */
public class Manager extends Employee {
    int bonus;

    public Manager(String name, String id, double pay, int bonus) {
        super(name, id, pay);
        this.bonus = bonus;
        System.out.println("Bonus: "+bonus);
    }
    public void work() {
        System.out.println("I am a Manager.");
    }
}
