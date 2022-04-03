package rock_raper_scissor;

//This class is to show the picture inside the JLabel
public class ChoiceSelection {
    
    String icnrock = "/Images/RockL.png";
    String icnpaper = "/Images/PaperL.png" ;
    String icnscissors = "/Images/ScissorL.png";
    
    String[] list = {icnrock, icnpaper, icnscissors};
    
    public String randomChoice(int randIndex){
        return list[randIndex];
    }
    
}
