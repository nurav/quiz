
/**
 * Write a description of class Regulations here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class Regulations
{
    public static void rules()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader buf=new BufferedReader(read);
        System.out.println("\fRules for the quiz.");
        System.out.println("\nLevel One and Two.");
        System.out.println("These levels have three categories. Each category has 5 questions , each worth 10 points.");
        System.out.println("You have four choices for the answer. ");
        System.out.println("To be eligible for the next level, you have to score at least 80 points in a level.");
        System.out.println("\nLevel Three.");
        System.out.println("The first two categories have 5 questions each worth 10 points.");
        System.out.println("The third category has one question worth 50 points.");
        System.out.println("You get give guesses for this question.");
        System.out.println("The answers will be displayed after you play a level.");
        System.out.println("The result will be displayed after you finish the quiz.");
        System.out.println("\nPlease DO ENJOY.");
        System.out.println("\nThank You.");
        while(true){
            System.out.println("continue? y/N");
            String s=buf.readLine();
            if(s.equalsIgnoreCase("y"))break;
            else if(s.equalsIgnoreCase("y")){System.out.println("\fThank you.");System.exit(0);}
                else continue;
            }
        }
    }
