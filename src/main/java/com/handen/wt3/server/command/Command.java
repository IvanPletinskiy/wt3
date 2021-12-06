package com.handen.wt3.server.command;

import com.handen.wt3.server.command.exception.CommandException;

public interface Command {
    String complete(Object caller, String request) throws CommandException;
}
