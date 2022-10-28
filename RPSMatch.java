
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
         int cResult = (int) (Math.random() * 4);
         if(humanPlay == "Rock")
         {
             if(cResult >= 2)
             {
                 computerPlay = "Paper";
             }
             else
             {
                cResult = (int) (Math.random() * 6);
                if(cResult > 1 && cResult < 4 )
                {
                    computerPlay = "Rock";
                }
                else if(cResult >= 4)
                {
                    computerPlay = "Paper";
                }
                else
                {
                    computerPlay = "Scissors";
                }
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
                if(cResult > 1 && cResult < 4)
                {
                    computerPlay = "Scissors";
                }
                else if(cResult >= 4)
                {
                    computerPlay = "Rock";
                }
                else
                {
                computerPlay = "Paper";
                }
              }
        }
        if(humanPlay == "Paper")
        {
            if(cResult > 2)
            {
                computerPlay = "Scissors";
            }
            else
            {
                cResult = (int) (Math.random() * 6);
                if(cResult > 2 && cResult < 4)
                {
                    computerPlay = "Paper";
                }
                else if(cResult >= 4)
                {
                    computerPlay = "Scissors";
                }   
                else
                {
                    computerPlay = "Rock";
                }
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
            ties += 1;
            return "It's a tie!";
        }
        //when human play is rock
        if(humanPlay == "Rock")
        {
            if(computerPlay != "Paper" && computerPlay != "Rock")
            {
                humanWins += 1;
                return "You win!";
            }
        }
        else if (humanPlay == "Paper")
        {
            if(computerPlay != "Scissors" && computerPlay != "Paper")
            {
                humanWins += 1;
                return "You win!";
            }
        }
        else if(humanPlay == "Scissors")
        {
            if(computerPlay != "Rock" && computerPlay != "Scissors")
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
