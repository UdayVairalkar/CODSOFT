import java.util.Scanner;

class STUDENT_GRADE_CALCULATOR
{
    public static void main (String args [])
    {
      int marks=0; 
      int totalmarks=0;
      float percentage;
        System.out.println("enter the total number of subject ");
        int Subject,i;
        Scanner sc = new Scanner (System.in);
        Subject = sc.nextInt();
        for ( i=0;i<Subject;i++)
        {
System.out.println("enter the marks for each subject out of 100");

marks=sc.nextInt();
totalmarks=totalmarks+marks;


        }
        percentage =(float) totalmarks / Subject;
       System.out.println("the percentage of students is ="+percentage);
       if (percentage>=75)
    {
        System.out.println("grade A");
    }
    else if (percentage  >=60)
    {
        System.out.println("grade b");
    }
    else if (percentage >=40)
        {
System.out.println("grade c");
}
else 
{
    System.out.println("fail");
}

System.out.println("the total marks is ="+totalmarks);
System.err.println("percentage is "+percentage);

    }
}
