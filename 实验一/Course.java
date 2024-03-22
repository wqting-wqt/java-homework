package homework.实验一;

public class Course {
    private String classNum;
    private String credit;
    private String startClassDate;
    private String endClassDate;
    private String teacher;
    private String assessment;
    public String getClassNum() {
        return classNum;
    }
    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }
    public String getCredit() {
        return credit;
    }
    public void setCredit(String credit) {
        this.credit = credit;
    }
    public String getStartClassDate() {
        return startClassDate;
    }
    public void setStartClassDate(String startClassDate) {
        this.startClassDate = startClassDate;
    }
    public String getEndClassDate() {
        return endClassDate;
    }
    public void setEndClassDate(String endClassDate) {
        this.endClassDate = endClassDate;
    }
    public String getTeacher() {
        return teacher;
    }
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    public String getAssessment() {
        return assessment;
    }
    public void setAssessment(String assessment) {
        this.assessment = assessment;
    }
    @Override
    public String toString() {
        return " 课程号:" + classNum + ", 学分:" + credit
                + ", 上课时间:" + startClassDate + ", 下课时间:"
                + endClassDate + ", 教师:" + teacher + ",  考核方式:"
                + assessment + "";
    }
}
