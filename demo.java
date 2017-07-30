//多态理解练习

import java.util.*;

public class upstairs{
    public static void main(String[] args)
    {     Manager boss = new Manager("k",20,10);
        employee[] staff = new employee[3];
        staff[0] = new employee("w",10);
        staff[1] = new employee("s",15);
        staff[2] = boss ;   //向上转型；
        System.out.println(staff[2].getDescription());
        System.out.println( staff[1].getDescription());
        System.out.println(staff[0].getDescription());
    }

}


// 父类
class employee {
    private int salary ;
    private String name ;
    public employee(String n , int s )
    {   name = n ;
        salary = s ;
    }

    public int getSalary(){
        return salary ;
    }

    //Override
    public String getDescription()
    {return  " I'm an employee who can earn "+ salary + " a month ";}

}
//子类
class Manager extends employee{

    private int bonus ;

    public Manager(String n , int s ,int b )
    {

        super(n,s);
        bonus = b ;
    }
    public String getDescription(){
       int  total = super.getSalary()+bonus;
        return  " I'm a manager who can earn "+total + " a month ";
    }
}