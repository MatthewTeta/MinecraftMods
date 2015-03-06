package com.mathewteta.magic.proxy;

import com.mathewteta.magic.init.MagicItems;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenders() {
		MagicItems.registerRenders();
	}
}
