package io.muzoo.ooc.command;

import java.util.HashMap;

public class CommandFactory {
        private static final HashMap<String, Command> commands = new HashMap<String, Command>() {{
                put("attack", new Attack());
                put("drop", new Drop());
                put("exit", new Exit());
                put("help", new Help());
                put("info", new Info());
                put("take", new Take());
                put("walk", new Walk());
                put("use", new Use());
        }};

        public static Command getCommand(String commandName) {
                return commands.get(commandName);
        }
}
