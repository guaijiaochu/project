from mxnet import nd
import numpy as np

# 我们可以通过array函数和asnumpy函数令数据在NDArray(普通数组)和NumPy（numpy数组）格式之间相互变换。

# NumPy(Numerical Python) 是 Python 语言的一个扩展程序库
# NumPy 最重要的一个特点是其 N 维数组对象 ndarray，它是一系列同类型数据的集合，以 0 下标为开始进行集合中元素的索引。



# 下⾯将NumPy（numpy数组）实例变换成NDArray(普通数组)实例。
P = np.ones((2, 3))#（numpy数组）
D = nd.array(P)#NDArray(普通数组)   numpy->mxnet
print("D1:",D)


# 再将NDArray实例变换成NumPy实例。
DD=D.asnumpy()#（DD:numpy数组）   mxnet->numpy
print("DD:",DD)

# • NDArray是MXNet中存储和变换数据的主要⼯具。
# • 可以轻松地对NDArray创建、运算、指定索引，并与NumPy之间相互变换












