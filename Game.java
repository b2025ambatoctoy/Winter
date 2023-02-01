import javax.swing.*;  
import java.util.Scanner; 

public class Game {
    String choice;
    int health, energy;

    public void new_game(){
        JFrame f = new JFrame();

        System.out.println("WINTER");

        JButton play = new JButton("PLAY"); //play button
        play.setBounds(130, 100, 100, 40);
        JButton help = new JButton("HELP");
        help.setBounds(110, 80, 100, 40);
        JButton credits = new JButton("CREDITS");
        credits.setBounds(150, 80, 100, 40);

        f.add(play);
        f.add(help);
        f.add(credits);

        f.setSize(500,500);
        f.setVisible(true);

    }

    public void game_controls(ActionEvent e){ //This doesnt work, but the idea is there huhu 
        if(e.getSource() == play){
            //START GAME
        }else if(e.getSource() == help){
            //Show instructions
        }else if(e.getSource() == credits){
            //show credits
        }

    }

}*