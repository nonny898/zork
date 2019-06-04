package io.muzoo.ooc.map;

import io.muzoo.ooc.monster.MonsterFactory;
import io.muzoo.ooc.weapon.WeaponFactory;

public class LevelC extends  Map{

        public LevelC() {
                Room[][] rooms = new Room[][]{
                        {new Room(null, WeaponFactory.getWeapon()), new Room(null, null)},
                        {new Room(MonsterFactory.getMonster(), null), new Room(null, null)}
                };
                setRooms(rooms);
                setOutX(0);
                setOutY(1);
        }
}
