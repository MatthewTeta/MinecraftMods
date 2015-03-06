package com.matthewteta.newblocks.proxy;

import com.matthewteta.newblocks.init.NewBlockItems;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenders() {
		NewBlockItems.registerRenders();
	}
}
