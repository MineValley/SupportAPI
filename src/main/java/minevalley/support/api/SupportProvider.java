package minevalley.support.api;

import minevalley.core.api.users.User;
import minevalley.support.api.ticket.Ticket;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

@ApiStatus.Internal
public interface SupportProvider {

    @Nonnull
    @Contract("_ -> new")
    Ticket createTicket(@Nonnull User user) throws IllegalArgumentException;
}