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

import com.minecraft.moonlake.MoonLakeAPI;
import com.minecraft.moonlake.economy.EconomyPlugin;
import com.minecraft.moonlake.economy.api.MoonLakeEconomy;
import com.minecraft.moonlake.exception.CannotDependException;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

/**
 * <h1>DependEconomyPlayer</h1>
 * 依赖经济插件玩家实现类 # 依赖 <a href="https://www.github.com/u2g/MoonLakeEconomy" target="_blank">MoonLakeEconomy</a> 插件
 *
 * @version 1.0
 * @author Month_Light
 */
class DependEconomyPlayer {

    private EconomyPlugin economyPlugin;
    private MoonLakeEconomy moonLakeEconomy;

    /**
     * 依赖经济插件玩家实现类构造函数
     */
    public DependEconomyPlayer() {

        Plugin plugin = Bukkit.getServer().getPluginManager().getPlugin("MoonLakeEconomy");

        if(plugin == null) {

            throw new CannotDependException("The cannot depend 'MoonLakeEconomy' plugin exception.");
        }
        this.economyPlugin = (EconomyPlugin) plugin;
        this.moonLakeEconomy = this.economyPlugin.getEconomy();

        MoonLakeAPI.getMLogger().info("Success hook 'MoonLakeEconomy' plugin, 'EconomyPlayer' interface be use.");
    }

    /**
     * 获取指定玩家的金币数据
     *
     * @param name 玩家名
     * @return 金币
     * @throws IllegalArgumentException 如果玩家名对象为 {@code null} 则抛出异常
     */
    public double getMoney(String name) {

        return moonLakeEconomy.getMoney(name);
    }

    /**
     * 获取指定玩家的点券数据
     *
     * @param name 玩家名
     * @return 点券
     * @throws IllegalArgumentException 如果玩家名对象为 {@code null} 则抛出异常
     */
    public int getPoint(String name) {

        return moonLakeEconomy.getPoint(name);
    }

    /**
     * 设置指定玩家的金币数据
     *
     * @param name 玩家名
     * @param money 金币
     * @return 是否成功
     * @throws IllegalArgumentException 如果玩家名对象为 {@code null} 则抛出异常
     */
    public boolean setMoney(String name, double money) {

        return moonLakeEconomy.setMoney(name, money);
    }

    /**
     * 设置指定玩家的点券数据
     *
     * @param name 玩家名
     * @param point 点券
     * @return 是否成功
     * @throws IllegalArgumentException 如果玩家名对象为 {@code null} 则抛出异常
     */
    public boolean setPoint(String name, int point) {

        return moonLakeEconomy.setPoint(name, point);
    }

    /**
     * 给予指定玩家金币数据
     *
     * @param name 玩家名
     * @param money 金币
     * @return 是否成功
     * @throws IllegalArgumentException 如果玩家名对象为 {@code null} 则抛出异常
     */
    public boolean giveMoney(String name, double money) {

        return moonLakeEconomy.giveMoney(name, money);
    }

    /**
     * 给予指定玩家点券数据
     *
     * @param name 玩家名
     * @param point 点券
     * @return 是否成功
     * @throws IllegalArgumentException 如果玩家名对象为 {@code null} 则抛出异常
     */
    public boolean givePoint(String name, int point) {

        return moonLakeEconomy.givePoint(name, point);
    }

    /**
     * 减少指定玩家的金币数据
     *
     * @param name 玩家名
     * @param money 金币
     * @return 是否成功
     * @throws IllegalArgumentException 如果玩家名对象为 {@code null} 则抛出异常
     */
    public boolean takeMoney(String name, double money) {

        return moonLakeEconomy.takeMoney(name, money);
    }

    /**
     * 减少指定玩家的点券数据
     *
     * @param name 玩家名
     * @param point 点券
     * @return 是否成功
     * @throws IllegalArgumentException 如果玩家名对象为 {@code null} 则抛出异常
     */
    public boolean takePoint(String name, int point) {

        return moonLakeEconomy.takePoint(name, point);
    }
}
