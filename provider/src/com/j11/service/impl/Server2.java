package com.j11.service.impl;

import com.j11.spi.IService;

/**
 * <pre>
 * <b>Description</b>
 * </pre>
 * <pre>
 * 创建时间 2019-07-12 00:24
 * 所属工程： jigsaw-spi-101  </pre>
 *
 * @author sheldon yhid: 80752866
 */
public class Server2 implements IService {
    @Override
    public String getName() {
        return "s2";
    }

    @Override
    public void serve() {
        System.out.println("s2 is serving");
    }

    @Override
    public void halt() {
        System.out.println("s2 stopped");
    }
}
