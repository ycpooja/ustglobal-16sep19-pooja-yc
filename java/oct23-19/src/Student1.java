
public class Student1 extends Person {
int rollno;
double marks;

Student1(int age,String name,int rollno,double marks){
	super(age,name);
	this.rollno=rollno;
	this.marks=marks;
}
void display()
{
	System.out.println(+age+" "+name+" "+rollno+" "+marks);
}
}
