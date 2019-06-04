package io.muzoo.ooc.command;

import io.muzoo.ooc.game.Game;
import io.muzoo.ooc.game.Player;
import io.muzoo.ooc.monster.Monster;
import io.muzoo.ooc.weapon.Weapon;

public class Info implements  Command{
        public void run(String[] commands, Game game) {
                Player player = game.getPlayer();
                Monster monster = game.getLevel().getMap().getCurrentRoom().getMonster();
                Weapon weapon = game.getLevel().getMap().getCurrentRoom().getWeapon();
                System.out.printf("Player Information: \n" +
                        "Current HP = %d\n" +
                        "Max HP     = %d\n" +
                        "Attack     = %d\n" +
                        "Position   = (%d,%d)\n",
                        player.getHP(),player.getFULL_HP(),player.getATK(),
                        game.getLevel().getMap().getCurrentX(),game.getLevel().getMap().getCurrentY());

                if (monster == null) {
                        System.out.println("No monster here.");
                } else {
                        System.out.printf("There's a %s here.\n" +
                                        "Monster current HP: %d\n" +
                                        "Monster max HP: %d\n" +
                                        "Monster attack power: %d\n",
                                monster.getName(),
                                monster.getHP(),
                                monster.getFULL_HP(),
                                monster.getATK());
                }

                if (weapon == null) {
                        System.out.println("No weapon here.");
                } else {
                        System.out.printf("Weapon name : %s\n" +
                                        "Weapon attack power: %d\n",
                                weapon.getName(),
                                weapon.getPower());
                }
        }
}
