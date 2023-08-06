package com.thynanami.plugin.everydayluck

import org.bukkit.plugin.java.JavaPlugin

class PluginMain : JavaPlugin() {
    override fun onEnable() {
        logger.info("Everyday luck enabled.")
        this.getCommand("luck")?.setExecutor(CommandLuck())
    }

    override fun onDisable() {
        logger.info("Everyday luck disabled.")
    }
}