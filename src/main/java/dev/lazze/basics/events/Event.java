package dev.lazze.basics.events;

import dev.lazze.basics.Main;

public class Event
{
    private Main plugin;
    
    public Event(Main plugin) {
        this.plugin = plugin;
    }
    
    public static void clear() {
    }
}
