package io.muzoo.ooc.command;

import io.muzoo.ooc.Game.Game;

public class Help implements  Command {
        public void run(String[] commands, Game game) {
                System.out.print("Please use one of the following commands: \n" +
                        "attack + (weapon) – attack a monster in the current room\n" +
                        "drop – drop item of choice that the player currently carries\n" +
                        "info – print out information of the player and the room that the player is currently\n" +
                        "take – take command is used to pick up the item in the current room\n" +
                        "walk – walk to the next room\n" +
                        "exit – exit game\n");
        }
}
