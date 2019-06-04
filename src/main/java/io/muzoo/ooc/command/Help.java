package io.muzoo.ooc.command;

import io.muzoo.ooc.game.Game;

public class Help implements  Command {
        public void run(String[] commands, Game game) {
                System.out.print("Please use one of the following commands: \n" +
                        "attack with (weapon) – attack a monster in the current room\n" +
                        "drop (weapon) – drop item of choice that the player currently carries\n" +
                        "info – print out information of the player and the room that the player is currently\n" +
                        "take (weapon) – take command is used to pick up the item in the current room\n" +
                        "walk (direction) – walk to the next room\n" +
                        "exit – exit game\n");
        }
}
