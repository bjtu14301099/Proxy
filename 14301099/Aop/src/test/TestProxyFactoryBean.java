package test;

import Aopproxy.BeanFactory;
import Aopproxy.FooInterface;
import Aopproxy.LocalFileResource;
import Aopproxy.XMLBeanFactory;

public class TestProxyFactoryBean {
	public static void main(String[] args) {
        LocalFileResource resource = new LocalFileResource("bean.xml");
		BeanFactory beanFactory = new XMLBeanFactory(resource);
	    FooInterface foo = (FooInterface)beanFactory.getBean("foo");
	    foo.printFoo();
	    foo.dummyFoo();
	  }
}
