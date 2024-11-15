package com.company;
import java.util.Scanner;
public class student {
     int roll_no;
      string name;
    Scanner s=new Scanner (System.in);
    public void get_data()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter name and roll_no");
        roll_no = s.nextInt();
        name =s.next();


    }
    public void display()
    {
        System.out.println("roll_n:"+roll_no);
        System.out.println("name:"+name);
    }

}
class test extends student
{
    int sub1,sub2;

    public void read_data()
{
    get_data();
    System.out.println("enter marks of 2 subject:");
    sub1= s.nextInt();
    sub2= s.nextInt();

}
public void put_data()
{
    display();
    System.out.println("marks of sub1" +sub1);
    System.out.println("marks of sub2:"+sub2);
}
}
class  single_inheritence
{
    public static void main(String[] args) {
        test obj=new test();
        obj read_data();
        obj put_data();
    }

}