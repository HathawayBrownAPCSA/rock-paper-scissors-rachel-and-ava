
/**
 * Plays Rock-Paper-Scissors!
 *
 * @author Rachel B. and Ava K.
 * @version 2022-10-28
 */
public class RPSMatch
{
    // instance variables - replace the example below with your own
    private String humanPlay;
    private String computerPlay;
    private int humanWins;
    private int computerWins;
    private int ties;

    /**
     * Constructor for objects of class RPSMatch
     */
    public RPSMatch()
    {
        // initialise instance variables
        humanWins = 0;
        computerWins = 0;
        ties = 0;
        
    }

    /**
     * We worked on every part together
     */
    public void setHumanPlay (String s)
    {
        // put your code here
        humanPlay = s;
    }
    /**
     * No params
     * @return the computer's play
     */
    public String getComputerPlay()
    {
        // NO CHEATING VERSION
        // int cResult = (int) (Math.random() * 3) + 1;
         // if (cResult == 1)
         //{
          //   return "Rock";
         // }
         // else if (cResult == 2)
         // {
            // return "Paper";
         // }
         // else
        // {
           //  return "Scissors";
         // }
         
         // Cheating version:
         int cResult = (int) (Math.random() * 3);
         if(humanPlay == "Rock")
         {
             if(cResult > 2)
             {
                 computerPlay = "Scissors";
             }
             else
             {
                cResult = (int) (Math.random() * 6);
                if(cResult > 2)
                {
                    computerPlay = "Rock";
                }
                 computerPlay = "Paper";
             }
        }
         if(humanPlay == "Scissors")
         {
              if(cResult > 2)
              {
                  computerPlay = "Paper";
              }
              else
              {
                cResult = (int) (Math.random() * 6);
                if(cResult > 2)
                {
                    computerPlay = "Scissors";
                }
                  computerPlay = "Rock";
              }
        }
        if(humanPlay == "Paper")
        {
            if(cResult > 2)
            {
                computerPlay = "Rock";
            }
            else
            {
                cResult = (int) (Math.random() * 6);
                if(cResult > 2)
                {
                    computerPlay = "Paper";
                }
                computerPlay = "Scissors";
            }
        }
        return computerPlay;
    }
    /**
     * @returns the result of each game
     */
    public String getResult()
    {
        if(computerPlay == humanPlay)
        {
            return "It's a tie!";
        }
        //when human play is rock
        if(humanPlay == "Rock")
        {
            if(computerPlay != "Paper")
            {
                humanWins += 1;
                return "You win!";
            }
        }
        else if (humanPlay == "Paper")
        {
            if(computerPlay != "Scissors")
            {
                humanWins += 1;
                return "You win!";
            }
        }
        else if(humanPlay == "Scissors")
        {
            if(computerPlay != "Rock")
            {
                humanWins += 1; 
                return "You win!";
            }
        }
        computerWins += 1;
        return "Take the L, bozo!";
    }
    /**
     * @return total number of human wins
     */
    public int getHumanWins()
    {
        return humanWins;
    }
    /**
     * @return total number of computer wins
     */
    public int getComputerWins()
    {
        return computerWins;
    }
    /**
     * @return total number of ties
     */
    public int getTies()
    {
        return ties;
    }
}
