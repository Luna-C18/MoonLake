/*
 * Copyright (C) 2016 The MoonLake Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */


package com.minecraft.moonlake.api.packet.listener;

import com.minecraft.moonlake.api.packet.listener.Cancellable;
import com.minecraft.moonlake.api.packet.listener.channel.PacketChannelWrapped;
import com.minecraft.moonlake.api.packet.listener.handler.PacketHandlerAbstract;
import com.minecraft.moonlake.api.packet.listener.handler.PacketSent;
import org.bukkit.entity.Player;

abstract class PacketHandlerAbstractExpression implements PacketHandlerAbstract {

    private Player player;
    private Object packet;
    private Cancellable cancellable;
    private PacketChannelWrapped channelWrapped;
    private Class<?> packetClass;

    public PacketHandlerAbstractExpression(Object packet, Cancellable cancellable, Player player) {

        this.packet = packet;
        this.cancellable = cancellable;
        this.player = player;
        this.packetClass = packet.getClass();
    }

    public PacketHandlerAbstractExpression(Object packet, Cancellable cancellable, PacketChannelWrapped channelWrapped) {

        this.packet = packet;
        this.cancellable = cancellable;
        this.channelWrapped = channelWrapped;
        this.packetClass = packet.getClass();
    }

    @Override
    public void setCancelled(boolean cancel) {

        cancellable.setCancelled(cancel);
    }

    @Override
    public boolean isCancelled() {

        return cancellable.isCancelled();
    }

    @Override
    public Player getPlayer() {

        return player;
    }

    @Override
    public boolean hasPlayer() {

        return player != null;
    }

    @Override
    public PacketChannelWrapped<?> getChannel() {

        return channelWrapped;
    }

    @Override
    public boolean hasChannel() {

        return channelWrapped != null;
    }

    @Override
    public String getPlayerName() {

        return hasPlayer() ? player.getName() : null;
    }

    @Override
    public void setPacket(Object packet) {

        this.packet = packet;
    }

    @Override
    public Object getPacket() {

        return packet;
    }

    @Override
    public String getPacketName() {

        return packetClass.getSimpleName();
    }

    @Override
    public String toString() {

        return "Packet{ " + (getClass().equals(PacketSent.class) ? "[> OUT >]" : "[< IN <]") + " " + getPacketName() + " " + (hasChannel() ? getChannel().channel() : hasPlayer() ? getPlayerName() : "#server#") + " }";
    }
}
