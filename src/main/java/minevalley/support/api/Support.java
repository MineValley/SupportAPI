package minevalley.support.api;

import minevalley.core.api.users.User;
import minevalley.support.api.ticket.Ticket;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public final class Support {

    private static SupportProvider provider;

    /**
     * Creates a new support ticket for the given user.
     *
     * @param user The user creating the ticket.
     * @return The created support ticket.
     * @throws IllegalArgumentException If the user is null.
     */
    @Nonnull
    @Contract("_ -> new")
    public static Ticket createTicket(@Nonnull User user) throws IllegalArgumentException {
        return provider.createTicket(user);
    }
}