package com.idreesinc.celeste.listener;

import com.idreesinc.celeste.Celeste;
import dev.lone.itemsadder.api.Events.ItemsAdderLoadDataEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ItemsAdderDataLoad implements Listener {

    private final Celeste celeste;

    public ItemsAdderDataLoad(Celeste celeste) {
        this.celeste = celeste;
    }

    @EventHandler
    public void onItemsAdderData(ItemsAdderLoadDataEvent event) {
        celeste.setItemsAdderLoaded();
        celeste.reload();
    }
}
