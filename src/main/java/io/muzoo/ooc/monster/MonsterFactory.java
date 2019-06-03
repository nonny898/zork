package io.muzoo.ooc.monster;

import java.util.Stack;

public class MonsterFactory {

        private static final Stack<Monster> monsters = new Stack<Monster>() {
                {
                        add(new ShadowDemon());
                        add(new Spectre());
                        add(new Underlord());
                }
        };

        public static Monster getMonster() {
                return monsters.pop();
        }
}
