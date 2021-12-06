package com.handen.wt3.server.command.impl;

import com.handen.wt3.server.command.Command;
import com.handen.wt3.server.command.exception.CommandException;
import com.handen.wt3.server.service.ServiceFactory;
import com.handen.wt3.server.model.AuthType;

public class CreateCommand implements Command {
    public String complete(Object caller, String request) throws CommandException {
        String[] arguments = request.split(" ");
        if (arguments.length != 3) throw new CommandException("CREATE invalid syntax");

        if (ServiceFactory.getInstance().getAuthService().getAuthType(caller) != AuthType.MANAGER)
            return "Should be MANAGER";

        ServiceFactory.getInstance().getCaseService().addCase(arguments[1], arguments[2]);
        return "Success";
    }
}
