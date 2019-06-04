package io.muzoo.ooc.command;

import io.muzoo.ooc.game.Game;
import io.muzoo.ooc.game.Player;
import io.muzoo.ooc.weapon.Weapon;

public class Use implements Command {
        public void run(String[] commands, Game game) throws InstantiationException, IllegalAccessException {
                Player player = game.getPlayer();
                Weapon weapon = player.getWeapon(commands[1]);

                if (weapon != null) {
                        player.setCurrentWeapon(weapon);
                }
        }
}
