import java.util.Scanner ;



public class Player {
    
    Scanner kb; 
    String name ; 
    Score scoreKeeper ; 
    Dice pairOfDice ; 
    int turnNum ; 
    
    public Player () {
        kb= new Scanner (System.in) ; 
        this.name = kb.nextLine() ; 
        
        this.name = name ;
        scoreKeeper = new Score () ; 
        pairOfDice = new Dice () ; 
        turnNum = 1 ; 
        
    
}

public int getGameScore () { 
    return scoreKeeper.getGameScore() ;
}

public int getRoundScore () {
    return scoreKeeper.getRoundScore() ; 
}

public String getName () {
    return name ; 
}

public int getTurnNum () {
    return turnNum ;
}

public void adjustTurnNum() {
     turnNum++ ; 
}

public void setName(String input) { 
    name = input ;
}

public void updateGameScore () {
    scoreKeeper.adjustGameScore() ; 
}

public void updateRoundScore () {
    scoreKeeper.adjustRoundScore(pairOfDice.rollValue()) ;
}

public void printScore() {
    System.out.println("Round Score:\t" + scoreKeeper.getRoundScore()) ; 
    System.out.println("Game Score:\t" + scoreKeeper.getGameScore()) ; 
}

public boolean winGameCheck () {
    if (scoreKeeper.getGameScore () >= 100) {
        System.out.print(name + "has won the game") ; 
        System.out.print(scoreKeeper.getGameScore() + "points!") ; 
        return true ; 
    }
    else {
        return false ;
    }

}
public String testRoll() {
    pairOfDice.rollDice() ; 

    return "d1 = " + pairOfDice.getD1() + "\nd2 = " + pairOfDice.getD2() ; 
    
     //public String testRoll() {
    // pairOfDice.rollDice() ; 
    // return " " ;
}

}