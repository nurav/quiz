
/**
 * Write a description of class L

evels here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;

public class Levels
{
    boolean tryLevel=false;
    protected int score[]={0,0,0,0,0,0,0,0,0};
    boolean tries[]={false,false,false};
    boolean cattries[]={false,false,false,false,false,false,false,false,false};
    public void LevelOne()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader buf=new BufferedReader(read);
        Quiz obj=new Quiz();
        tries[0]=true;
        char ch='y';
        String question[]={
                "Which is the band that featured in the 2010 Football World Cup?",
                "Which is the busiest airport in the world?",
                "Which continent has the least population density?",
                "Which is the happiest country in the world?",
                "Which place is popularly known as the crossroads of the world?",
                "Who was responsible for the disintegration of the United Socialist Soviet Republic?",
                "Who is the builder of the People's Republic of China?",
                "Who was the liberator of South America?",
                "Which islands are disputed territory between Britain and Argentina?",
                "Which of the following was an Asian Tiger?",
                "Where are the Asian Games going to be hosted in 2010?",
                "Where is the US Open held?",
                "Who is developing the F1 track for the Indian GP?",
                "Where are the Olympics going to be held in 2016?",
                "Which American basketball player is named after a Japanese city?"};
        String answer[]={
                "Greenday","Freshlyground","Linkin Park","Black Eyed Peas",
                "Beijing Capital Airport","Atlanta Airport","La Garudia Airport","Heathrow Airport",
                "Asia","North America","Antarctica","Australasia",
                "Switrezland","Luxembourg","Venezuela","Malawi",
                "Times Square","Tinamen Square","Trafalgar Square","Bryant Park",
                "Adolf Hitler","Michael Gorbachev","Stalin","Mahatma Gandhi",
                "Mao Zedong","Den Xibao","Sun Yat Sen","Wen Jibao",
                "George Washington","Nelson Mandela","Simon Bolivar","King Kong",
                "Maldives","Galapagos Islands","Tristan da Cunha","Falkland Islands",
                "South Korea","Bangladesh","Turkmenistan","China",
                "Xi'an","Kyoto","Busan","Guangzhou",
                "Times Square","Queens","Brooklyn Bridge","Flushing Meadows",
                "Anil Ambani","Jaypee Group","Vijay Mallaya","Mukesh Ambani",
                "Brazil","Netherlands","South Africa","Australia",
                "Lebron James","Michael Jordan","Kobe Bryant","Sachin Tendulkar"};
        int coran[]={2,2,3,3,1,2,1,3,4,1,4,4,2,1,3};
        main:
        do
        {

            System.out.println("\fCategories:-");
            System.out.println("1) General Knowledge.");
            System.out.println("2) Sports.");
            System.out.println("3) History.");
            System.out.println("Enter the desired category.");
            int cho=Integer.parseInt(buf.readLine());
            System.out.println("\f");
            switch(cho)
            {
                case 1 :System.out.println("Welcome to the G.K.(General Knowlegde) Section.");pause();
                score[0]=0;
                ask(1,0,0,question,answer,coran,0);
                cattries[0]=true;
                break;
                case 2 :System.out.println("Welcome to the Sports Section.");pause();
                score[1]=0;
                ask(3,40,10,question,answer,coran,1);
                cattries[1]=true;
                break;
                case 3 :System.out.println("Welcome to the History Section.");pause();
                score[2]=0;
                ask(2,20,5,question,answer,coran,2);
                cattries[2]=true;
                break;
                default:System.out.println("Invalid choice.");

            }
            for(;;){
                System.out.println("Do you want to improve your score in any of the categories or try a new category? y/N\nRemember, you have to secure at least 80 points to move to the next level.");
                String s=buf.readLine();s=s.trim();
                if (s.equals("y")||s.equals("Y"))
                {ch='y';continue main;}
                else if(s.equals("n")|s.equals("N"))
                {ch='n';break;}
                else continue;}
        }while(ch=='y'||ch=='Y');
        System.out.println("\fDo you want to see the answers to the questions?"); 
        String s2=buf.readLine();s2=s2.trim();
        if(s2.equals("Y")||s2.equals("y"))
        { 
            int k=0;
            if(cattries[0]==true)
            {System.out.println("G.K.");
                for(int i=0;i<5;k+=4,i++)
                {
                    System.out.println(question[i]+"\n"+coran[i]+". "+answer[coran[i]+k-1]);
                }
            }
            if(cattries[1]==true)
            { System.out.println("Sports.");
               k=40;
                for(int i=5;i<10;k+=4,i++)
                
                    System.out.println(question[i]+"\n"+coran[i]+". "+answer[coran[i]+k-1]);
                }
            System.out.println("\n\npress y to continue");
            String s1=buf.readLine();s1=s1.trim();
            if (s1.equals("y")||s1.equals("Y"))
                System.out.println("\f");
            if(cattries[2]==true)
            {System.out.println("History.");
                k=20;
                for(int i=10;i<15;i++,k+=4)
                {
                    System.out.println(question[i]+"\n"+coran[i]+". "+answer[coran[i]+k-1]);
                }
                System.out.println("\n\npress y to continue");
                String s3=buf.readLine();s3=s3.trim();
                if (s3.equals("y")||s3.equals("Y"))
                    System.out.println("\f");}}

        

        Result.Calculate(score,tries,0);
        if(Result.eligible){      
            while(true){
                System.out.println("Do you want to try another level? y/N");
                String s=buf.readLine();s=s.trim();
                if(s.equals("Y")||s.equals("y"))
                { tryLevel=true;
                    return;}
                else if(s.equals("N")||s.equals("n"))
                {tryLevel=false;break;}
                else continue;
            }
        }
    }

    public void LevelTwo()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader buf=new BufferedReader(read);
        tries[1]=true;
        Quiz obj=new Quiz();
        char ch='y';
        String question[]={
                "Billionaire investor, friend of Bill Gates, donated all his wealth to Bill Gates Foundation, who is this man?",
                "Who is the Chairman of US Federal Reserve?",
                "'Lakme' brand was owned by which Indian business group before being sold to Unilever?",
                "Who was the founder of Air India?",
                "Which is the largest selling motorcycle in India?",
                "How many satellites are in orbit?",
                "What was the name of the Russian Sapce Shuttle programme?",
                "What is the successor to the Hubble Space Telescope?",
                "Which of the following is China's first manned space mission?",
                "Where is the European Space Agency's main spaceport located?",
                "Testifying before the Senate committee investigating charges that cigarette manufacturers had manipulated nicotine levels in cigarettes\n in order to addict consumers to their products, tobacco executives\n argued that cigarette smoking is not addictive. The primary reason they\n gave in support of this claim was that cigarette smoking was not regulated by the Federal Drug Administration.\n\nFor the tobacco executives' argument to be logically correct, which of the following must be assumed?",
                "No national productivity measures are available for underground industries that may exist but remain unreported. On the other hand, at\n least some industries that are run entirely by self-employed industrialists are included in national productivity measures.\n\nFrom the information given above, it can be validly concluded that",
                "Although most of the fastest growing jobs in today's economy will require a college degree, many of the new jobs being created-from\n home health aide to desktop publisher-require knowledge other than that gained from earning a degree. For workers in those jobs, good\n basic skills in reading, communication, and mathematics play an important role in getting a job and developing a career.\n\nFrom the information given above it can be validly concluded that, in today's economy,",
                "The symptoms of mental disorders are behavioral, cognitive, or emotional problems. Some patients with mental disorders can be\n effectively treated with psychotherapy, but it is now known that in some patients' mental disorders result from chemical imbalances\n affecting the brain. Thus, these patients can be effectively treated only with medication that will reduce or correct the imbalance.\n\nThe argument depends on assuming which one of the following?",
                "Russia's aggressive fishing in the prime fishing grounds of the Northern Pacific has led to a sharp decline in the populations of many fish\n and a general increase in the retail price of fish. This same pattern has occurred with far too many of our scarce vital natural resources,\n resulting in high prices for many products. It is likely then, that fish prices will continue to rise in the near future.\n\nIn making the argument above, the author relies on all of the following assumptions EXCEPT:"};
        String answer[]={
                "Warren Buffet","Carlos Slim","Anil Ambani","Larry Page",
                "Paul Lee","Barack Obama","Ben Bernarke","Harrison Lowe",
                "Godrej Industries","Tata Group","Reliance Industries","Bombay Dyeing",
                "Neville Tata","Ratan Tata","Pandit Jawaharlal Nehru","JRD Tata",
                "Hero Honda Karizma","Yamaha RX100","Hero Honda Splendour","Bajaj Pulsar",
                "1,000","20,000","9,000","500",
                "Buran","Baiknour","Mir","Phobos",
                "Spitzer Telescope","Chandra Observatory","James Webb Telescope","Herschell Space Telescope",
                "Long March 1","Shenzhou 5","Chang'e 2","Shuguang-1",
                "Kapustin Yar","Uchinoura Space Center","Korou","Esrange",
                "Substances that are not addictive are not regulated by ...........the Federal Drug Administration.","Some addictive substances are not regulated by the ...........Federal Drug Administration.","Substances that are not regulated by the Federal Drug ...........Administration are not addictive.","The tobacco executives lied when they claimed that ...........cigarette smoking was not addictive.",
                "no industries that are run entirely by self-employed industrialists operate underground","there are at least some industries run entirely by self-employed industrialists that are not underground industries","there are at least some underground industries for which national productivity measures are available","there are at least some industries run entirely by self-employed industrialists that are underground industries",
                "a job as a home health aide will rely more on communication skills than on basic skills in reading and mathematics","skills in reading, communication, and mathematics play an important role in developing a career as a desktop publisher","desktop publisher jobs and home health aide jobs are not among the fastest growing jobs","if a job is one of the fastest growing jobs, it will require a college degree",
                "Most mental disorders are not the result of chemical imbalances affecting the brain.","Medication is always more effective in treating patients with mental disorders than is psychotherapy.","Treatment with psychotherapy has no effect on mental disorders other than a reduction of the symptoms.","Treatment by psychotherapy can produce no effective reduction in or correction of chemical imbalances that cause mental disorders.",
                "The scarcity of fish is a determining factor in its price.","Fish populations will not recover in the near future.","Fishing practices can substantially influence the demand for fish.","There will not be any substantial decrease in other costs involved in the fishing process that could keep the price of fish from increasing."};
        int coran[]={1,3,2,4,3,3,1,3,2,3,3,2,2,4,3};
        main:
        do
        {

            System.out.println("\fCategories:-");
            System.out.println("1) Money.");
            System.out.println("2) Logical Reasoning.");
            System.out.println("3) Space.");
            System.out.println("Enter the desired category.");
            int cho=Integer.parseInt(buf.readLine());
            System.out.println("\f");
            switch(cho)
            {
                case 1 :System.out.println("Welcome to the Money Section.");pause();
                score[3]=0;
                ask(1,0,0,question,answer,coran,3);
                cattries[3]=true;
                break;
                case 2 :System.out.println("Welcome to the Logical Reasoning Section.");pause();
                score[4]=0;
                ask(3,40,10,question,answer,coran,4);
                cattries[4]=true;
                break;
                case 3 :System.out.println("Welcome to the Space Section.");pause();
                score[5]=0;
                ask(2,20,5,question,answer,coran,5);
                cattries[5]=true;
                break;
                default:System.out.println("Invalid choice.");

            }
            for(;;){
                System.out.println("Do you want to improve your score in any of the categories or try a new category? y/N\nRemember, you have to secure at least 80 points to move to the next level.");
                String s=buf.readLine();s=s.trim();
                if (s.equals("y")||s.equals("Y"))
                {ch='y';continue main;}
                else if(s.equals("n")|s.equals("N"))
                {ch='n';break;}
                else continue;}
        }while(ch=='y'||ch=='Y');
        System.out.println("\fDo you want to see the answers to the questions?"); 
        String s2=buf.readLine();s2=s2.trim();
        if(s2.equals("Y")||s2.equals("y"))
        { int k=0;
            if(cattries[3]==true)
            {System.out.println("Money.");

                for(int i=0;i<5;k+=4,i++)
                {
                    System.out.println(question[i]+"\n"+coran[i]+". "+answer[coran[i]+k-1]);
                }
            }
            if(cattries[4]==true){
                System.out.println("Logical Problems.");
                k=40;
                for(int i=10;i<15;k+=4,i++)
                {
                    System.out.println(question[i]+"\n"+coran[i]+". "+answer[coran[i]+k-1]);
                }
            }
            System.out.println("\n\npress y to continue");
            String s1=buf.readLine();s1=s1.trim();
            if (s1.equals("y")||s1.equals("Y"))
                System.out.println("\f");
            if(cattries[5]==true){
                System.out.println("Space.");
                for(int i=5;i<10;i++,k+=4)
                {k=20;
                    System.out.println(question[i]+"\n"+coran[i]+". "+answer[coran[i]+k-1]);
                }
                System.out.println("\n\npress y to continue");
                String s3=buf.readLine();s3=s3.trim();
                if (s3.equals("y")||s3.equals("Y"))
                    System.out.println("\f");}

        }
        Result.Calculate(score,tries,3);
        if(Result.eligible){      
            while(true){
                System.out.println("Do you want to try another level? y/N");
                String s=buf.readLine();s=s.trim();
                if(s.equals("Y")||s.equals("y"))
                { tryLevel=true;
                    return;}
                else if(s.equals("N")||s.equals("n")){tryLevel=false;break;}
                else continue;}
        }

    }

    public void LevelThree()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader buf=new BufferedReader(read);
        Quiz obj=new Quiz();
        tries[2]=true;
        char ch='y';
        String question[]={
                "Who invented the ballpoint pen?",
                "This statesman, politican, scholar, inventor, and one of our early presidents invented the swivel chair, the spherical sundial, the \nmoldboard plow, and the cipher wheel.",
                "Who invented the Jet Engine?",
                "Who invented Gunpowder?",
                "This part-time race car driver invented the bucket seat in 1969. Who was he?",
                "Who wrote the famous book - 'We the people'?",
                "Who wrote the line: ' A thing of beauty is a joy forever'?",
                "'Mirchchhakatika' was written by",
                "The first history book was written by",
                "Who is the author of famous statement: \"That Government is the best which governs least\"?"};
        String answer[]={
                "Biro Brothers","Waterman Brothers","Bicc Brothers","Write Brothers",
                "George Washington","Alexander Hamilton","John Adams","Thomas Jefferson",
                "Gottlieb Daimler","Sir Frank Whittle","Lewis E. Waterman","Henry Ford",
                "G. Ferdinand Von Zeppelin","Leonardo Da Vinci","Roger Bacon","Leo H Baekeland",
                "Harrison Frazier","Steve McQueen","Paul Newman","John Wayne",
                "Khushwant Singh","T.N.Kaul","J.R.D. Tata","Nani Palkhivala",
                "Robert Browing","John Keats","P.B.Shelley","William Wordsworth",
                "Banabhatta","Vikramaditya","Shudraka","Kalhana",
                "Herodotus","Julius Caesar","Euclid","Aristotle",
                "Henry David Thoreau","Alexis De Tocqueville","Harold Laski","Herbert Spencer",};
        int coran[]={1,4,2,3,2,4,2,3,1,4};
        main:
        do
        {

            System.out.println("\fCategories:-");
            System.out.println("1) Inventors.");
            System.out.println("2) Literature.");
            System.out.println("3) Analytical problems.");
            System.out.println("Enter the desired category.");
            int cho=Integer.parseInt(buf.readLine());
            System.out.println("\f");
            switch(cho)
            {
                case 1 :System.out.println("Welcome to the Inventors Section.");pause();
                score[6]=0;
                ask(1,0,0,question,answer,coran,6);
                cattries[6]=true;
                break;
                case 2 :System.out.println("Welcome to the Literature Section.");pause();
                score[7]=0;
                ask(2,20,5,question,answer,coran,7);
                cattries[7]=true;
                break;
                case 3 :System.out.println("Welcome to the Analytical problems Section.");pause();
                score[8]=0;
                int i=0;
                System.out.println("\fA 120 wire cable has been laid firmly underground between two telephone exchanges located 10km apart.\n\nUnfortunately after the cable was laid it was discovered to be the wrong type, the problem is the individual wires \nare not labeled. There is no visual way of knowing which wire is which and thus connections at either end is not \nimmediately possible.\n\nYou are a trainee technician and your boss has asked you to identify and label the wires at both ends without \nripping it all up. You have no transport and only a battery and light bulb to test continuity. You do have tape and \npen for labeling the wires.\n\nWhat is the shortest distance in kilometers you will need to walk to correctly identify and label each wire?");
                qloop:
                for(int j=0;j<5;j++)
                {
                    System.out.println("You have "+(5-j)+" guesses.");
                    String s=buf.readLine();
                    for(int h=0;h<s.length();h++)
                    {
                        if(!Character.isDigit(s.charAt(h))){j--;continue qloop;}
                    }
                    int inp=Integer.parseInt(s);
                    if(inp==20){score[8]+=50;break;}
                    else continue;

                }

                cattries[8]=true;
                break;
                default:System.out.println("Invalid choice.");

            }
            for(;;){
                System.out.println("Do you want to improve your score in any of the categories or try a new category? y/N\nRemember, you have to secure at least 80 points to move to the next level.");
                String s=buf.readLine();s=s.trim();
                if (s.equals("y")||s.equals("Y"))
                {ch='y';continue main;}
                else if(s.equals("n")|s.equals("N"))
                {ch='n';break;}
                else continue;}
        }while(ch=='y'||ch=='Y');
        System.out.println("\fDo you want to see the answers to the questions?"); 
        String s2=buf.readLine();s2=s2.trim();
        if(s2.equals("Y")||s2.equals("y"))
        { 
            int k=0;
            if(cattries[6]==true){
                System.out.println("Inventors.");
                for(int i=0;i<5;i++,k+=4)
                {
                    System.out.println(question[i]+"\n"+coran[i]+". "+answer[coran[i]+k-1]);
                }}
            System.out.println("Literature.");
            if(cattries[7]==true){
                k=20;
                for(int i=5;i<10;i++,k+=4)
                {
                    System.out.println(question[i]+"\n"+coran[i]+". "+answer[coran[i]+k-1]);
                }}
            System.out.println("\n\npress y to continue");
            String s1=buf.readLine();s1=s1.trim();
            if (s1.equals("y")||s1.equals("Y"))
                System.out.println("\f");
            if(cattries[8]==true){

                System.out.println("Analytical Problem.");
                System.out.println("20.");
                System.out.println("At one end label a wire \"A\". Then join two wire and label them both \"B\", then tie three (not already joined) wires ");
                System.out.println("together and call them each \"C\"....continue until all the wires are joined together in groups of 1, 2, 3, 4, 5, ");
                System.out.println("etc....for a 120 strand cable. NOTES that the largest group will have 15 wires.");
                System.out.println("\nNow walk to the other end.\n");
                System.out.println("Using a (battery and light bulb) it is now possible, for example, to find the wire that wasn't joined to any of the ");
                System.out.println("others. It is similarly possible to find which wires are in a pair, which is joined in a group of 3, etc. Each time a ");
                System.out.println("group is found the technician should label it with the letter for the group, so the single wire is labeled 'a', the ");
                System.out.println("pair are each labeled \"A\", etc....this now matches the other end.....the letters will go up to \"O\". Now take \"A\", ");
                System.out.println("\"B\", up to \"O\" and join them together in a group and label each one with \"15\", so we have cable \"A15\", \"B15\", ");
                System.out.println("\"C15\", up to \"O15\". Take the second and last \"B\"wire and ");
                System.out.println("join it with a remaining \"C\", \"D\", up to \"O\" and label these each \"14\" so we have \"B14\", \"C14\", up to \"O14\". ");
                System.out.println("Repeat this until at the end there will be a single \"O\" cabled labeled \"O1\".");
                System.out.println("\nNow walk to the other end.\n");
                System.out.println("Now untie all the old connections and identify the group labeled \"1\", \"2\", \"3\" ...\"15\" at which point each wire at\n");
                System.out.println("each end has a unique classification.");
                System.out.println("\n\npress y to continue");
                String s3=buf.readLine();s3=s3.trim();
                if (s3.equals("y")||s3.equals("Y"))
                    System.out.println("\f");}
        }

        Result.Calculate(score,tries,6);
        if(Result.eligible){      
            while(true){
                System.out.println("Do you want to try another level? y/N");
                String s=buf.readLine();s=s.trim();
                if(s.equals("Y")||s.equals("y"))
                { tryLevel=true;
                    return;}
                else if(s.equals("N")||s.equals("n")){tryLevel=false;break;}
                else continue;}
        }
        //Result(
    }

    public void ask(int l,int i,int k,String question[],String answer[],int coran[],int sctype)throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader buf=new BufferedReader(read);
        int ch=0;
        for(;k<l*5;i+=4,k++)
        {
            System.out.println("\f"+question[k]);
            for(int j=i,c=1;j<i+4;j++,c++)
            {System.out.print("<"+c+">"+answer[j]+"\n");}
            System.out.println("\nEnter your choice.");
            String s=buf.readLine();
            if(s.trim().equals("1")||s.trim().equals("2")||s.trim().equals("3")||s.trim().equals("4"))
                ch=Integer.parseInt(s);
            if(ch==coran[k])score[sctype]+=10;
            else if(ch>0&&ch<5);
            else {i-=4;k--;continue;}
        }
    }

    public void pause()
    {
        for(int i=0;i<99999;i++)
        {
            for(int j=0;j<11111;j++){}
        }
    }
}