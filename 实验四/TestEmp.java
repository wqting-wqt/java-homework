package homework.实验四;

import java.util.Scanner;
abstract class Employee {                                               //定义员工的抽象类
    String id;                                                          //定义员工编号
    String name;                                                        //定义员工姓名
    double BaseSalary;                                                  //定义员工基础工资
    double HouseSalary;                                                 //定义员工住房补贴
    double MedicalSalary;                                               //定义员工医疗补贴
    double TrafficSalary;                                               //定义员工交通补贴
    public Employee(String id,String name){                             //定义员工有参构造方法
        this.id=id;
        this.name=name;
    }
    public Employee(double B, double H, double M, double T) {            //定义员工有参构造方法
        this.BaseSalary = B;
        this.HouseSalary = H;
        this.MedicalSalary = M;
        this.TrafficSalary = T;
      }

    public abstract void setSubsidy();
    public abstract double CalSalary();

}
class Worker extends Employee{                                             //定义普通员工继承员工
    public Worker(String id,String name){                                  //定义普通员工有参构造方法
        super(id,name);
    }
    public Worker(double B, double H, double M, double T){                 //定义普通员工继承员工的构造方法
        super(B,H,M,T);
    }
    public void setSubsidy(){                                              //定义普通员工工资方法
        BaseSalary=3000.0;
        HouseSalary=BaseSalary*0.1;
        TrafficSalary=BaseSalary*0.2;
        MedicalSalary=300;
    }
    public double CalSalary(){                                             //定义普通员工工资结算方法
        return BaseSalary+HouseSalary+MedicalSalary+TrafficSalary;
    }
}
class Manager extends Employee{                                            //定义经理继承员工
    double TravelSalary;
    public Manager(String id,String name){                                 //定义经理有参构造方法
        super(id,name);
    }
    public Manager(double B, double H, double M, double T,double Tl){      //定义经理继承员工的构造方法
        super(B,H,M,T);
        this.TravelSalary=Tl;
    }
    public void setSubsidy(){                                               //定义经理工资方法
        BaseSalary=3000.0;
        HouseSalary=BaseSalary*0.2;
        TrafficSalary=BaseSalary*0.2;
        MedicalSalary=1000.0;
        TravelSalary=2000.0;
    }
    public double CalSalary(){                                                //定义经理工资结算方法
        return BaseSalary+HouseSalary+MedicalSalary+TrafficSalary+TravelSalary;
    }
}
public class TestEmp {
    public static void main(String[] args){                                    //定义主函数
            System.out.println("请输入员工类型：（普通员工1 or 经理2）");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            System.out.println("**********************************");
            if (input != 1 & input != 2) {
                System.out.println("输入有误");
                System.out.println("**********************************");
            } else if (input == 1) {                                                 //判断员工类型
                Worker worker = new Worker("21551101043", "吴巧婷");
                worker.setSubsidy();
                System.out.println("员工编号：" + worker.id + "\n" + "员工姓名：" + worker.name);
                System.out.println("该员工的工资为：" + worker.CalSalary());
                System.out.println("**********************************");
            } else if (input == 2) {
                Manager manager = new Manager("21551101043", "吴巧婷");
                manager.setSubsidy();
                System.out.println("员工编号：" + manager.id + "\n" + "员工姓名：" + manager.name);
                System.out.println("该员工的工资为：" + manager.CalSalary());
                System.out.println("**********************************");
            }
    }
}
