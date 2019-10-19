import java.util.*;
class StringCompression
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int index=0,count=1,i;
    String str=s.substring(0,1);
    for(i=1;i<s.length();i++)
    {
      char ch=s.charAt(i);
      if(ch==str.charAt(index))
      {
        count++;
      }
      else
      {
        index+=2;
        count=1;
        str+=count;
        str+=ch;
      }
    }
    System.out.println(str+count);
  }
}
