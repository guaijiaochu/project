from mxnet import nd
from time import time
# 3.1 线性回归
# 3.1.1 线性回归的基本要素
# 3.1.2 线性回归的表⽰⽅法


# ⽮量计算表达式
# 两个向量相加的两种⽅法
a = nd.ones(shape=1000)
b = nd.ones(shape=1000)
# 向量相加的⼀种⽅法是，将这两个向量按元素逐⼀做标量加法。
def time_1():
    start = time()
    c = nd.zeros(shape=1000)
    for i in range(1000):
        c[i] = a[i] + b[i]
    print("time1")
    print(time() - start)

# 向量相加的另⼀种⽅法是，将这两个向量直接做⽮量加法。
def time_2():
    startnew = time()
    d = a + b
    print("time2")
    print(time() - startnew)

# 后者⽐前者更省时。因此，我们应该尽可能采⽤⽮量计算，以提升计算效率

time_1()
time_2()





