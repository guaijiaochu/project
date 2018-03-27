# coding: utf-8
# python3


# 输出语句（函数）
print("helloworld")


# 第一行代码的解释
# 如果调用python脚本时，使用:
# python script.py
#!/usr/bin/python 被忽略，等同于注释
# 如果调用python脚本时，使用:
# ./script.py 
#!/usr/bin/python 指定解释器的路径。


'''多行注释
再解释一下第一行代码#!/usr/bin/python3
这句话仅仅在linux或unix系统下有作用，在windows下无论在代码里加什么都无法直接运行一个文件名后缀为.py的脚本，因为在windows下文件名对文件的打开方式起了决定性作用。
'''


# 行与缩进
'''
python最具特色的就是使用缩进来表示代码块，不需要使用大括号 {} 。
缩进的空格数是可变的，但是同一个代码块的语句必须包含相同的缩进空格数。
'''
a=1
if a<0:
	print ("a为负数")
else:
	print ("a为正数或0")


# 多行语句
# Python 通常是一行写完一条语句，但如果语句很长，我们可以使用反斜杠(\)来实现多行语句，例如：
# total = item_one + \
#         item_two + \
#         item_three

help(max)


# List（列表）
list = [ 'abcd', '786' , 2.23, 'runoob', 70.2 ]
tinylist = [123, 'runoob']
 
print (list)            # 输出完整列表
print (list[0])         # 输出列表第一个元素
print (list[1:3])       # 从第二个开始输出到第三个元素
print (list[2:])        # 输出从第三个元素开始的所有元素
print (tinylist * 2)    # 输出两次列表
print (list + tinylist) # 连接列表

# 逻辑运算符
# x and y  布尔"与" - 如果 x 为 False，x and y 返回 False，否则它返回 y 的计算值。	(a and b) 返回 20。
     # python 中的 and 从左到右计算表达式，若所有值均为真，则返回最后一个值，若存在假，返回第一个假值；
# x or y  布尔"或" - 如果 x 是 True，它返回 x 的值，否则它返回 y 的计算值。	(a or b) 返回 10。
# not x  布尔"非" - 如果 x 为 True，返回 False 。如果 x 为 False，它返回 True。	not(a and b) 返回 False



# 成员运算符
# in  如果在指定的序列中找到值返回 True，否则返回 False。
# not in  如果在指定的序列中找到值返回 True，否则返回 False。

# 身份运算符
# is 是判断两个标识符是不是引用自一个对象

# is not 是判断两个标识符是不是引用自不同对象     x is y, 类似 id(x) == id(y) , 如果引用的是同一个对象则返回 True，否则返回 False
# is 用于判断两个变量引用对象是否为同一个， == 用于判断引用变量的值是否相等。

# 数字
# 在整数除法中，除法（/）总是返回一个浮点数，如果只想得到整数的结果，丢弃可能的分数部分，可以使用运算符 // ：
# Python 可以使用 ** 操作来进行幂运算：

