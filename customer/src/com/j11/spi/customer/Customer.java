package com.j11.spi.customer;

import com.j11.spi.IService;
import com.j11.spi.IServiceProvider;

import java.util.ServiceLoader;

/**
 * <pre>
 * <b>Description</b>
 * </pre>
 * <pre>
 * 创建时间 2019-07-12 00:46
 * 所属工程： jigsaw-spi-101  </pre>
 *
 * @author sheldon yhid: 80752866
 */
public class Customer {
    public static void main(String[] args) {
        ServiceLoader<IServiceProvider> sl = ServiceLoader.load(IServiceProvider.class);

        for (IServiceProvider provider : sl) {
            IService provide = provider.provide();
            provide.serve();
            if (provide.getName().equals("s2")) {
                provide.halt();
            }
        }
    }
}
