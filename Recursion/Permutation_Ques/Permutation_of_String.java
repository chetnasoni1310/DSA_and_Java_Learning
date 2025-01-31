package Recursion.Permutation_Ques;

import java.util.ArrayList;

public class Permutation_of_String {
    public static void permutation(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return ;
        }
        char ch=up.charAt(0);

        for(int i=0;i<=p.length();i++)  //agar length 2 hai toh 3 baar chlega  for= 0,1,2 and then terminate
        {
                String first=p.substring(0,i);
                String second=p.substring(i,p.length());
                permutation(first+ch+second , up.substring(1));
        }
    }
/*
* Dekho ho yeh rha h ki
* pehle p string khali thi toh humne ch mai a rkha
* fir loop ek baar chalega for i =0 because length is 0
* toh first string hogi empty
*     second bhi empty
* dono ke beech mai ch i.e. a fill krdia
* fir a ko hata ke baaki substring paas krdi


* fir bc paas kia humne
* ch=b store hua
* fir loop chalega 2 baar for i=0 and i=1 (jab voh return ho rha hoga tb 1 ke liye chlega
*                                         pehle toh sirf 0 ke liye chlke firse recursive call krdega )
*then b ke liye first=""
*         second =a
* toh b jud jayega as ""+b+a
* fir recursive call krega b ko bhi hata ke for up=c


*fir c ke liye ch=c
* loop 3 baar chlega 0,1,2
* for i=0
* first=""
* second=ba
* toh p=""+c+ba = cba
* then recursive call mai c ko hata ke jayega i.e. "" empty up
* so will print out p string which is cba and then again came to loop
*
*
* now i=1 and then so on
* */
    public static ArrayList<String> permutation_II(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);

        ArrayList<String> ans=new ArrayList<String>();

        for(int i=0;i<=p.length();i++)  //agar length 2 hai toh 3 baar chlega  for= 0,1,2 and then terminate
        {
            String first=p.substring(0,i);
            String second=p.substring(i,p.length());
            ans.addAll(permutation_II(first+ch+second , up.substring(1)));
        }
        return ans;
    }

    public static int Permutation_Count(String p, String up)
    {
        if(up.isEmpty())
        {

            return 1;
        }
        char ch=up.charAt(0);

       int count=0;
        for(int i=0;i<=p.length();i++)  //agar length 2 hai toh 3 baar chlega  for= 0,1,2 and then terminate
        {
            String first=p.substring(0,i);
            String second=p.substring(i,p.length());
           count+= (Permutation_Count(first+ch+second , up.substring(1)));
        }
        return count;
    }
    public static void main(String[] args) {
        permutation("","abc");
        ArrayList<String> list= permutation_II("","abc");
        System.out.println(list);
       int count= Permutation_Count("","abc");
        System.out.println(count);
    }
}
