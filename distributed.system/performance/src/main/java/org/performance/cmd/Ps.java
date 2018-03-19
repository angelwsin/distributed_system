package org.performance.cmd;

public class Ps {
	
	/*5种进程状态

	[plain] view plain copy
	1. 运行(正在运行或在运行队列中等待)   
	2. 中断(休眠中, 受阻, 在等待某个条件的形成或接受到信号)   
	3. 不可中断(收到信号不唤醒和不可运行, 进程必须等待直到有中断发生)   
	4. 僵死(进程已终止, 但进程描述符存在, 直到父进程调用wait4()系统调用后释放)   
	5. 停止(进程收到SIGSTOP, SIGSTP, SIGTIN, SIGTOU信号后停止运行运行)   
	ps工具标识进程的5种状态码: 

	[plain] view plain copy
	D 不可中断 uninterruptible sleep (usually IO)   
	R 运行 runnable (on run queue)   
	S 中断 sleeping   
	T 停止 traced or stopped   
	Z 僵死 a defunct (”zombie”) process  */
	
	/**
	 * 
	 * 
	 * Process Status
	 * ps命令用于报告当前系统的进程状态。可以搭配kill指令随时中断、删除不必要的程序。ps命令是最基本同时也是非常强大的进程查看命令，
	 * 使用该命令可以确定有哪些进程正在运行和运行的状态、进程是否结束、进程有没有僵死、哪些进程占用了过多的资源等等，总之大部分信息都是可以通过执行该命令得到的。
	 * -a
	 * -u
	 * -x
	 * -p
	 * -C
	 * 
	 * grep -aux |grep commd
	 * 
	 */

}
