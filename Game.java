import java.util.Scanner  ;

public class Game {
    Player p1; 
    Player p2; 
    Player currentPlayer ;
    Scanner kb ; 

    public Game() {
        System.out.println("Player 1 type your name") ;
        p1 = new Player () ; 
        System.out.println("Player 2 type your name") ;
        p2 = new Player () ; 
        currentPlayer = p1 ; 
        kb = new Scanner (System.in) ; 
        
        
        System.out.println(currentPlayer.getName() +" it's your turn") ; 
        System.out.println(currentPlayer.testRoll()) ; 
        
        
        
    }
    public static void main (String [] agrs) {
        //create a game object
        Game pigDice = new Game() ; 
        pigDice.start() ; 

        
        
        
            
    }
    
    public void start() {
        while (true) {
            System.out.println(currentPlayer.getName() + " it's your turn") ; 
            System.out.println("Your Round Score is " +currentPlayer.getRoundScore()) ;
            System.out.println(currentPlayer.testRoll());
            
            System.out.println("Your Total Game score is " +currentPlayer.getGameScore()) ; 
            //currentPlayer.printScore() ; 
            currentPlayer.winGameCheck () ;
            
            
        }
        
    }
   
    public void changePlayer () {
        if (currentPlayer.equals(p1)) {
            currentPlayer = p2 ;
        }
        else {
            currentPlayer = p1 ;
        }
        
    }
    public boolean rollAgain () {
        System.out.println("Would you like to role again? Y/N") ; 
        String answer = kb.nextLine().toUpperCase() ; 
        if (answer.equals("Y")) {
            //APPLY BELOW CONCEPT TO GAMESCOER
            currentPlayer.updateRoundScore() ; 
            return true ; 
            
        }
        else {
            changePlayer() ;
            currentPlayer.updateGameScore() ; 
            return true ; 
            
            
            
        }
    }
}