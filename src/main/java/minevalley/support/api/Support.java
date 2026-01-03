package minevalley.support.api;

import minevalley.support.api.ticket.Ticket;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public final class Support {

    private static SupportProvider provider;

    @Nonnull
    @Contract("-> new")
    public static Ticket createTicket() {
        return provider.createTicket();
    }
}