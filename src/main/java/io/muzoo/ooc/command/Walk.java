package io.muzoo.ooc.command;

import io.muzoo.ooc.game.Game;
import io.muzoo.ooc.map.Map;

public class Walk implements  Command {
        public void run(String[] commands, Game game) {
                Map map = game.getLevel().getMap();

                if (commands[1].equals("right") && map.goRight(game)) {
                        if ((map.getCurrentX() + 1) == map.getMaxX()) {
                                System.out.println("There's a wall on your right.");
                        } else {
                                map.setCurrentX(map.getCurrentX() + 1);
                                System.out.println("You are in the next room.");
                        }
                } else if (commands[1].equals("left") && map.goLeft(game)) {
                        if ((map.getCurrentX() - 1) < 0) {
                                System.out.println("There's a wall on your left.");
                        } else {
                                map.setCurrentX(map.getCurrentX() - 1);
                                System.out.println("You are in the next room.");
                        }
                } else if (commands[1].equals("forward") && map.goUp(game)) {
                        if ((map.getCurrentY() + 1) == map.getMaxY()) {
                                System.out.println("There's a wall on your front.");
                        } else {
                                map.setCurrentY(map.getCurrentY() + 1);
                                System.out.println("You are in the next room.");
                        }
                } else if (commands[1].equals("backward") && map.goDown(game)) {
                        if ((map.getCurrentY() - 1) < 0) {
                                System.out.println("There's a wall on your back.");
                        } else {
                                map.setCurrentY(map.getCurrentY() - 1);
                                System.out.println("You are in the next room.");
                        }
                } else {
                        System.out.println("You are in the same room.");
                }
        }
}
