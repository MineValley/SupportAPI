package minevalley.support.api.ticket;

import minevalley.core.api.users.User;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public interface Ticket {

    @Nonnull
    @Contract(pure = true)
    User getUser();
}
