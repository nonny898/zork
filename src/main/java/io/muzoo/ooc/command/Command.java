package io.muzoo.ooc.command;

import io.muzoo.ooc.game.Game;

public interface Command {
        void run(String[] commands, Game game) throws InstantiationException, IllegalAccessException;
}
