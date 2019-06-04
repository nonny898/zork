package io.muzoo.ooc.map;

import io.muzoo.ooc.monster.Monster;
import io.muzoo.ooc.weapon.Weapon;

public class Room {

        private Monster monster;
        private Weapon weapon;

        public Room(Monster monster, Weapon weapon){
                this.monster = monster;
                this.weapon = weapon;
        }

        public Monster getMonster() {
                return monster;
        }

        public Weapon getWeapon() {
                return weapon;
        }

        public void setMonsterDead() {
                this.monster = null;
        }

        public boolean isMonsterDead() {
                return this.monster == null;
        }

        public void setWeaponTaken() {
                this.weapon = null;
        }

        public void weaponDrop(Weapon weapon) {
                this.weapon = weapon;
        }
}
