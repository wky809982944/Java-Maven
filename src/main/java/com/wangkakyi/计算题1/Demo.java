package com.wangkakyi.计算题1;
class Person{
    private int ID;
    private String name;
    private String sex;
    private long date;
    private String department;
    private int jobtitle;
    private int basesalary;
    private int delete;

    public Person() {
    }

    public Person(int ID, String name, String department) {
        this.ID = ID;
        this.name = name;
        this.department = department;
    }

    public Person(int ID, String name, String sex, long date, String department, int jobtitle, int salary, int delete)  {
        this.ID = ID;
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.department = department;
        this.jobtitle = jobtitle;
        this.basesalary = salary;
        this.delete = delete;
    }

    public int getSalary() {
         switch (this.jobtitle){
             case 1:
                 return this.basesalary+1200;
             case 2:
                 return this.basesalary+2100;
             case 3:
                 return this.basesalary+3500;
                 default:
                     return 0;
         }
    }
    public double getDelete(){
        if(this.getSalary()>3000&&this.getSalary()<=8000){
            return this.delete+(this.getSalary()-3000)*0.08;
        }
        else if(this.getSalary()>8000){
            return this.delete+(this.getSalary()-8000)*0.08+400;
        }
        else
        {
            return this.delete;
        }
    }
    public double getrealSalary(){
        return this.getSalary()-this.getDelete();
    }
   public String getbase(){
        return  "ID:"+this.ID+"姓名"+this.name+"性别"+this.sex+"开始工作年份"+this.date+"部门"+this.department;
   }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(int jobtitle) {
        this.jobtitle = jobtitle;
    }

    public int getBasesalary() {
        return basesalary;
    }

    public void setBasesalary(int basesalary) {
        this.basesalary = basesalary;
    }

    public void setDelete(int delete) {
        this.delete = delete;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", date=" + date +
                ", department='" + department + '\'' +
                ", jobtitle=" + jobtitle +
                ", basesalary=" + basesalary +
                ", delete=" + delete +
                '}';
    }
}
public class Demo {
    public static void main(String args[]) {
           Person per[]=new Person[6];
           per[1]=new Person(1, "猪八戒", "男",19990101 ,"后勤" , 1,3000 ,1000);
           per[2]=new Person(2, "唐僧", "男",10990101 ,"管理" , 3,5000 ,2000);
           per[3]=new Person(3, "孙悟空", "男",12990101 ,"前台" , 2,3200 ,1200);
           per[4]=new Person(4, "沙僧", "男",12990101 ,"前台" , 1,2800 ,800);
           per[5]=new Person(5, "如来", "男",9990101 ,"董事" , 3,9000 ,4000);
           int sum=0;
           for(int i=1;i<5;i++){
               sum+=per[i].getSalary();
           }
           System.out.println(sum/5);
           sum=0;
           for (int i=1;i<=5;i++){
               sum+=per[i].getDelete();
           }
           System.out.println(sum);
           double max=per[1].getrealSalary();
           double min=per[1].getrealSalary();
           for(int i=2;i<=5;i++){
               if(per[i].getrealSalary()>max)
                   max=per[i].getrealSalary();
               if(per[i].getrealSalary()<min)
                  min=per[i].getrealSalary();
           }
           System.out.println(max);
           System.out.println(min);
        for (Person x:per
             ) {
            System.out.println(x);


        }

    }
}
