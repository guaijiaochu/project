# 习题 18命名、变量、代码、函数：47页

# 函数  需要用：结尾，并且函数体需要缩进

# this one is like your scripts with argv
def print_two(*args):
    arg1, arg2 = args
    print ("arg1: %r, arg2: %r" % (arg1, arg2))
 
# ok, that *args is actually pointless, we can just do this
def print_two_again(arg1, arg2):
    print ("arg1: %r, arg2: %r" % (arg1, arg2))
# 函数 print_two 的问题是：它并不是创建函数最简单的方法。在 Python 函数中我们可以跳过整个
# 参数解包的过程，直接使用 () 里边的名称作为变量名。这就是 print_two_again 实现的功能。
 
 
 
# this just takes one argument
def print_one(arg1):
    print ("arg1: %r" % arg1)
 
# this one takes no arguments
def print_none():
    print ("I got nothin'.")
 
print_two("Zed","Shaw")
print_two_again("Zed","Shaw")
print_one("First!")
print_none()
