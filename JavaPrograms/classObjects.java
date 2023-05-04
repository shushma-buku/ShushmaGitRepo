public class classObjects
{
    public static void main(String[] Students) 
    {

        student[] s = new student[5];

        for (int i = 0; i < 5; i++)
        {
            int j = i + 1;
            s[i] = new student();
            s[i].registerNumber = "0000" + j;
            s[i].StudentName = "Student" + j;

            System.out.println("Registartion Number : " + s[i].registerNumber);
            System.out.println("Student Name : " + s[i].StudentName);
        }
    }


}
class student
{
    String registerNumber;
    String StudentName;
}
