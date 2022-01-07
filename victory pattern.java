package Homework.victory;

public class PatternVictory
 {
    
    public static void printPattern(String s)
{
        String name = "Victory is mine";
        int i=name.length();
    

        for(i=0;i<=name.length()+8;i++)
{
            System.out.print(s);  
        }

    }
    public static void main(String[] args) 
{
        String name = "Victory is mine";
    for(int j=0;j<=3;j++)
{
        
    
        printPattern("/");
        
        System.out.println("\n||  " +name +"  ||");
        printPattern("\\");
        System.out.println("\n");

    }
        
    }  
    
}