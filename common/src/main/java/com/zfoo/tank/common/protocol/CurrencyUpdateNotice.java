/*
 *  Copyright (C) 2020 The zfoo Authors
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at
 *  http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and limitations under the License.
 */

package com.zfoo.tank.common.protocol;

import com.zfoo.protocol.IPacket;
import com.zfoo.tank.common.protocol.common.CurrencyVo;

/**
 * @author jaysunxiao
 * @version 3.0
 */
public class CurrencyUpdateNotice implements IPacket {

    private CurrencyVo currencyVo;

    public static CurrencyUpdateNotice valueOf(CurrencyVo currencyVO) {
        var packet = new CurrencyUpdateNotice();
        packet.currencyVo = currencyVO;
        return packet;
    }

    public CurrencyVo getCurrencyVo() {
        return currencyVo;
    }

    public void setCurrencyVo(CurrencyVo currencyVo) {
        this.currencyVo = currencyVo;
    }
}
