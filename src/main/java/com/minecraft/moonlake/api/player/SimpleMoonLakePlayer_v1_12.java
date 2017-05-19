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


package com.minecraft.moonlake.api.player;

import com.minecraft.moonlake.exception.PlayerNotOnlineException;
import org.bukkit.Material;
import org.bukkit.entity.Player;

/**
 * <h1>SimpleMoonLakePlayer</h1>
 * 月色之湖玩家接口单包装类 - Bukkit 1.12
 *
 * @version 1.0
 * @author Month_Light
 */
public class SimpleMoonLakePlayer_v1_12 extends SimpleMoonLakePlayer_v1_11 {

    /**
     * 月色之湖玩家接口单包装类 - Bukkit 1.12 构造函数
     *
     * @param name 玩家名
     * @throws IllegalArgumentException 如果玩家名对象为 {@code null} 则抛出异常
     * @throws PlayerNotOnlineException 如果玩家没有在线则抛出异常
     */
    public SimpleMoonLakePlayer_v1_12(String name) throws IllegalArgumentException, PlayerNotOnlineException {

        super(name);
    }

    /**
     * 月色之湖玩家接口单包装类 - Bukkit 1.12 构造函数
     *
     * @param player 玩家对象
     * @throws IllegalArgumentException 如果玩家名对象为 {@code null} 则抛出异常
     * @throws PlayerNotOnlineException 如果玩家没有在线则抛出异常
     */
    public SimpleMoonLakePlayer_v1_12(Player player) throws IllegalArgumentException, PlayerNotOnlineException {

        super(player);
    }

    //
    // 其实这两个函数从 1.11.2 版本都添加上了
    // 但是我的 v1_11 月色之湖玩家实现类并不想重写
    // 因为可能会有 1.11 的服务端进行使用本插件
    // 所以就只在 v1_12 版本及以后的版本存在

    @Override
    public void setItemCooldown(Material type, int tick) {
        getBukkitPlayer().setCooldown(type, tick);
    }

    @Override
    public boolean hasItemCooldown(Material type) {
        return getBukkitPlayer().hasCooldown(type);
    }
    ///
}