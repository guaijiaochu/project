# 当内部作用域想修改外部作用域的变量时，就要用到global和nonlocal关键字了。
# 以下实例修改全局变量 num：
num = 1
def fun1():
    global num  # 需要使用 global 关键字声明
    print(num) 
    num = 123
    print(num)
fun1()


# 如果要修改嵌套作用域（enclosing 作用域，外层非全局作用域）中的变量则
# 需要 nonlocal 关键字了，如下实例：
def outer():
    num1 = 10
    def inner():
        nonlocal num1   # nonlocal关键字声明
        num1 = 100
        print(num1)
    inner()
    print(num1)
outer()


# 函数内可以访问全局变量，但不能更新(修改)其值！可以加上 global 引用以更新变量值 :

a = 10
def sum ( n ) :
   global a
   n += a
   a = 11
   print ('a = ', a, end = ' , ' )
   print ( 'n = ', n )

sum ( 3 )
print ( '外 a = ', a )
