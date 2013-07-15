package com.intyt.enumdemo;

/**
 * 枚举构造器
 * @author twy
 *
 */
enum RGBColor {
	
	RED(255, 0, 0), BLUE(0, 0, 255), BLACK(0, 0, 0), YELLOW(255, 255, 0), GREEN(
			0, 255, 0);
	// 构造枚举值，比如RED(255,0,0)
	private RGBColor(int rv, int gv, int bv) {
		this.redValue = rv;
		this.greenValue = gv;
		this.blueValue = bv;
	}

	public String toString() { // 覆盖了父类Enum的toString()
		return super.toString() + "(" + redValue + "," + greenValue + ","
				+ blueValue + ")";
	}

	private int redValue; // 自定义数据域，private为了封装。
	private int greenValue;
	private int blueValue;
}

public class EnumConstructor {
	
}
