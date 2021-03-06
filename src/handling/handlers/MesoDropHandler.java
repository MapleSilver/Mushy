package handling.handlers;

import client.MapleClient;
import handling.PacketHandler;
import handling.RecvPacketOpcode;
import handling.channel.handler.PlayerHandler;
import tools.data.LittleEndianAccessor;

public class MesoDropHandler {

	@PacketHandler(opcode = RecvPacketOpcode.MESO_DROP)
	public static void handle(MapleClient c, LittleEndianAccessor slea) {
		slea.skip(4); // update tick
        PlayerHandler.DropMeso(slea.readInt(), c.getPlayer());
	}
}
