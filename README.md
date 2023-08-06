# Everyday Luck
The Everyday Luck plugin rewritten in Kotlin

## Why I wrote this plugin

The original version of this plugin is https://github.com/TeamVastsea/EverydayLuck and the code is terrible.

So I rewrote this plugin in Kotlin and optimized the code.

## Commands

The only one command is

```
/luck
```

It will print a message showing sender's luck value(0 - 100) if the sender is a player.

## Compatibility

If you don't modify anything, the build will work with Minecraft 1.20.1

But it should be compatible with all versions because the api used is very common, you need to modify the gradle configuration file to compile other versions of the plugin.
