package com.thynanami.plugin.everydayluck

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import java.text.SimpleDateFormat
import java.time.Instant
import java.util.*
import kotlin.random.Random


class Luck {

    fun getLuck(player: Player): Int {
        val uuid = player.uniqueId
        val formatter = SimpleDateFormat("yyyyMMdd")
        val date = formatter.format(Date.from(Instant.now()))
        val seed = uuid.hashCode() + date.toInt()

        return Random(seed).nextInt()
    }
}

class CommandLuck : CommandExecutor {

    private fun Int.short(): Int {
        return this % 101
    }

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        return if (sender is Player) {
            sender.sendMessage("${sender.name} 今天的幸运值是 ${Luck().getLuck(sender).short()}！")
            true
        } else {
            sender.sendMessage("只有玩家可以执行这个命令！")
            true
        }
    }
}
