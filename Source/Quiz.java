
/**
 * Write a description of class Quiz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class Quiz
{
    public static void main(String args[])throws IOException
    {
        Levels ask=new Levels();
        try{
            int score[]=new int[9];
            char c=' ';

            InputStreamReader read=new InputStreamReader(System.in);
            BufferedReader buf=new BufferedReader(read);
            System.out.println("   <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("(     ||      ||   ||]]]]] ||      //]]]]   //]]]]\\\\ //\\\\    //\\\\   ||]]]]]       )");
            System.out.println("(     ||      ||   ||      ||      ||       ||    || || \\\\  //  ||  ||            )");
            System.out.println("(     ||      ||   ||]]]   ||      ||       ||    || ||  \\\\//   ||  ||]]]         )");
            System.out.println("(     || //\\\\ ||   ||      ||      ||       ||    || ||         ||  ||            )");
            System.out.println("(     \\\\//  \\\\//   ||]]]]] ||]]]]] \\\\]]]]   \\\\]]]]// ||         ||  ||]]]]]       )");
            System.out.println("\n            -------------------------------------------------------              \n");
            System.out.println("(                               [[[]]]  //\\\\                                      )");
            System.out.println("(                                 ||    || ||                                     )");
            System.out.println("(                                 ||    \\\\//                                      )");
            System.out.println("\n            -------------------------------------------------------              \n");
            System.out.println("(    \\\\      ||  || ||]]\\\\    ||]      || [[[[[[]]]]]] ||]      ||     [[||       )");
            System.out.println("(     \\\\     ||  || ||   \\\\   || ]     ||      ||      || ]     ||    [[          )");
            System.out.println("(     |\\\\    ||  || ||    \\\\  ||  ]    ||      ||      ||  ]    ||   [[           )");
            System.out.println("(     ||\\\\   ||  || ||    //  ||   ]   ||      ||      ||   ]   ||  [[            )");
            System.out.println("(     || \\\\  ||  || ||   //   ||    ]  ||      ||      ||    ]  || [[             )");
            System.out.println("(     ||     ||  || ||   \\\\   ||     ] ||      ||      ||     ] ||  [[   [[[[     )");
            System.out.println("(     ||     ||  || ||    \\\\  ||      ]||      ||      ||      ]||   [[ [[ ]]     )");
            System.out.println("(     ||     \\\\=//  ||      \\\\||       || [[[[[[]]]]]] ||       ||    [[    ]]    )");
            System.out.println("\n            -------------------------------------------------------              \n");
            System.out.println("(              ||\\\\   //]]]]]\\\\ [[[[[[]]]]]] ||]      || \\\\                       )");
            System.out.println("(              || \\\\  ||     ||      ||      || ]     ||  \\\\                      )");
            System.out.println("(              ||  \\\\ ||     ||      ||      ||  ]    ||  |\\\\                     )");
            System.out.println("(              ||  // ||     ||      ||      ||   ]   ||  ||\\\\                    )");
            System.out.println("(              || //  ||     ||      ||      ||    ]  ||  || \\\\                   )");
            System.out.println("(              ||//   ||     ||      ||      ||     ] ||  ||                      )");
            System.out.println("(              ||     ||     ||      ||      ||      ]||  ||                      )");
            System.out.println("(              ||     \\\\]]]]]// [[[[[[]]]]]] ||       ||  ||                      )");
            System.out.println("   <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            for(int i=0;i<999999;i++)
            {
                for(int j=0;j<11111;j++){}
            }
            System.out.println("\fPlease enter your name.");
            String name=buf.readLine();
            main:
            do{
                System.out.println("\f");
                System.out.println("\n\n\n\n\n\n\n\n\n\nMenu:-");
                String levName[]={"Level One","Level Two","Level Three"};
                for(int i=0;i<3;i++)
                {
                    if(ask.tries[i]==false)
                        System.out.println(i+1+") "+levName[i]);
                }
                System.out.println("For the rules, type \"rules\"");
                String s=buf.readLine();s=s.trim();
                if(s.equals("rules"))
                    Regulations.rules();
                else if(s.equals("1")||s.equals("2")||s.equals("3"))
                {int ch=Integer.parseInt(s);
                    switch(ch)
                    {
                        case 1 :ask.LevelOne();
                        break;
                        case 2 :ask.LevelTwo();
                        break;
                        case 3 :ask.LevelThree();
                        break;
                        default:System.out.println("Invalid Input.");
                    }
                }
                if(s.equals("rules")){
                    c='y';continue main;
                }
                if(ask.tryLevel)
                    c='y';
                else if(ask.tryLevel==false)
                    c='n';
            }while(c=='y'||c=='Y');

            Result.Display(ask.score,ask.tries,ask.cattries,name);
        }
        catch(NumberFormatException f)
        {
            System.out.println("It seems you have entered the wrong data. Please try again.");
        }

    }

}