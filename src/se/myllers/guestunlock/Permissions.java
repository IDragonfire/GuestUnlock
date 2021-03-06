package se.myllers.guestunlock;

import org.bukkit.entity.Player;

public class Permissions {

	/**
	 * Checks if a player is a Guest
	 * <p />
	 * Permission: guestunlock.guest
	 * 
	 * @param p - The player to check
	 * @return true, if the player is a guest. Else false
	 */
	public static final boolean isGuest(final Player p) {
		return p.hasPermission("guestunlock.guest");
	}

	/**
	 * Checks if a player is a Moderator
	 * <p />
	 * Permission: guestunlock.moderator
	 * 
	 * @param p - The player to check
	 * @return true, if the player is a moderator. Else false
	 */
	public static final boolean isModerator(final Player p) {
		return p.hasPermission("guestunlock.moderator");
	}

	/**
	 * Checks if a player is a Admin
	 * <p />
	 * Permission: guestunlock.admin
	 * 
	 * @param p - The player to check
	 * @return true, if the player is a admin. Else false
	 */
	public static final boolean isAdmin(final Player p) {
		return p.hasPermission("guestunlock.admin");
	}
}
