package io.muzoo.ooc.command;

import io.muzoo.ooc.game.Game;

public class Exit implements  Command{
        public void run(String[] commands, Game game) {
                System.out.println("Bye.");
                System.exit(0);
        }
}
