# 运算内存开销
from mxnet import nd

# 在前⾯的例⼦⾥我们对每个操作新开内存来存储运算结果。举个例⼦，即使像Y = X + Y这样
# 的运算，我们也会新开内存，然后将Y指向新内存。为了演⽰这⼀点，我们可以使⽤Python⾃带
# 的id函数：如果两个实例的ID⼀致，那么它们所对应的内存地址相同；反之则不同。


x=nd.arange(12)# 利用arrange创建一个行向量
X=x.reshape((3,4))# 把行向量x的形状改为(3,4)，即3行4列的矩阵X
Y = nd.array([[2, 1, 4, 3], [1, 2, 3, 4], [4, 3, 2, 1]])

print("X是：",X)
print("Y是：",Y)
before = id(Y)
Y = Y + X
print("两次Y内存是否一致：\n",id(Y) == before)

# 如果想指定结果到特定内存，我们可以使⽤前⾯介绍的索引来进⾏替换操作。在下⾯的例⼦中，
# 我们先通过zeros_like创建和Y形状相同且元素为0的NDArray，记为Z。接下来，我们把X +
# Y的结果通过[:]写进Z对应的内存中。

Z = Y.zeros_like()
print("Z是：",Z)

before = id(Z)
Z[:] = X + Y #把X + Y的结果通过[:]写进Z对应的内存中。
id(Z) == before
print("两次Z内存是否一致：\n",id(Z) == before)

# 实际上，上例中我们还是为X + Y开了临时内存来存储计算结果，再复制到Z对应的内存。如果
# 想避免这个临时内存开销，我们可以使⽤运算符全名函数中的out参数。
nd.elemwise_add(X, Y, out=Z)
print("不去用zeros_like创建空间，避免临时内存开销：\n",id(Z)==before)


# 如果X的值在之后的程序中不会复⽤，我们也可以⽤ X[:] = X + Y 或者 X += Y 来减少运算的内存开销。
# （X += Y没有产生新的对象）(X =X+ Y产生新的对象)
before = id(X)
# X += Y
X[:]=X+Y
print("⽤ X[:] = X + Y 或者 X += Y 来减少运算 的内存开销。：\n",id(X)==before)




