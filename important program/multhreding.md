### What is Single Thread?
* A single thread is basically a lightweight and the smallest unit of processing. Java uses threads by using a "Thread
   Class". 
* There are two types of thread – user thread and daemon thread.
* MULTITHREADING in Java is a process of executing two or more threads simultaneously to maximum utilization of CPU.
* Multithreaded applications execute two or more threads run concurrently. Hence, it is also known as Concurrency in
   Java.
* Mulitple threads don't allocate separate memory area, hence they save memory.
* The users are not blocked because threads are independent, and we can perform multiple operations at times.
* As such the threads are independent, the other threads won't get affected if one thread meets an exception.
----------------------------------------------------------------------------------------------------------------------
* There are various stages of life cycle of thread as shown in above diagram: 
   1-New  2-Runnable 3-Running 4-Waiting 5-Dead.
   
 1-New: In this phase, the thread is created using class "Thread class".It remains in this state till the program   	starts the thread. It is also known as born thread.
 2-Runnable: In this page, the instance of the thread is invoked with a start method. 
 3-Running: When the thread starts executing, then the state is changed to "running" state. The scheduler selects one
   thread from the thread pool, and it starts executing in the application.
 4-This is the state when a thread has to wait. As there multiple threads are running in the application, there is a
   need for synchronization between threads. Hence, one thread has to wait, till the other thread gets executed.
   Therefore, this state is referred as waiting state. 
 5-Dead: This is the state when the thread is terminated. The thread is in running state and as soon as it completed
  processing it is in "dead state".
--------------------------------------------------------------------------------------------------------------------
### Some of the commonly used methods for threads are: 
* Start method :- This method starts the execution of the thread and JVM calls the run() method on the thread. 
* Sleep(int milliseconds):-it goes into sleep state.
* getName() :- It returns the name of the thread. 
* setPriority(int newpriority) :- It changes the priority of the thread. 

*A yield() method is a static method of Thread class and it can stop the currently executing thread and will give a chance to other waiting threads of the same priority. If in case there are no waiting threads or if all the waiting threads have low priority then the same thread will continue its execution. The advantage of yield() method is to get a chance to execute other waiting threads so if our current thread takes more time to execute and allocate processor to other threads.
----------------------------------------------------------------------------------------------------------------------


