import java.util.Date;

public class a1abstractClassDemo {
    public static void main(String args[]){
        Employee dan = new RegularEmployee("Dan","HR",10000);
        Employee matt= new ContractualEmployee("Matt", "IT",10000);

        System.out.println(" Dan's salary is "+dan.getSalary());
        System.out.println(" Matt's salary (Cont)is "+matt.getSalary());
    }

}
abstract class Employee{
    String name;
    Date doj;
    String department;
    float salary;
    Employee(String name, String Department){
        this.name=name;
        this.department=department;
    }
    public String getName(){
        return this.name;
    }
    public Date getDoj(){
        return this.doj;
    }
    abstract float getSalary();
}

class ContractualEmployee extends Employee{
    ContractualEmployee(String name,String dep){
        super(name,dep);
    }
    ContractualEmployee(String name,String dep,float salary){
        super(name,dep);
        this.salary=salary;
    }

    float getSalary(){
        return this.salary * 0.5f;
    }
}

class RegularEmployee extends Employee{

    public RegularEmployee(String name,String dep){
        super(name,dep);
    }
    public RegularEmployee(String name,String dep,float salary){
        super(name,dep);
        this.salary=salary;
    }

    float getSalary(){
        return this.salary * 0.8f;
    }
}

