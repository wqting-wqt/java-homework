package homework.实验三;

public class Student extends Person{
    private long number;
    private double phi;
    private double eng;
    private double comp;
    //public Student(){}
    public Student(long number,String name,char sex,int age,double phi,double eng,double comp){
        super(name,sex,age);
           this.number=number;
           this.phi=phi;
           this.eng=eng;
           this.comp=comp;

    }
    public double max(){
       if (phi>eng&phi>comp)
           return phi;
       else if (eng>phi&eng>comp)
           return eng;
          return comp;

    }

    @Override
    public String toString() {
        return "学号："+number+"\n"+"姓名："+name+"\n"+"性别："+sex+"\n"+"三门中的最高分："+max();
    }

}
