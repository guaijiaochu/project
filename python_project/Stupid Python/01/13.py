# 习题 13: 参数、解包、变量 37页
#eclipse给脚本传参：运行-运行配置-第二个：参数   多个参数用空格隔开

print ("习题13")
from sys import  argv
script,first,second,third=argv
print("The script is called:",script)
print ("Your first variable is:", first)
print ("Your second variable is:", second)
print ("Your third variable is:", third)