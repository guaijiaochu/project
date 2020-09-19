# 习题 16: 读写文件43页
from sys import argv
script,filename = argv

print ("We're going to erase %r." % filename)

print ("Opening the file..." )    
target = open(filename, 'a')

# 清空文件
# print ("Truncating the file. Goodbye!")
# target.truncate()

print ("Now I'm going to ask you for three lines.")
line1 = input("line 1: ")
line2 = input("line 2: ")
line3 = input("line 3: ")
print ("I'm going to write these to the file.")

target.write(line1)
target.write("\n")
target.write(line2)
target.write("\n")
target.write(line3)
target.write("\n")
print ("And finally, we close it.")
target.close()

# 1.为什么我们需要给 open 多赋予一个 'w' 参数。提示： open 对于文件的写入操作态度
# 是安全第一，所以你只有特别指定以后，它才会进行写入操作
# 2.'w' 是什么意思？
# 它只是一个特殊字符串，用来表示文件的访问模式。如果你用了 'w' 那么你的文件就是写入
# (write)模式。除了 'w' 以外，我们还有 'r' 表示读取（read）， 'a' 表示追加(append)。
# 3.还有哪些修饰符可以用来控制文件访问？
# 最重要的是 + 修饰符，写法就是 'w+', 'r+', 'a+' ——这样的话文件将以同时读写的方式打
# 开，而对于文件位置的使用也有些不同。
# 4.如果只写 open(filename) 那就使用 'r' 模式打开的吗？
# 是的，这是 open() 函数的默认工作方式。 


