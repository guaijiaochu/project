
# 函数
def hello() :
   print("Hello World!")

   
hello()


# 在 python 中，类型属于对象，变量是没有类型的：
a=[1,2,3]
print (a)
a="Runoob"
print (a)
# 以上代码中，[1,2,3] 是 List 类型，"Runoob" 是 String 类型，
# 而变量 a 是没有类型，她仅仅是一个对象的引用（一个指针），
# 可以是指向 List 类型对象，也可以是指向 String 类型对象。



print ("******************************")
# 默认参数
#可写函数说明
def printinfo( name, age = 35 ):
   "打印任何传入的字符串"
   print ("名字: ", name);
   print ("年龄: ", age);
   return;
 
#调用printinfo函数
printinfo( age=50, name="runoob" );
print ("------------------------")
printinfo( name="runoob" );

# 变量作用域
x = int(2.9)  # 内建作用域
 
g_count = 0  # 全局作用域
def outer():
    o_count = 1  # 闭包函数外的函数中
    def inner():
        i_count = 2  # 
# Python 中只有模块（module），类（class）以及函数（def、lambda）才会引入新的作用域，其它的代码块（如 if/elif/else/、try/except、for/while等）
# 是不会引入新的作用域的，也就是说这些语句内定义的变量，外部也可以访问


# 全局变量和局部变量
total = 0; # 这是一个全局变量
# 可写函数说明
def sum( arg1, arg2 ):
    #返回2个参数的和."
    total = arg1 + arg2; # total在这里是局部变量.
    print ("函数内是局部变量 : ", total)
    return total;

#调用sum函数
sum( 10, 20 );
print ("函数外是全局变量 : ", total)