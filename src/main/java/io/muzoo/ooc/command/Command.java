package io.muzoo.ooc.command;

import io.muzoo.ooc.game.Game;

public interface Command {
        public void run(String[] commands, Game game);
}
