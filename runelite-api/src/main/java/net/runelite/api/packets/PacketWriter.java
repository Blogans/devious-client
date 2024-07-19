package net.runelite.api.packets;

import java.net.Socket;

public interface PacketWriter
{
	void queuePacket(PacketBufferNode packet);

	IsaacCipher getIsaacCipher();

	void setIsaacCipher(IsaacCipher isaacCipher);

	ServerPacket getServerPacket();

	PacketBuffer getPacketBuffer();

	int getPendingWrites();

	int getRemainingWrites();

	void setRemainingWrites(int writes);

	void setPendingWrites(int writes);

	void flush();

	AbstractSocket getSocket();

	void setSocket(AbstractSocket var1);
}
