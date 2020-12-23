/*
 * @Description: Main method
 * @Version: 
 * @Autor: kiasher
 * @Date: 2020-12-23 16:07:01
 * @LastEditors: kiasher
 * @LastEditTime: 2020-12-23 16:21:01
 */
public class DoAbstract {
    public static void main(String[] args) {
        Programmer pro = new Programmer("kiasher","0099",10000);
        pro.work();
        Manager man = new Manager("jessica","0808",20000,5000);
        man.work();
    }
}