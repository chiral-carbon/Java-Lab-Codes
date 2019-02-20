import java.util.Scanner;
class B216001_5
{
    int c = 0;
    void func()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s = sc.next();
        System.out.println("The anagrams are: ");
        disp("", s);
    }
  
    void disp(String s1, String s2)
    {
        if(s2.length()<=1)
        {
            c++;
            System.out.println(s1+s2);
        }
        else
        {
            for(int i=0; i<s2.length(); i++)
            {
                String x = s2.substring(i, i+1);
                String y = s2.substring(0, i);
                String z = s2.substring(i+1);
                disp(s1+x, y+z);
            }
        }
    }
    public static void main(String args[])
    {
        B216001_5 obj=new B216001_5();
        obj.func();
    }
}
