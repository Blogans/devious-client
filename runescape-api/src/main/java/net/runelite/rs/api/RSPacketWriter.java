package net.runelite.rs.api;

import net.runelite.api.packets.AbstractSocket;
import net.runelite.api.packets.IsaacCipher;
import net.runelite.api.packets.PacketWriter;
import net.runelite.mapping.Import;

public interface RSPacketWriter extends PacketWriter
{
	@Import("addNode")
	void sendPacket(RSPacketBufferNode packet);

	@Import("packetBufferNodes")
	RSIterableNodeDeque getQueuedPackets();

	@Import("isaacCipher")
	@Override
	RSIsaacCipher getIsaacCipher();

	@Import("serverPacket")
	RSServerPacket getServerPacket();

	@Import("serverPacket")
	void setServerPacket(RSServerPacket serverPacket);

	@Import("serverPacketLength")
	int getServerPacketLength();

	@Import("serverPacketLength")
	void setServerPacketLength(int length);

	@Import("socket")
	RSAbstractSocket getSocket();

	@Import("setSocket")
	void setSocket(AbstractSocket var1);

	@Import("packetBuffer")
	RSPacketBuffer getPacketBuffer();

	@Import("buffer")
	RSBuffer getBuffer();

	@Import("bufferSize")
	int getBufferSize();

	@Import("bufferSize")
	void setBufferSize(int size);

	@Import("field1457")
	int getRemainingWrites();

	@Import("field1457")
	void setRemainingWrites(int writes);

	@Import("pendingWrites")
	int getPendingWrites();

	@Import("pendingWrites")
	void setPendingWrites(int writes);

	@Import("flush")
	void flush();

	@Import("getSocket")
	RSAbstractSocket getAbstractSocket();
}
