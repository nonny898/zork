package io.muzoo.ooc.game;

import io.muzoo.ooc.command.Command;
import io.muzoo.ooc.command.CommandFactory;

import java.util.Scanner;

public class Game {

        private boolean exit =false;
        private Player player = new Player();


        public void setLose(boolean lose) {
                System.out.println("You lost.");
                this.exit = lose;
        }

        public void setWon(boolean won) {
                System.out.println("You won.");
                this.exit = won;
        }

        public Player getPlayer() {
                return player;
        }

        public void begin() {
                System.out.println("Welcome and good luck.");
                Scanner scanner = new Scanner(System.in);
                while (!exit) {
                        System.out.print("> ");
                        String input = scanner.nextLine();
                        String[] commands = input.split(" ");
                        Command command = CommandFactory.getCommand(commands[0]);
                        if (command == null) {
                                System.out.println("Unknown Input.");
                                CommandFactory.getCommand("help").run(commands,this);
                        }
                        else {
                                command.run(commands,this);
                        }
                }
        }
}