# 习题 19: 函数和变量50页
# 函数里边的变量和脚本里边的变量之间是没有连接的
def cheese_and_crackers(cheese_count,boxes_of_crackers):
    print ("You have %d chesese!"%cheese_count)
    print ("You have %d boxes of crackers!" % boxes_of_crackers)


print ("从这里开始:")
cheese_and_crackers(20, 30)


print ("修改参数值后：")
amount_of_cheese = 10
amount_of_crackers = 50
cheese_and_crackers(amount_of_cheese, amount_of_crackers)

print ("可以用作计算：")
cheese_and_crackers(10 + 20, amount_of_crackers + 6)













