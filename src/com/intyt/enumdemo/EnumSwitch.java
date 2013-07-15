package com.intyt.enumdemo;

/**
 * Enum用于switch演示
 * @author twy
 *
 */
public class EnumSwitch {
	
	public static void main(String[] args) {
		Color color=Color.RED;
		switch (color) {
		case RED://直接可以引用到
			System.out.println("红色");
			break;
		case BLACK://直接可以引用到
			System.out.println("黑色");
			break;
		default:
			System.out.println("其它颜色");
			break;
		}
	}

}
