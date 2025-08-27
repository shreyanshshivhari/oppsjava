
package p1.encapculation;

import java.lang.reflect.Field;
import java.sql.SQLException;

class empolyee {
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private double salary = 1000;
    String name;
}
public class encapcu {
    public static void main(String[] args) throws Exception {
        System.out.println("hello");
        empolyee emp = new empolyee();
        Field fsal=empolyee.class.getDeclaredField("salary");
        fsal.setAccessible(true);
        System.out.println(fsal.get(emp));
    }
}
