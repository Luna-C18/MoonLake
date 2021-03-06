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
 
 
package com.minecraft.moonlake.api;

/**
 * <h1>MoonLakeCore</h1>
 * 月色之湖核心接口（详细doc待补充...）
 *
 * @version 1.0
 * @author Month_Light
 */
public interface MoonLakeCore {

    /**
     * 获取月色之湖核心API插件实例对象
     *
     * @return 实例对象
     * @deprecated 已过时, 将于 v2.0 去除. 请使用 {@link #getMoonLake()}
     */
    @Deprecated
    MoonLake getInstance(); // TODO 2.0

    /**
     * 获取月色之湖核心API插件实例对象
     *
     * @return 实例对象
     */
    MoonLake getMoonLake();
}
