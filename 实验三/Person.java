package homework.实验三;

public class Person {
    String name;
    char sex;
    int age;
    public Person(String s){
        this.name=s;
    }
    public Person(String s,char c){
        this(s);
        this.sex=c;
    }
    public Person(String s,char c,int i){
        this(s,c);
        this.age=i;
    }

    @Override
    public String toString() {
        return "学生信息："+name+"\n"+sex+"\n"+age;
    }
}
