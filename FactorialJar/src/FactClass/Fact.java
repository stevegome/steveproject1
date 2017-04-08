package FactClass;

public class Fact
{
	 public int facto(int f)
     {
            int fact=1;
            for(int i=1;i<=f;i++)
            {
                   fact=fact*i;}
            return fact;
     }
}
