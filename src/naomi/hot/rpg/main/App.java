package naomi.hot.rpg.main;

import jdk.nashorn.internal.scripts.JO;
import naomi.hot.rpg.entities.Player;

import javax.swing.*;

public class App {

    private static final String GAME_NAME = "Game.exe";

    private static final Object INN[] = {"Attack", "Stats", "inventory", "shop"};

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog(null, "Choose your name",
                GAME_NAME, JOptionPane.QUESTION_MESSAGE);

        Player player = new Player(name, 1);

        JOptionPane.showMessageDialog(null, "Welcome " + player.getName() + "!",
               GAME_NAME,  JOptionPane.INFORMATION_MESSAGE);

    }

    public static void game()
    {
        JOptionPane.showMessageDialog(null, "Hello mother fucker what u wanna do today?",
                "INN", JOptionPane.PLAIN_MESSAGE
                );
    }

}
