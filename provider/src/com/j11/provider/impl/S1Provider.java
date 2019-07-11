package com.j11.provider.impl;

import com.j11.service.impl.Server1;
import com.j11.spi.IService;
import com.j11.spi.IServiceProvider;

/**
 * <pre>
 * <b>Description</b>
 * </pre>
 * <pre>
 * 创建时间 2019-07-12 00:39
 * 所属工程： jigsaw-spi-101  </pre>
 *
 * @author sheldon yhid: 80752866
 */
public class S1Provider implements IServiceProvider {

    @Override
    public IService provide() {
        return new Server1();
    }
}
