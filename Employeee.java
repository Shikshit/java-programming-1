import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class GetterSetter{
    private String name,loc,des;
    private double id, salary;
    public void setdata(String newname, String newloc, String newdes, double newid, double newsalary)
    {
        name=newname;
        loc= newloc;
        des=newdes;
        id=newid;
        salary=newsalary;
    }
    public String getName()
    {
        return name;
    }
    public String getloc()
    {
        return loc;
    }
    public String getdes()
    {
        return des;
    }
    public double getId()
    {
        return id;
    }
    public double getSalary()
    {
        return salary;
    }
}
public class Employeee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 to work on Existing Data");
        System.out.println("Press 2 to create your Fresh Data");
        int num=input.nextInt();
        switch (num){
            case 1:
                double[] empID = new double[]{1,2,3,4,5,6,7,8,9,10};
                String[] empNAME = new String[]{"Shikshit","Sharlabh","Harshit","Gagan","Shubham","Lubna","Arnav","Ghazal","Naman","Harsh"};
                double[] empSALARY = new double[]{4000,6000,5000,4000,3000,5000,2000,3000,4000,2000,3000};
                String[] empLOC = new String[]{"Gurgaon","Delhi","Bangalore","Noida","Mumbai","Pune","Gurgaon","Pune","Noida","Delhi"};
                String[] empDES = new String[]{"DS", "SAP","CSE","IT","CSE","ML","DV","AI","DS","MLE","DL"};
                GetterSetter obj = new GetterSetter();
                for(int i =0;i<10;i++)
                {
                    obj.setdata(empNAME[i],empLOC[i],empDES[i],empID[i],empSALARY[i]);
                    System.out.print(obj.getId() + "  ");
                    System.out.print(obj.getName() + "  ");
                    System.out.print(obj.getSalary() + "  ");
                    System.out.print(obj.getloc() + "  ");
                    System.out.println(obj.getdes() + "  ");
                }
                List<String> list1= new ArrayList<String>(Arrays.asList(empNAME));
                List<String> list3= new ArrayList<String>(Arrays.asList(empLOC));
                List<String> list4= new ArrayList<String>(Arrays.asList(empDES));
                List<String> result1 = list1.stream().collect(Collectors.toList());
                System.out.println("All the Name entries: "+result1);
                System.out.print("Salaries greater than '50000': " );
                for(int i=0;i<10;i++){
                    if(empSALARY[i]>50000){
                        System.out.print(empSALARY[i] + " ");
                    }
                }
                System.out.println();
                List<String> result3 = list3.stream().filter(s->s.startsWith("M")).collect(Collectors.toList());
                System.out.println("All the Location entries starting with 'M': "+result3);
                List<String> result4 = list4.stream().filter(s->s.endsWith("E")).collect(Collectors.toList());
                System.out.println("All the Designation entries ending with 'E': "+result4);
                break;
            case 2:
                System.out.println("Enter the number of data entries you want ex. 10 employees, 20 employees");
                int n = input.nextInt();
                double[] empid = new double[n];
                String[] empname = new String[n];
                double[] empsalary = new double[n];
                String[] emploc = new String[n];
                String[] empdes = new String[n];
                for(int i=0;i<n;i++)
                {
                    System.out.println("Enter the data of employee " + i);
                    System.out.print("Enter ID ");
                    empid[i]= input.nextDouble();
                    System.out.print("Enter Name ");
                    empname[i] = input.next();
                    System.out.print("Enter Salary ");
                    empsalary[i]= input.nextDouble();
                    System.out.print("Enter Location ");
                    emploc[i] = input.next();
                    System.out.print("Enter Designation ");
                    empdes[i]= input.next();
                }

                GetterSetter obj1 = new GetterSetter();
                for(int i =0;i<n;i++)
                {
                    obj1.setdata(empname[i],emploc[i],empdes[i],empid[i],empsalary[i]);
                    System.out.print(obj1.getId() + "  ");
                    System.out.print(obj1.getName() + "  ");
                    System.out.print(obj1.getSalary() + "  ");
                    System.out.print(obj1.getloc() + "  ");
                    System.out.println(obj1.getdes() + "  ");
                }
                List<String> list5= new ArrayList<String>(Arrays.asList(empname));
                List<String> list6= new ArrayList<String>(Arrays.asList(emploc));
                List<String> list7= new ArrayList<String>(Arrays.asList(empdes));
                List<String> result5 = list5.stream().collect(Collectors.toList());
                System.out.println("All the Name entries: "+result5);
                System.out.print("Salaries greater than '50000': " );
                for(int i=0;i<n;i++){
                    if(empsalary[i]>50000){
                        System.out.print(empsalary[i] + " ");
                    }
                }
                System.out.println();
                List<String> result6 = list6.stream().filter(s->s.startsWith("M")).collect(Collectors.toList());
                System.out.println("All the Location entries starting with 'M': "+result6);
                List<String> result7 = list7.stream().filter(s->s.endsWith("E")).collect(Collectors.toList());
                System.out.println("All the Designation entries ending with 'E': "+result7);
                break;
        }


    }

}