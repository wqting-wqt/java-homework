package homework.实验一;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class test01 {
    public static void main(String[] args) throws Exception {
        //Scanner用于键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.println("创建学生请输入姓名:");
        Student stu1 = new Student();
        stu1.setName(sc.nextLine());
        Scanner sc1 = new Scanner(System.in);
        System.out.println("创建学生请输入学号:");
        stu1.setNumber(sc1.nextLine());
        System.out.println("请选择课程,课程如下:");
        List<Course> list2 = new ArrayList<Course>();
        stu1.setCourses(list2);
        List<Course> list = readTxt();
        for (Course course : list) {
            System.out.println(course.toString());
        }
        for (int i = 1; i < 5; i++) {
            System.out.println("请输入第"+i+"个课程号:");
            //输入第一个课程号
            handleClass(list, list2);
            System.err.println("已选择成功!");
            notSelectClass(list, list2);
            System.out.println("请选择课程,课程如下:");
            if(i==4){
                break;
            }
            for (Course course : list) {
                System.out.println(course.toString());
            }
        }
        System.out.println("课程已选完!结果如下:");
        System.err.println("学生:"+stu1.getName()+":");
        for (Course course : list2) {
            System.err.println(course.toString());
        }

    }
    /*
     * 查看未选择可选课程
     * @param list  全部可选课程
     * @param list2 已选课程
     */
    private static void notSelectClass(List<Course> list, List<Course> list2){
        for (int i = 0; i < list.size(); i++) {
            for (Course course : list2) {
                //把已选课程剔除
                if(course.getClassNum().equals(list.get(i).getClassNum())){
                    list.remove(i);
                    continue;
                }
                //把时间重合课程剔除  startdate1 <=enddate2 and enddate1>=startdate2
                if(daYuDengYu(course.getEndClassDate(),list.get(i).getStartClassDate())&&daYuDengYu(list.get(i).getEndClassDate(), course.getStartClassDate())){
                    list.remove(i);
                }
            }
        }
    }
    public static boolean daYuDengYu(String first, String second){
        BigDecimal bd1 = new BigDecimal(first);
        BigDecimal bd2 = new BigDecimal(second);

        return bd1.compareTo(bd2) >= 0;
    }
    /*
     * 处理选择课程
     */
    public static void handleClass(List<Course> list, List<Course> list2){
        while (true) {
            Scanner sssi = new Scanner(System.in);
            String num = sssi.nextLine().trim();
            for (Course course : list) {
                if(num.equals(course.getClassNum())){
                    list2.add(course);
                    return;
                }
            }
            System.out.println("课程号输入错误,请重新输入:");
        }
    }

    /*
     * 读取txt获取课程  每个课程按;分割每个属性按,分割
     * @return
     * @throws Exception
     */
    /* 读入TXT文件 */
    public static List<Course> readTxt() throws Exception{

        String pathname;
        pathname = Objects.requireNonNull(test01.class.getResource("/")).toString();
        pathname = pathname.substring(6, pathname.length()-4); //获取绝对路径
        File filename = new File("  D:/develop/JetBrains/代码案例/homework/class.txt"); // 要读取以上路径的txt文件
        List<Course> list = new ArrayList<Course>();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filename));
        //读取文件内容
        byte[] b = new byte[bis.available()];
        int read = bis.read(b);
        String[] strs = new String(b).split(";");
        for (String string : strs) {
            String[] str = string.split(",");
            Course course = new Course();
            course.setAssessment(str[5].trim());
            course.setClassNum(str[0].trim());
            course.setCredit(str[1].trim());
            course.setEndClassDate(str[3].trim());
            course.setStartClassDate(str[2].trim());
            course.setTeacher(str[4].trim());
            list.add(course);
        }

        bis.close();//关闭流(关闭bis就可以了)
        return list;
    }
}
