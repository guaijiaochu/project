# 运算
from mxnet import nd

# 利用arrange创建一个行向量
x=nd.arange(12)

# 把行向量x的形状改为(3,4)，即3行4列的矩阵X
X=x.reshape((3,4))
print("\n矩阵1,3行4列",X)
Y=x.reshape((3,4))
print("\n矩阵1,3行4列",Y)

print("\nX+Y结果",X+Y)

# 指数运算
print("\n指数运算",Y.exp())

# 相同位置比较数值
print("\n相同位置比较，数值相同输出1",X==Y)

# 求和矩阵所有元素
print("\n求和所有元素",X.sum())


O=X[1:3]
print("\n截取",O)