import java.util.*;

class Pattern2
{

public static void main (String[] args) 
{

int n,i,j;
  
Scanner sc=new Scanner(System.in);
  
System.out.println("Enter n value : ");
  
n=sc.nextInt();
  
for(i=1;i<=n;i++)
  
{
      
for(j=1;j<=i;j++)
      
{
          
System.out.println("*");
      
}
      
System.out.println( );
  
}
  
for(i=n-1;i>=1;i--)
  
{
      
for(j=1;j<=i;j++)
      
{
          
System.out.println("*");
      
}
      
System.out.println( );
  
}

}

}