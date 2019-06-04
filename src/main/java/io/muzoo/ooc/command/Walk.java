package io.muzoo.ooc.command;

import io.muzoo.ooc.game.Game;
import io.muzoo.ooc.map.Map;

public class Walk implements  Command {
        public void run(String[] commands, Game game) {
                Map map = game.getLevel().getMap();

                if (commands[0].equals("right") && map.goRight(game)) {
                        if ((map.getCurrentX() + 1) == map.getMaxX()) {
                                System.out.println("\nThere's a wall on your right.\n");
                        } else {
                                map.setCurrentX(map.getCurrentX() + 1);
                                System.out.println("\nYou are in the next room.\n");
                        }
                } else if (commands[0].equals("left") && map.goLeft(game)) {
                        if ((map.getCurrentX() - 1) < 0) {
                                System.out.println("\nThere's a wall on your left.\n");
                        } else {
                                map.setCurrentX(map.getCurrentX() - 1);
                                System.out.println("\nYou are in the next room.\n");
                        }
                } else if (commands[0].equals("forward") && map.goUp(game)) {
                        if ((map.getCurrentY() + 1) == map.getMaxY()) {
                                System.out.println("\nThere's a wall on your front.\n");
                        } else {
                                map.setCurrentY(map.getCurrentY() + 1);
                                System.out.println("\nYou are in the next room.\n");
                        }
                } else if (commands[0].equals("backward") && map.goDown(game)) {
                        if ((map.getCurrentY() - 1) == 0) {
                                System.out.println("\nThere's a wall on your back.\n");
                        } else {
                                map.setCurrentY(map.getCurrentY() - 1);
                                System.out.println("\nYou are in the next room.\n");
                        }
                } else {
                        System.out.println("\nYou are in the same room.\n");
                }
        }
}
