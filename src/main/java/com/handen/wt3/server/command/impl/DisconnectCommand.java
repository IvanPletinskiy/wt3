package com.handen.wt3.server.command.impl;

import com.handen.wt3.server.command.Command;
import com.handen.wt3.server.command.exception.CommandException;
import com.handen.wt3.server.service.ServiceFactory;
import com.handen.wt3.server.model.AuthType;

public class DisconnectCommand implements Command {
    public String complete(Object caller, String request) throws CommandException {
        ServiceFactory.getInstance().getAuthService().setAuthType(caller, AuthType.UNAUTH);
        return "Bye bye!";
    }
}
