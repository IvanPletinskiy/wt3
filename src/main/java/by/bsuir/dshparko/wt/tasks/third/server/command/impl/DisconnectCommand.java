package by.bsuir.dshparko.wt.tasks.third.server.command.impl;

import by.bsuir.dshparko.wt.tasks.third.server.command.Command;
import by.bsuir.dshparko.wt.tasks.third.server.command.exception.CommandException;
import by.bsuir.dshparko.wt.tasks.third.server.model.AuthType;
import by.bsuir.dshparko.wt.tasks.third.server.service.ServiceFactory;

public class DisconnectCommand implements Command {
    public String complete(Object caller, String request) throws CommandException {
        ServiceFactory.getInstance().getAuthService().setAuthType(caller, AuthType.UNAUTH);
        return "Bye bye!";
    }
}
