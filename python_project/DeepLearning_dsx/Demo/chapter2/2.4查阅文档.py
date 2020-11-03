# 2.4.1 查找模块⾥的所有函数和类
# 当我们想知道⼀个模块⾥⾯提供了哪些可以调⽤的函数和类的时候，可以使⽤dir函数。下⾯我
# 们打印nd.random模块中所有的成员或属性。
from mxnet import nd
print(dir(nd.random))

# 均匀分布采样（uniform）、从正态分布采样（normal）、从泊松分布采样（poisson）



# 2.4.2 查找特定函数和类的使⽤
help(nd.ones_like)

# ones_like函数会创建和输⼊NDArray形状相同且元素为1的新NDArray
x = nd.array([[0, 0, 0], [2, 2, 2]])
y = x.ones_like()
print("y的值：",y)










