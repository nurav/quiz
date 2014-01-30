
/**
 * Write a description of class Result here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Result
{
    static boolean eligible;
    public static void Calculate(int score[],boolean tries[],int catNo)
    {
        
        int s=score[catNo]+score[catNo+1]+score[catNo+2];
        if(s>=80)
            eligible=true;
    }

    public static void Display(int score[],boolean tries[],boolean cattries[],String name)
    {
        String show[]=new String[9];
        String showtot[]=new String[3];
        for(int i=0,j=1;i<9;i++,j++)
        {

            if(cattries[i]==false)
                show[i]="Not Attemped";
            else 
                show[i]=Integer.toString(score[i]);}
        for(int i=0,j=1;i<3;i++,j+=3){
            {int totscore=score[j-1]+score[j]+score[j+1];
                if(tries[i]==true)
                    showtot[i]=Integer.toString(totscore);
                else
                    showtot[i]="Not Attempted";
            }
        }
        System.out.println("\f");
        System.out.println(name+", here's your result.");
        System.out.println("   ===========================================================");
        System.out.println("  (          ||\\\\  ||]]]   //  ||   || ||    ]]]]]]]]        )");
        System.out.println(" (           || \\\\ ||     //   ||   || ||       ||            )");
        System.out.println("(            || // ||]]   ]]]] ||   || ||       ||             )");
        System.out.println(" (           || \\\\ ||       // ||   || ||       ||            )");
        System.out.println("  (          ||  \\\\||]]]   //   \\\\=//  ||]]]]   ||           )");
        System.out.println("   ===========================================================");
        System.out.println("   Level One                                                ");
        System.out.println("            General Knowledge     : "+show[0]+"                         ");
        System.out.println("            Sports                : "+show[1]+"                         ");
        System.out.println("            History               : "+show[2]+"                         ");
        System.out.println("            Total                 : "+showtot[0]+"                         ");
        System.out.println("                                                            ");
        System.out.println("   Level Two                                                ");
        System.out.println("            Money                 : "+show[3]+"                         ");
        System.out.println("            Logical Reasoning     : "+show[4]+"                         ");
        System.out.println("            Space                 : "+show[5]+"                        ");
        System.out.println("            Total                 : "+showtot[1]+"                         ");
        System.out.println("                                                            ");
        System.out.println("   Level Three                                              ");
        System.out.println("            Inventors             : "+show[6]+"                         ");
        System.out.println("            Literature            : "+show[7]+"                         ");
        System.out.println("            Analytical Reasoning  : "+show[8]+"                         ");
        System.out.println("            Total                 : "+showtot[2]+"                        ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("   [[]] || ||  ||=|| ||]  || || //      ||  ||||=|| ||  || ");
        System.out.println("    ||  ||=||  ||=|| || ] || ||<          ||  || || ||  || ");
        System.out.println("    ||  || ||  || || ||  ]|| || ||        ||  ||=||  \\\\=//  ");
        
        
        System.exit(0);
    }
}

