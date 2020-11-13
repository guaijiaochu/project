from IPython import display
from matplotlib import pyplot as plt
from mxnet import autograd, nd
import random
import time

#线性回归从0实现
# 3.2.1 ⽣成数据集
num_inputs = 2 #输⼊个数（特征数）
num_examples = 1000 #样本数为1000
true_w = [2, -3.4]  #线性回归模型真实权重，真实样本
true_b = 4.2 #偏差

# 每个元素都随机采样于均值为0、标准差为1的正态分布
features = nd.random.normal(scale=1, shape=(num_examples, num_inputs))
labels = true_w[0] * features[:, 0] + true_w[1] * features[:, 1] + true_b
labels += nd.random.normal(scale=0.01, shape=labels.shape)
print(features[0],labels[0])# features的每⼀⾏是⼀个长度为2的向量，而labels的每⼀⾏是⼀个长度为1的向量（标量）。

#
# def use_svg_display():
#     # ⽤⽮量图显⽰
#     display.set_matplotlib_formats('svg') #svg：可伸缩向量图形
#
# def set_figsize(figsize=(3.5, 2.5)):
#     use_svg_display()
#     # 设置图的尺⼨
#     plt.rcParams['figure.figsize'] = figsize
#
# set_figsize()
# plt.scatter(features[:, 1].asnumpy(), labels.asnumpy(), 1); # 加分号只显⽰图
#
# # 我们将上⾯的plt作图函数以及use_svg_display函数和set_figsize函数定义在d2lzh包
# # ⾥。以后在作图时，我们将直接调⽤d2lzh.plt。由于plt在d2lzh包中是⼀个全局变量，我们
# # 在作图前只需要调⽤d2lzh.set_figsize()即可打印⽮量图并设置图的尺⼨。
#
# 3.2.2 读取数据集
# 本函数已保存在d2lzh包中⽅便以后使⽤
def data_iter(batch_size, features, labels):
    num_examples = len(features)
    indices = list(range(num_examples))
    random.shuffle(indices) # 样本的读取顺序是随机的
    for i in range(0, num_examples, batch_size):
        j = nd.array(indices[i: min(i + batch_size, num_examples)])
        yield features.take(j), labels.take(j) # take函数根据索引返回对应元素

# 让我们读取第⼀个小批量数据样本并打印。每个批量的特征形状为(10, 2)，分别对应批量⼤小和输⼊个数；标签形状为批量⼤小。
batch_size = 10
for X, y in data_iter(batch_size, features, labels):
    print(X, y)
    break

# 3.2.3 初始化模型参数
w = nd.random.normal(scale=0.01, shape=(num_inputs, 1))#将权重初始化成均值为0、标准差为0.01的正态随机数
b = nd.zeros(shape=(1,))# 偏差则初始化成0。

#  之后的模型训练中，需要对这些参数求梯度来迭代参数的值
w.attach_grad()#创建梯度
b.attach_grad()#创建梯度
#
# for param in params:
#     param.attach_grad()

# 3.2.4 定义模型
# 下⾯是线性回归的⽮量计算表达式的实现。我们使⽤dot函数做矩阵乘法。
def linreg(X, w, b): # 本函数已保存在d2lzh包中⽅便以后使⽤
    return nd.dot(X, w) + b
#
# # 3.2.5 定义损失函数
# # 我们使⽤上⼀节描述的平⽅损失来定义线性回归的损失函数。在实现中，我们需要把真实值y变
# # 形成预测值y_hat的形状。以下函数返回的结果也将和y_hat的形状相同。
def squared_loss(y_hat, y): # 本函数已保存在d2lzh包中⽅便以后使⽤
    return (y_hat - y.reshape(y_hat.shape)) ** 2 / 2

#
# # 3.2.6 定义优化算法
# # 以下的sgd函数实现了上⼀节中介绍的小批量随机梯度下降算法。它通过不断迭代模型参数来优
# # 化损失函数。这⾥⾃动求梯度模块计算得来的梯度是⼀个批量样本的梯度和。我们将它除以批量
# # ⼤小来得到平均值。
def sgd(params, lr, batch_size): # 本函数已保存在d2lzh包中⽅便以后使⽤
    for param in params:
        param[:] = param - lr * param.grad / batch_size
# # 3.2.7 训练模型
lr = 0.03
num_epochs = 3
net = linreg
loss = squared_loss
for epoch in range(num_epochs):
# 训练模型⼀共需要num_epochs个迭代周期
# 在每⼀个迭代周期中，会使⽤训练数据集中所有样本⼀次（假设样本数能够被批量⼤⼩整除）。X和y分别是⼩批量样本的特征和标签
    for X, y in data_iter(batch_size, features, labels):
        with autograd.record():
            l = loss(net(X, w, b), y)  # l是有关⼩批量X和y的损失
        l.backward()  # ⼩批量的损失对模型参数求梯度
        sgd([w, b], lr, batch_size)  # 使⽤⼩批量随机梯度下降迭代模型参数   #不一样
    train_l = loss(net(features, w, b), labels)
    print('epoch %d, loss %f' % (epoch + 1, train_l.mean().asnumpy()))

# ⽐较学到的参数和⽤来⽣成训练集的真实参数
print(true_w, w)
print(true_b, b)





