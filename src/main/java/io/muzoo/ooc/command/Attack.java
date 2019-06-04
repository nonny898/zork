package io.muzoo.ooc.command;

import io.muzoo.ooc.game.Game;
import io.muzoo.ooc.game.Player;
import io.muzoo.ooc.map.Level;
import io.muzoo.ooc.map.Map;
import io.muzoo.ooc.monster.Monster;

public class Attack implements  Command{
        public void run(String[] commands, Game game) {
                Monster monster = game.getLevel().getMap().getCurrentRoom().getMonster();
                Player player = game.getPlayer();
                Map map = game.getLevel().getMap();
                Level level = game.getLevel();


        }
}
