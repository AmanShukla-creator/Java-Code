# GENERAL DETAILS.....
>>code related to java 
>>Code based on my first experience to java
>>code that contain loops,oops and function
# IMPORTANT COMMANDS AND METHODS.......


| Command                     | What it does                                |
| --------------------------- | ------------------------------------------- |
| `Java: Create Java Project` | Bootstrap project with Maven/Gradle         |
| `Java: Compile Java File`   | Compiles your current file                  |
| `Java: Run Java File`       | Executes current file (no config needed)    |
| `Terminal: Create New`      | Launches a new integrated terminal          |
| `Debug: Start Debugging`    | Debug current thread/stack in depth         |
| `Toggle Breakpoint (F9)`    | Set breakpoints for thread state inspection |
| `Step Over (F10)`           | Skip into the next line                     |
| `Step Into (F11)`           | Go deeper into thread methods               |
| `View: Problems`            | Catch thread-related compile issues         |


# MULTITHREADING METHODS.......


| Method           | Use Case                                       |
| ---------------- | ---------------------------------------------- |
| `start()`        | Starts a new thread                            |
| `run()`          | Thread logic (never call directly!)            |
| `join()`         | Waits for thread to finish                     |
| `sleep(ms)`      | Pause execution (current thread)               |
| `yield()`        | Give chance to other threads                   |
| `setPriority(n)` | Sets thread priority (1 to 10)                 |
| `isAlive()`      | Checks if thread is alive                      |
| `interrupt()`    | Interrupts a thread (good for stopping safely) |
