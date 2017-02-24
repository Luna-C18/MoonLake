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
 
 
package com.minecraft.moonlake.nms.exception;

import com.minecraft.moonlake.exception.MoonLakeException;

/**
 * <h1>NMSException</h1>
 * NMS 异常类（详细doc待补充...）
 *
 * @version 1.0
 * @author Month_Light
 * @deprecated 已过时, 将于 v1.9-a5 删除. 请使用 {@link com.minecraft.moonlake.api.nms.exception.NMSException}
 */
@Deprecated
public class NMSException extends MoonLakeException {

    /**
     * NMS 异常类构造函数
     */
    public NMSException() {

        this("The nms exception");
    }

    /**
     * NMS 异常类构造函数
     *
     * @param message 异常消息
     */
    public NMSException(String message) {

        super(message);
    }

    /**
     * NMS 异常类构造函数
     *
     * @param message 异常消息
     * @param cause 异常原因
     */
    public NMSException(String message, Throwable cause) {

        super(message, cause);
    }
}
