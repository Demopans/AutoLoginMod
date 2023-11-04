package net.demopans.core;

import net.demopans.ExampleExpectPlatform;

public class DiskIO {
    public final static String config = ExampleExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString() + "/autoLogin";
    public final static String servers = config + "servers.jsonnet";
}
