package io.muzoo.ooc.command;

import io.muzoo.ooc.game.Game;
import io.muzoo.ooc.weapon.Weapon;

public class Take implements  Command{
        public void run(String[] commands, Game game) {
                Weapon weapon = game.getLevel().getMap().getCurrentRoom().getWeapon();
                if (weapon != null) {
                        String weaponName = weapon.getName().toLowerCase();
                        if (weaponName.equals(commands[1].toLowerCase())) {
                                game.getPlayer().takeWeapon(weapon);
                                game.getLevel().getMap().getCurrentRoom().setWeaponTaken();
                        } else {
                                System.out.println("What are you trying to pick up?");
                        }
                } else {
                        System.out.println("There's no weapon in this room.");
                }
        }
}
