
public class Teache extends Person {
String department;

Teache(int age,String name,String department){
	super(age,name);
	this.department=department;

}
void display()
{
	System.out.println(+age+" "+name+" "+department);
}
}
