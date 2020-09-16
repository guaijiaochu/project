# Python3 JSON 数据解析

import json

# Python 字典类型转换为 JSON 对象
data = {
    'no' : 1,
    'name' : 'Runoob',
    'url' : 'http://www.runoob.com'
}

json_str = json.dumps(data)
print ("Python 原始数据：", repr(data))
print ("JSON 对象：", json_str)


# 通过输出的结果可以看出，简单类型通过编码后跟其原始的repr()输出结果非常相似。
# 接着以上实例，我们可以将一个JSON编码的字符串转换回一个Python数据结构：

import json

# python 字典类型转换为json对象

data1 = {
	'no':1,
	'naem':'Runoob',
	'url':'http://www.runoob.com'
}

json_str = json.dumps(data1)
print("Python原始数据：",repr(data1))
print("JSON对象：",json_str)

# 将JSON对象转换为Python字典
data2 = json.loads(json_str)
print("data2['neme']:",data2['naem'])
print("data2['url']:",data2['url'])

# 如果你要处理的是文件而不是字符串，你可以使用 json.dump() 和 json.load() 来编码和解码JSON数据。例如：
# 写入 JSON 数据
# with open('data.json', 'w') as f:
#     json.dump(data, f)

# # 读取数据
# with open('data.json', 'r') as f:
#     data = json.load(f)





####################################### Python3 日期和时间
import time;  # 引入time模块

ticks = time.time()
print ("当前时间戳为:", ticks)


# 获取当前时间
# 从返回浮点数的时间辍方式向时间元组转换，只要将浮点数传递给如localtime之类的函数。
localtime = time.localtime(time.time())
print ("本地时间为 :", localtime)


# 获取格式化时间
# 最简单的获取可读的时间模式的函数是asctime()
localtime = time.asctime( time.localtime(time.time()) )
print ("本地时间为 :", localtime)


print ("###############################################################")
# 格式化成2016-03-20 11:45:39形式
print (time.strftime("%Y-%m-%d %H:%M:%S", time.localtime()))

# 格式化成Sat Mar 28 22:24:24 2016形式
print (time.strftime("%a %b %d %H:%M:%S %Y", time.localtime()))
  
# 将格式字符串转换为时间戳
a = "Sat Mar 28 22:24:24 2016"
print (time.mktime(time.strptime(a,"%a %b %d %H:%M:%S %Y")))


# 获取某月日历
# Calendar模块有很广泛的方法用来处理年历和月历，例如打印某月的月历：
import calendar

cal = calendar.month(2016, 1)
print ("以下输出2016年1月份的日历:")
print (cal)


# 返回当前时间的时间戳（1970纪元后经过的浮点秒数）。
print(time.time( ))


'''
Python3 range() 函数用法
range(stop)
range(start, stop[, step])
参数说明：
start: 计数从 start 开始。默认是从 0 开始。例如range（5）等价于range（0， 5）;
stop: 计数到 stop 结束，但不包括 stop。例如：range（0， 5） 是[0, 1, 2, 3, 4]没有5
step：步长，默认为1。例如：range（0， 5） 等价于 range(0, 5, 1)
'''
# range(5)
# range(0, 5)
for i in range(5):
	print(i)
