import java.io.*;
class Doctor
{
  int doc_id;
  String doc_name;
float ratings;
void insertRecord(int i,String n,float r)
{
     doc_id=i;
	 doc_name=n;
	 ratings=r;
}
void displayInformation()
{
	System.out.println(doc_id+" "+doc_name+" "+ratings);
}
	 
}
class Doctor1{
public static void main(String args[])
   {
	
        Doctor d1=new Doctor();
		Doctor d2=new Doctor();
		d1.insertRecord(111,"Prithi",0.3f);
		d2.insertRecord(111,"Pavi",0.9f);
		d1.displayInformation();
		d2.displayInformation();
		
	
    }
}