class Participants
{
    public static void main(String s[])
    {
        Student students[] = new Student[45];
    
        students[0] = new Student();
        students[0].name = "Sample";
        students[0].rollnum = "CS16D005";
        students[0].likegit = true;
    
        //Fill in your details in the same format as given above
        
        students[1] = new Student();
        students[1].name = "Aslesh";
        students[1].rollnum = "CS17B049";
        students[1].likegit = true;

	students[2] = new Student();
        students[2].name = "lalitha";
        students[2].rollnum = "CE17B063";
        students[2].likegit = true;
        
        
        
        
        
        
        
        // DON'T CHANGE THE BELOW CODE -------------------------------------------
        int i=0;
    
        for(; students[i]!= null ; i++)
        {
                if (students[i].likegit)
                    System.out.println( students[i].name  + " likes git ");
                else
                    System.out.println( students[i].name  + " does not like git :( ");
        }
        
        System.out.println( "Number of student records updated so far: "+ i + " out of 44");
        
    }

}

class Student
{
    String name;
    String rollnum;
    boolean likegit;
}
