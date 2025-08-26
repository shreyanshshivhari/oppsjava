package p1;

class emplouyes{
    String name;
    double salary;
    emplouyes(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    void show(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}
class Manager extends emplouyes{
    String dept;
    Manager(String name,double salary,String dept){
        super(name,salary);
        this.dept=dept;
    }
    void show(){
        super.show();
    }
}