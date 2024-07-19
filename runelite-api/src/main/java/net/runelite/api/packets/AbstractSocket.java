package net.runelite.api.packets;

import java.util.Map;

public interface AbstractSocket
{
	boolean isAvailable(int var1);

	int read(byte[] var1, int var2, int var3);

	void write(byte[] var1, int var2, int var3);
}
