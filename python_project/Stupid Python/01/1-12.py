# -*- coding: utf-8 -*-
#出现ASCII 编码的错误

# 习题 1: 输出
print ("习题1")
print ("Hello world")


# 习题 2: 注释和井号
print ("习题2")
print (3 + 2 < 5 - 7)
print ("I could have code like this.") # and the comment after is ignored

# 习题 3: 数字和数学计算
print ("习题3")
print ("Hens", 25 + 30 / 6)
print ("Roosters", 100 - 25 * 3 % 4)
print ("What is 5 - 7?", 5 - 7)

# 习题 4: 变量(variable)和命名
print ("习题4")
cars = 100
space_in_a_car = 4.0
drivers = 30
passengers = 90
cars_not_driven = cars - drivers
cars_driven = drivers
carpool_capacity = cars_driven * space_in_a_car
average_passengers_per_car = passengers / cars_driven
# 变量和输出的文字需要用逗号“，”隔开
print ("There are", cars, "cars available.")
print ("There are only", drivers, "drivers available.")
print ("There will be", cars_not_driven, "empty cars today.")
print ("We can transport", carpool_capacity, "people today.")
print ("We have", passengers, "to carpool today.")
print ("We need to put about", average_passengers_per_car, "in each car.")


# 习题 5: 更多的变量和打印
print ("习题5")
my_name = 'zhao'
my_age = 35 # not a lie
my_height = 74 # inches
my_weight = 180 # lbs
my_eyes = 'Blue'
my_teeth = 'White'
my_hair = 'Brown'
# %作为一个替代，将后面的字符串加到后面
# %d指的是字符串
# %d指的是整型
# %d指的是浮点数
print ("Let's talk about %s." % my_name)
print ("He's %d inches tall." % my_height)
print ("He's %d pounds heavy." % my_weight)
print ("Actually that's not too heavy.")
print ("He's got %s eyes and %s hair." % (my_eyes, my_hair))
print ("His teeth are usually %s depending on the coffee." % my_teeth)
# this line is tricky, try to get it exactly right
print ("If I add %d, %d, and %d I get %d." % (my_age, my_height, my_weight, my_age + my_height + my_weight))


# 习题 6: 字符串(string)和文本
print ("习题6")
x = "There are %d types of people." % 10
binary = "binary"
do_not = "don't"
y = "Those who know %s and those who %s." % (binary, do_not)
print (x)
print (y)
print ("I said: %r." % x)
print ("I also said: '%s'." % y)
hilarious = False
joke_evaluation = "Isn't that joke so funny?! %r"
print (joke_evaluation % hilarious)
w = "This is the left side of..."
e = "a string with a right side."
print (w + e)
# %r 和 %s 有什么不同？
# %r 用来做 debug 比较好，因为它会显示变量的原始数据（raw data），而其它的符号则是用来向用户显示输出的。
# 大多数情况用%s

# 习题 7: 更多打印
print ("习题7")


# 习题 8: 打印，打印
print ("习题8")
zhao = "赵"
print ("%s %s %d " %(1,zhao,30))

# 习题9: 打印，打印，打印
print ("习题9")
# \n换行    \r 回车   \t空格
months = "\nJan\nFeb\nMar\nApr\nMay\nJun\rJul\tAug"
print ("Here are the months: ", months)


# 习题10:转义序列
print ("习题10")
# 输出一个\
print("\\666")

# 习题 11: 输入
print ("习题11")
print ("How old are you?")
# 3.0版本input是从键盘录入 字符串 ，若要计算需要进行强制类型转换 2.0版本是raw_input
age = input()
# 加不加（，）的区别是啥？
print ("So, you're %s old." % age), 
xu_age = int(age) +1 
print ("So, you xu_age are  %s old." % xu_age) 

# 习题 12: 输入时提示
print ("习题12")
print ("How tall are you?")
tall = input("请输入身高（cm）：")
print ("So, you're %s cm." % tall) 
































