package by.bsuir.dshparko.wt.tasks.third.server.command;

import by.bsuir.dshparko.wt.tasks.third.server.command.exception.CommandException;

public interface Command {
    String complete(Object caller, String request) throws CommandException;
}
