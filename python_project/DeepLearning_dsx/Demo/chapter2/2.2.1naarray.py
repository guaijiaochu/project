from mxnet import nd
# 创建
# 利用arrange创建一个行向量
x=nd.arange(12)
print("\n输出：",x)

# 获取形状
print("\n形状：",x.shape)

# 获取总数
print("\n总数：",x.size)

# 把行向量x的形状改为(3,4)，即3行4列的矩阵X
X=x.reshape((3,4))
print("\n矩阵1,3行4列",X)

# 如下是3行4列
Y=x.reshape((3,4))
W=x.reshape((-1,4))
print("\n矩阵2,3行四列",Y)
Z=x.reshape((3,-1))
print("\n矩阵3,3行四列",Z)

# 创建张量（元素是0）
A=nd.zeros((2,3,4))
print("矩阵4,元素是0的张量",A)

# 创建张量（元素是1）
A=nd.ones((2,3,4))
print("矩阵5,元素是1的张量",A)

# 通过python的list指定要创建的NDarray的值
B=nd.array([[1,1,1,1],[2,2,2,2,][3,3,3,3],[4,4,4,4],[5,5,5,5]])

# 要随机⽣成NDArray中每个元素的值。下⾯我们创建⼀个形状为(3,4)的NDArray。它的每个元素都随机采样于均值为0、标准差为1的正态分布。
C=nd.random.normal(0,1,shape=(3,4))