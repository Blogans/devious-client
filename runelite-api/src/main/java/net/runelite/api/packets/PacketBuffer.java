package net.runelite.api.packets;

import net.runelite.api.Buffer;

public interface PacketBuffer extends Buffer
{
	void setAutomated(boolean modified);

	IsaacCipher getIsaacCipher();

	void setIsaacCipher(IsaacCipher isaacCipher);

	void newIsaacCipher(int[] var1);

	boolean isAutomated();

	void consume();

	boolean isConsumed();
}
