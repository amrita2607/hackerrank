import java.io.*;
import java.util.*;
public class Solution
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String gname;
        int no;
        GList list=new GList(n);
        for(int i=0;i<n;i++)
        {
            scan.nextLine();
            gname=scan.nextLine();
            no=scan.nextInt();

            Guest x=new Guest(gname,no);
            list.add(x);
        }
        list.sort();
        int o=scan.nextInt();
        list.display();

        if(o==1)
        {
            scan.nextLine();
            gname=scan.nextLine();
            no=scan.nextInt();
            Guest y= new Guest(gname,no);
            list.add(y);
        }
        else
            list.remove();
        list.display();

    }
}
