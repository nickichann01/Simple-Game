package rock_raper_scissor;

import javax.swing.JLabel;

public class Checker {

    int scorep = 0, scorec = 0;

    public void check(String player, String computer, JLabel comp, JLabel play){
    // Rock == Scissor (Winner Rock)
    // Rock == Paper (Winner Paper)
    // Scissor == Paper (Scissor)

    if(player.equals("Rock") && computer.equals("Scissor")){
        scorep++;
    } else if(computer.equals("Rock") && player.equals("Scissor")){
        scorec++;
    } else if(player.equals("Rock") && computer.equals("Paper")){
        scorec++;
    } else if(player.equals("Paper") && computer.equals("Rock")){
        scorep++;
    } else if(player.equals("Scissor") && computer.equals("Paper")){
        scorep++;
    } else if(player.equals("Paper") && computer.equals("Scissor")){
        scorec++;
    } else {
        scorep += 0;
        scorec += 0;
    }

        comp.setText(Integer.toString(scorec));
        play.setText(Integer.toString(scorep));
    }

    //PLayer's score
    public int getPlayerScore(){
        return scorep;
    }

    //Computer Score
    public int getComputerScore(){
        return scorec;
    }
}