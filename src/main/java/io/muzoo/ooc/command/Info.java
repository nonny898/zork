package io.muzoo.ooc.command;

import io.muzoo.ooc.Game.Game;
import io.muzoo.ooc.Game.Player;

public class Info implements  Command{
        public void run(String[] commands, Game game) {
                Player player = game.getPlayer();
                System.out.printf("Player Information: \n" +
                        "Current HP = %d\n" +
                        "Max HP     = %d\n" +
                        "Attack     = %d\n",
                        player.getHP(),player.getFULL_HP(),player.getATK());
        }
}
