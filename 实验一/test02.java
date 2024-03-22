package homework.实验一;

import java.util.Scanner;
import java.util.ArrayList;
public class test02 {
    public static void main(String[] args) {
        ArrayList<Course> array=new ArrayList<Course>();
        Scanner scan = new Scanner(System.in);
        Student stu = new Student();
// 创建学生对象
        stu.setName("吴巧婷");
        stu.setNumber("21551101043");
        stu.setCourses(new ArrayList<>());
        System.out.println("学生姓名："+stu.getName()+"\t 学号："+ stu.getNumber());
// 创建课程cou1
        Course cou1 = new Course();
        cou1.setClassNum("001");
        cou1.setCredit("1");
        cou1.setStartClassDate("7");
        cou1.setEndClassDate("8");
        cou1.setTeacher("Joyce1");
        cou1.setAssessment("assignment");
// 创建课程cou2
        Course cou2 = new Course();
        cou2.setClassNum("002");
        cou2.setCredit("1");
        cou2.setStartClassDate("8");
        cou2.setEndClassDate("9");
        cou2.setTeacher("Joyce2");
        cou2.setAssessment("assignment");
// 创建课程cou3
        Course cou3 = new Course();
        cou3.setClassNum("003");
        cou3.setCredit("1");
        cou3.setStartClassDate("12");
        cou3.setEndClassDate("15");
        cou3.setTeacher("Joyce3");
        cou3.setAssessment("assignment");
// 创建课程cou4
        Course cou4 = new Course();
        cou4.setClassNum("004");
        cou4.setCredit("1");
        cou4.setStartClassDate("18");
        cou4.setEndClassDate("19");
        cou4.setTeacher("Joyce4");
        cou4.setAssessment("assignment");
        //System.out.println("初始化课程完成");

       for(int u=0;u<3;u++){
            System.out.println("选修课程如下：");
            System.out.println("编号\t课程号\t学分\t上课时间\t下课时间\t老师\t\t考核方式");
            System.out.println("1：\t"+ cou1.getClassNum()+"\t\t"+cou1.getCredit()+"\t"+cou1.getStartClassDate()+"\t\t"+cou1.getEndClassDate()+"\t\t"+cou1.getTeacher()+"\t"+cou1.getAssessment());
            System.out.println("2：\t"+ cou2.getClassNum()+"\t\t"+cou2.getCredit()+"\t"+cou2.getStartClassDate()+"\t\t"+cou2.getEndClassDate()+"\t\t"+cou2.getTeacher()+"\t"+cou2.getAssessment());
            System.out.println("3：\t"+ cou3.getClassNum()+"\t\t"+cou3.getCredit()+"\t"+cou3.getStartClassDate()+"\t\t"+cou3.getEndClassDate()+"\t\t"+cou3.getTeacher()+"\t"+cou3.getAssessment());
            System.out.println("4：\t"+ cou4.getClassNum()+"\t\t"+cou4.getCredit()+"\t"+cou4.getStartClassDate()+"\t\t"+cou4.getEndClassDate()+"\t\t"+cou4.getTeacher()+"\t"+cou4.getAssessment());
            System.out.println("请选择选修课程（直接输入编号即可）：");
            Scanner sc =new Scanner(System.in);
            int classNum = sc.nextInt();

            switch (classNum ) {
                case 1:
                    array.add(cou1);
                    System.out.println("选修1已添加");
                    break;
                case 2:
                    array.add(cou2);
                    System.out.println("选修2已添加");
                    break;
                case 3:
                    array.add(cou3);
                    System.out.println("选修3已添加");
                    break;
                case 4:
                    array.add(cou4);
                    System.out.println("选修4已添加");
                    break;
                default:
                    System.out.println("您选的课程不存在！");
            }
        }
        System.out.println(stu.getName() +"： 您的选修课选择完毕,选课数量为: "+array.size());
       for (int i=0;i< array.size();i++) {
           Course c = array.get(i);
           System.out.println("您的选修课课程号分别为：" + c.getClassNum());
       }


    }


}
