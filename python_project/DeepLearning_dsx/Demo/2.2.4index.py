# 索引
from mxnet import nd

# 利用arrange创建一个行向量
x=nd.arange(12)

# 把行向量x的形状改为(3,4)，即3行4列的矩阵X
X=x.reshape((3,4))
print("\n矩阵1,3行4列",X)

# 指定了NDArray的⾏索引截取范围[1:3]。依据左闭右开指定范围的惯例，
# 它截取了矩阵X中⾏索引为1和2的两⾏。
print("\n截取",X[1:3])

2
X[1, 2] = 99
print("\n单个索引，2行3列改为99",X)




