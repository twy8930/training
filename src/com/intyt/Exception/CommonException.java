package com.intyt.Exception;

/**
 * 常见异常
 * @author twy
 *
 */
public class CommonException {
	
	/**
	NO.1　java.lang.NullPointerException
	java.lang.Object
	java.lang.Throwable
	java.lang.Exception
	java.lang.RuntimeException
	java.lang.NullPointerException

	　　这个异常的解释是 "程序遇上了空指针 "，简单地说就是调用了未经初始化的对象或者是不存在的对象，对数组操作中出现空指针，很
	多情况下是一些刚开始学习编程的朋友常犯的错误，即把数组的初始化和数组元素的初始化混淆起来了。数组的初始化是对数组分配需要的
	空间，而初始化后的数组，其中的元素并没有实例化，依然是空的，所以还需要对每个元素都进行初始化（如果要调用的话）
	当应用程序试图在需要对象的地方使用 null 时，抛出该异常。这种情况包括：
	调用 null 对象的实例方法。
	访问或修改 null 对象的字段。
	将 null 作为一个数组，获得其长度。
	将 null 作为一个数组，访问或修改其时间片。
	将 null 作为 Throwable 值抛出。
	应用程序应该抛出该类的实例，指示其他对 null 对象的非法使用。


	NO.2　java.lang.ClassNotFoundException
	java.lang.Object
	java.lang.Throwable
	java.lang.Exception
	java.lang.ClassNotFoundException

	　　这个异常的解释是 "指定的类不存在 "，这里主要考虑一下类的名称和路径是否正确即可.
	当应用程序试图使用以下方法通过字符串名加载类时，抛出该异常：
	Class 类中的 forName 方法。
	ClassLoader 类中的 findSystemClass 方法。
	ClassLoader 类中的 loadClass 方法。
	但是没有找到具有指定名称的类的定义。


	NO.3　java.lang.ArithmeticException
	java.lang.Object
	java.lang.Throwable
	java.lang.Exception
	java.lang.RuntimeException
	java.lang.ArithmeticException

	当出现异常的运算条件时，抛出此异常。
	　　这个异常的解释是 "数学运算异常 "，比如程序中出现了除以零这样的运算就会出这样的异常，对这种异常，大家就要好好检查一下自
	己程序中涉及到数学运算的地方，公式是不是有不妥了。


	NO.4　java.lang.ArrayIndexOutOfBoundsException
	java.lang.Object
	java.lang.Throwable
	java.lang.Exception
	java.lang.RuntimeException
	java.lang.IndexOutOfBoundsException
	java.lang.ArrayIndexOutOfBoundsException

	　　这个异常的解释是 "数组下标越界 "，现在程序中大多都有对数组的操作，因此在调用数组的时候一
	定要认真检查，看自己调用的下标是不是超出了数组的范围，一般来说，显示（即直接用常数当下标）调用不太容易出这样的错，但隐式（
	即用变量表示下标）调用就经常出错了，还有一种情况，是程序中定义的数组的长度是通过某些特定方法决定的，不是事先声明的，这个时
	候，最好先查看一下数组的length，以免出现这个异常。
	用非法索引访问数组时抛出的异常。如果索引为负或大于等于数组大小，则该索引为非法索引。


	NO.5　java.lang.IllegalArgumentException
	java.lang.Object
	java.lang.Throwable
	java.lang.Exception
	java.lang.RuntimeException
	java.lang.IllegalArgumentException


	抛出的异常表明向方法传递了一个不合法或不正确的参数。
	　　这个异常的解释是 "方法的参数错误 "，很多J2ME的类库中的方法在一些情况下都会引发这样的错误，比如音量调节方法中的音量参数
	如果写成负数就会出现这个异常，再比如 g.setColor(int red,int green,int blue)这个方法中的三个值，如果有超过２５５的也会出现
	这个异常，因此一旦发现这个异常，我们要做的，就是赶紧去检查一下方法调用中的参数传递是不是出现了错误。


	NO.6　java.lang.IllegalAccessException
	java.lang.Object
	java.lang.Throwable
	java.lang.Exception
	java.lang.IllegalAccessException

	　　这个异常的解释是 "没有访问权限 "，当应用程序要调用一个类，但当前的方法即没有对该类的访问权限便会出现这个异常。对程序中
	用了Package的情况下要注意这个异常。
	当应用程序试图创建一个实例（而不是数组）、设置或获取一个字段，或者调用一个方法，但当前正在执行的方法无法访问指定类、字段、
	方法或构造方法的定义时，抛出 IllegalAccessException。


	NO.7　java.lang.IncompatibleClassChangeError
	java.lang.Object
	java.lang.Throwable
	java.lang.Error
	java.lang.LinkageError
	java.lang.IncompatibleClassChangeError

	不兼容的类变化错误。当正在执行的方法所依赖的类定义发生了不兼容的改变时，抛出该异常。一般在修改了应用中的某些类的声明定义而
	没有对整个应用重新编译而直接运行的情况下，容易引发该错误。
	在某些类定义中出现不兼容的类更改时抛出该异常。某些目前执行的方法所依赖的类定义已发生了变化。


	NO.8　java.lang.InstantiationError
	java.lang.Object
	java.lang.Throwable
	java.lang.Error
	java.lang.LinkageError
	java.lang.IncompatibleClassChangeError
	java.lang.InstantiationError

	实例化错误。当一个应用试图通过Java的new操作符构造一个抽象类或者接口时抛出该异常.
	通常由编译器捕获此错误；如果类定义中存在不兼容的更改，则此错误将只可能在运行时发生。


	NO.9　java.lang.LinkageError
	java.lang.Object
	java.lang.Throwable
	java.lang.Error
	java.lang.LinkageError

	链接错误。该错误及其所有子类指示某个类依赖于另外一些类，在该类编译之后，被依赖的类改变了其类定义而没有重新编译所有的类，进
	而引发错误的情况。
	LinkageError 的子类指示一个类在一定程度上依赖于另一个类；但是，在编译前一个类之后，后一个类发生了不相容的改变。


	NO.10　java.lang.StackOverflowError
	java.lang.Object
	java.lang.Throwable
	java.lang.Error
	java.lang.VirtualMachineError
	java.lang.StackOverflowError

	堆栈溢出错误。当一个应用递归调用的层次太深而导致堆栈溢出时抛出该错误。


	NO.11　java.lang.Exception
	java.lang.Object
	java.lang.Throwable
	java.lang.Exception

	Exception 类及其子类是 Throwable 的一种形式，它指出了合理的应用程序想要捕获的条件。 (异常层次结构的根类)


	NO.12　java.lang.RuntimeException
	java.lang.Object
	java.lang.Throwable
	java.lang.Exception
	java.lang.RuntimeException

	RuntimeException 是那些可能在 Java 虚拟机正常运行期间抛出的异常的超类。可能在执行方法期间抛出但未被捕获的 RuntimeException
	的任何子类都无需在 throws 子句中进行声明。 (java.lang中异常的基类)


	NO.13　java.util.InputMismatchException
	java.lang.Object
	java.lang.Throwable
	java.lang.Exception
	java.lang.RuntimeException
	java.util.NoSuchElementException
	java.util.InputMismatchException

	由 Scanner 抛出，表明用于检索的标记与期望类型的模式不匹配，或者该标记处在期望类型的范围之外。


	NO.14　java.io.IOException
	java.lang.Object
	java.lang.Throwable
	java.lang.Exception
	java.io.IOException

	当发生某种 I/O 异常时，抛出此异常。此类为异常的通用类，它是由失败的或中断的 I/O 操作生成的。


	NO.15　java.io.FileNotFoundException
	java.lang.Object
	java.lang.Throwable
	java.lang.Exception
	java.io.IOException
	java.io.FileNotFoundException

	当试图打开指定路径名表示的文件失败时，抛出此异常。
	在不存在具有指定路径名的文件时，此异常将由 FileInputStream、FileOutputStream 和 RandomAccessFile 构造方法抛出。
	如果该文件存在，但是由于某些原因不可访问，比如试图打开一个只读文件进行写入，此时这些构造方法仍然会抛出该异常。


	NO.16　java.io.EOFException
	java.lang.Object
	java.lang.Throwable
	java.lang.Exception
	java.io.IOException
	java.io.EOFException

	当输入过程中意外到达文件或流的末尾时，抛出此异常。
	此异常主要被数据输入流用来表明到达流的末尾。注意，其他许多输入操作返回一个特殊值表示到达流的末尾，而不是抛出异常。


	NO.17　java.lang.InterruptedException
	java.lang.Object
	java.lang.Throwable
	java.lang.Exception
	java.lang.InterruptedException

	当线程在很长一段时间内一直处于正在等待、休眠或暂停状态，而另一个线程用 Thread 类中的 iterrupt 方法中断它时，抛出该异常。


	NO.18　java.lang.NumberFormatException
	java.lang.Object
	java.lang.Throwable
	java.lang.Exception
	java.lang.RuntimeException
	java.lang.IllegalArgumentException
	java.lang.NumberFormatException
	
	**/
}
