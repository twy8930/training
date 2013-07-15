package com.intyt.generics;

/**
 * 不使用泛型的示例
 * @author twy
 *
 */

class Automobile{
	public double price;
}

public class WithoutGenerics {

	//销售
	public double sell(Automobile automobile){
		return automobile.price;
	}
}
