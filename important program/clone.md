*   A clone is an exact copy of the original. In java, it essentially means the ability to create an object with
    similar state as the original object. The java clone() method provides this functionality.

*       You must implement Cloneable interface.
        You must override clone() method from Object class.

*     In the deep copy, we create a clone which is independent of original object and making changes in the cloned
      object should not affect original object.
-----------------------------------------------------------------------------------------------------------------------
* when in our program all datatypes are primitive then shallow clone==Deep cloning.
package practice;

class Student implements Cloneable //it is markup interface
{
	int Rollnumber;
	String name;
	public Student(int Rollnumber, String name)
	{
		this.Rollnumber=Rollnumber;
		this.name=name;
	}
	void fun()
	{
		System.out.println(this.Rollnumber+" "+this.name);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}
	@Override
	public String toString() {
		return "Student [Rollnumber=" + Rollnumber + ", name=" + name + "]";
	}
	
}
class practice 
{ 
	public static void main(String ss[]) throws CloneNotSupportedException
	{
		Student orignal =new Student(100,"Rohit");
		Student copy=(Student) orignal.clone();
		System.out.println(copy);
	}
} 
---------------------------------------------------------------------------------------------------------------------
 * but when we are using Aggregation then we shoud use the deep cloning or if we change at one object it will reflect
   to other place also.


package practice;

class Student implements Cloneable
{
	int rollnumber;
	String name;
    Address address;	
	

	public Student(int rollnumber, String name, Address address1) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.address = address1;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		Student s=(Student) super.clone();
		s.setAddress((Address) address.clone());
		return s;
	}

	@Override
	public String toString() {
		return "rollnumber is =" + rollnumber + "\n name is =" + name + "" + address + "]";
	}
	
	
}
class practice 
{ 
	public static void main(String ss[]) throws CloneNotSupportedException
	{
	    Address address1=new Address(415019, "kameri", "satara");
		Student student1=new Student(100, "Rohit", address1);
		Student student2=(Student) student1.clone();
		address1.setVname("california");
	    System.out.println("Student1 information :-\n "+student1);
	    System.out.println("Student2 information :-\n "+student2);


	}
} 
-------------------------------------------------------------------------------------------------------------------

package practice;

public class Address implements Cloneable
{
   int pincode;
   String vname;
   String taluka;
   @Override
	protected Object clone() throws CloneNotSupportedException 
   {
		return super.clone();
	}
public Address(int pincode, String vname, String taluka) {
	super();
	this.pincode = pincode;
	this.vname = vname;
	this.taluka = taluka;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public String getVname() {
	return vname;
}
public void setVname(String vname) {
	this.vname = vname;
}
public String getTaluka() {
	return taluka;
}
public void setTaluka(String taluka) {
	this.taluka = taluka;
}
@Override
public String toString() {
	return "\n pincode=" + pincode + "\n vname=" + vname + "\n taluka=" + taluka +"";
}
   
   
}
---------------------------------------------------------------------------------------------------------------------

