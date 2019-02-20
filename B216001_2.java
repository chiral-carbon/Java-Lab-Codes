import java.io.*;
import java.util.Scanner;
class Detail
{
    String name, address;
    long telno;
    int rent;
    Detail(String s,String a,long t,int r)
    {
        name=s;
        address=a;
        telno=t;
        rent=r;
    }
    void show()
    {
        System.out.println(name);
        System.out.println(address);
        System.out.println(telno);
        System.out.println(rent);

    }
}
class Bill extends Detail
{
    int n;
    double amt;
    Bill(int bt,String nm,String ad,long tel,int re)
    {
        n=bt;
        name=nm;
        address=ad;
        telno=tel;
        rent=re;
        amt=0.00;
    }
    void cal()
    {
        if(n<=100)
        {
            amt=rent;
        }
        else if(n<=200)
        {
            amt=.60*n+rent;
        }
        else if(n<=300)
        {
            amt=.8*n+rent;
        }
        else
        {
            amt=1*n+rent;
        }
     }
     void show()
     {
        System.out.println(name);
        System.out.println(address);
        System.out.println(telno);
        System.out.println(rent);
        System.out.println(amt);
        System.out.println(n);
    }
}
class B216001_2
{
    public static void main(String [] args)
    {
        Bill obj;
        obj.Bill(100,"Abhipsha","Bbsr",4454,500);
        obj.show();
    }
}



