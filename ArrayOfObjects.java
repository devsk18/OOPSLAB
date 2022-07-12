import java.util.*;
class ArrayOfObjects {
    private int no;
    private String name;
    private double sal;
    private String dept;

    public ArrayOfObjects(int no,String name,double sal,String dept) {
        this.no = no;
        this.name = name;
        this.sal = sal;
        this.dept = dept;
    }
    public int getNo(){
        return no;
    }
    public void display() {
        System.out.print("Employee details : ");
        System.out.printf("%d, %s, %.2f, %s\n",no,name,sal,dept);
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        ArrayOfObjects[] emp = new ArrayOfObjects[5];
        emp[0] = new ArrayOfObjects(101,"abin",5000,"java");
        emp[1] = new ArrayOfObjects(102,"bibin",6000,"python");
        emp[2] = new ArrayOfObjects(103,"cibin",7000,"php");
        emp[3] = new ArrayOfObjects(104,"don",8000,"javascript");
        emp[4] = new ArrayOfObjects(105,"eldo",9000,"html");

        System.out.println("All Employee Details : ");
        for(ArrayOfObjects e : emp){
            e.display();
        }

        System.out.print("Enter the no. of Employee to be searched : ");
        int n = s.nextInt();

        for(ArrayOfObjects e : emp){
            if(e.getNo()==n){
                n = -1;
                e.display();
            }
        }
        if(n != -1)
            System.out.println("Employee not found");
    }
}