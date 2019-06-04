package io.muzoo.ooc.command;

import io.muzoo.ooc.game.Game;
import io.muzoo.ooc.game.Player;

public class Drop implements  Command{
        public void run(String[] commands, Game game) {
                Player player = game.getPlayer();
                player.dropWeapon(commands[1], game);
        }
}
