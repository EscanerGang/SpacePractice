package rip.crystal.practice.essentials.command.staff;

import rip.crystal.practice.utilities.LocationUtil;
import rip.crystal.api.command.BaseCommand;
import rip.crystal.api.command.Command;
import rip.crystal.api.command.CommandArgs;
import org.bukkit.entity.Player;

public class LocationCommand extends BaseCommand {

	@Command(name = "location", aliases = {"loc"}, permission = "hysteria.command.loc")
	@Override
	public void onCommand(CommandArgs commandArgs) {
		Player player = commandArgs.getPlayer();

		player.sendMessage(LocationUtil.serialize(player.getLocation()));
	}
}