# ThiccPackets
A port of XLPackets to newer versions of the game (forge only)

---
**This mod may make your server more vulnerable to attacks dependent on large packets - I have not tested**

ThiccPackets changes the default limits on packet sizes to 2GB. By default, these limits are:
- 2097152 bytes for compressed packets and NBT decoding
- 1048576 bytes for S2C (clientbound) custom payloads
- 32767 bytes for C2S (serverbound) custom payloads

It is optional on both client and server, but you may still encounter issues if the mod is only present on one side (most of the changes apply to the client, so having it server-side only will not fix much)
