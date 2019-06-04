package io.muzoo.ooc.command;

import io.muzoo.ooc.game.Game;
import io.muzoo.ooc.game.Player;
import io.muzoo.ooc.map.Level;
import io.muzoo.ooc.map.Map;
import io.muzoo.ooc.monster.Monster;

public class Attack implements  Command {
        public void run(String[] commands, Game game) throws InstantiationException, IllegalAccessException {
                Monster monster = game.getLevel().getMap().getCurrentRoom().getMonster();
                Player player = game.getPlayer();
                Map map = game.getLevel().getMap();
                Level level = game.getLevel();

                monster.setHP(monster.getHP() - player.getCurrentWeapon().getPower());
                player.setHP(player.getHP() - monster.getATK());
                if (monster.getHP() <= 0) {
                        player.setHP(monster.getFULL_HP() + player.getFULL_HP());
                        player.setFULL_HP(monster.getFULL_HP() + player.getFULL_HP());
                        game.getLevel().getMap().getCurrentRoom().setMonsterDead();
                        if (map.checkIfMapClear()) {
                                level.goToNextLevel(game);
                                System.out.println("\nYou are on the next level.");
                        }
                }
                if (player.getHP() <= 0) {
                        game.setLose(true);
                }
        }
}
