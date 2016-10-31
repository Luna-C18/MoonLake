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

import com.minecraft.moonlake.api.packet.listener.channel.PacketChannelWrapped;
import com.minecraft.moonlake.api.packet.listener.handler.PacketReceived;
import org.bukkit.entity.Player;

class PacketReceivedExpression extends PacketHandlerAbstractExpression implements PacketReceived {

    public PacketReceivedExpression(Object packet, Cancellable cancellable, Player player) {

        super(packet, cancellable, player);
    }

    public PacketReceivedExpression(Object packet, Cancellable cancellable, PacketChannelWrapped channelWrapped) {

        super(packet, cancellable, channelWrapped);
    }
}
