package net.runelite.rs.api;

import net.runelite.api.packets.IsaacCipher;
import net.runelite.api.packets.PacketBuffer;
import net.runelite.mapping.Import;

public interface RSPacketBuffer extends RSBuffer, PacketBuffer
{
	@Import("isaacCipher")
	@Override
	RSIsaacCipher getIsaacCipher();

	@Import("setIsaacCipher")
	@Override
	void setIsaacCipher(IsaacCipher isaacCipher);

	@Import("newIsaacCipher")
	void newIsaacCipher(int[] var1);

	@Import("readSmartByteShortIsaac")
	int readSmartByteShortIsaac();

	@Import("bitsRemaining")
	int bitsRemaining(int var1);

	@Import("exportIndex")
	void exportIndex();

	@Import("readBits")
	int readBits(int var1);

	@Import("importIndex")
	void importIndex();
}
