package io.muzoo.ooc.command;

import io.muzoo.ooc.game.Game;
import io.muzoo.ooc.weapon.Weapon;

public class Take implements  Command{
        public void run(String[] commands, Game game) {
                Weapon weapon = game.getLevel().getMap().getCurrentRoom().getWeapon();
                String weaponName = weapon.getName();
                if (weaponName.equals(commands[1])) {
                        game.getPlayer().takeWeapon(weapon);
                        game.getLevel().getMap().getCurrentRoom().setWeaponTaken();
                } else {
                        System.out.println("\nWhat are you trying to pick up?\n");
                }
        }
}
