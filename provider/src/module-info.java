/**
 * <pre>
 * <b>Description</b>
 * </pre>
 * <pre>
 * 创建时间 2019-07-12 00:38
 * 所属工程： jigsaw-spi-101  </pre>
 *
 * @author sheldon yhid: 80752866
 */module provider {
     requires service;

     provides com.j11.spi.IServiceProvider with com.j11.provider.impl.S1Provider, com.j11.provider.impl.S2Provider;
}