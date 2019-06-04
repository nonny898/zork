package io.muzoo.ooc.map;

import io.muzoo.ooc.game.Game;

import java.util.HashMap;

public class Level {
        private int currentLevel = 1;
        private int maxLevel = 3;
        private Map currentMap = new LevelA();

        private final HashMap<Integer, Class<? extends Map>> levels = new HashMap<Integer, Class<? extends Map>>() {
                {
                        put(2, LevelB.class);
                        put(3, LevelC.class);
                }
        };

        public Map getMap() {
                return currentMap;
        }

        public void goToNextLevel(Game game) throws IllegalAccessException, InstantiationException {
                if (maxLevel == currentLevel) {
                        game.setWon(true);
                } else {
                        currentLevel++;
                        currentMap = levels.get(currentLevel).newInstance();
                }
        }
}
