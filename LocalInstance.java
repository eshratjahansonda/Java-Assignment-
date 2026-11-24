//23. Uses of Local and Instance variable.

public class LocalInstance {

    //Instance variables - outside the methods/constructors but inside the class.a 
    String team,league;

    void league(String teamName, String leagueName){

        team /*Instance var.*/ = teamName; //local var.(as it is in the league() method.)
        league /*Instance var.*/ = leagueName; //local var.(as it is in the league() method.)
    }

    void display(){
        System.out.println("Choosing Team through Instance variable : \nLeague Name = "+league+"\n"+"Team Name = "+team+"\n");
    }
    public static void main(String[] args) {
        LocalInstance choice1 = new LocalInstance();
        

        //Choice 1 passing value to the league method which stores the data to the Instance variable.

        choice1.league("Real Madrid","La Liga");
        choice1.display(); //It works  throughout Instance variable to the league() method


        //Choice 2 using local variable to store the data inside the main method.

        String team_2 = "Liverpool"; //Local variables (As it is inside a method)
        String league_2 = "Premier League"; //Local variables (As it is inside a method)

        System.out.println("Choosing Team through Local variable : \nLeague Name = "+league_2+"\n"+"Team Name = "+team_2+"\n"); //It simply prints the value of Local variables.

    }
}