from IPython import display
# from matplotlib import pyplot as plt
from mxnet import autograd, nd
import random
import time

#线性回归简洁实现gluon
# 3.3.1 ⽣成数据集
num_inputs = 2 #输⼊个数（特征数）
num_examples = 1000 #样本数为1000
true_w = [2, -3.4]  #线性回归模型真实权重，真实样本
true_b = 4.2 #偏差

# 每个元素都随机采样于均值为0、标准差为1的正态分布
features = nd.random.normal(scale=1, shape=(num_examples, num_inputs))
labels = true_w[0] * features[:, 0] + true_w[1] * features[:, 1] + true_b
labels += nd.random.normal(scale=0.01, shape=labels.shape)
print(features[0],labels[0])# features的每⼀⾏是⼀个长度为2的向量，而labels的每⼀⾏是⼀个长度为1的向量（标量）。



# 3.3.2 读取数据集
from mxnet.gluon import data as gdata
batch_size = 10
# 将训练数据的特征和标签组合
dataset = gdata.ArrayDataset(features, labels)
# 随机读取⼩批量
data_iter = gdata.DataLoader(dataset, batch_size, shuffle=True)
for X, y in data_iter:
    print(X, y)
    break

# 3.3.4 定义模型
from mxnet.gluon import nn
net = nn.Sequential()
net.add(nn.Dense(1))

# # 3.3.3 初始化模型参数
from mxnet import init
net.initialize(init.Normal(sigma=0.01))

# # # 3.3.5 定义损失函数
from mxnet.gluon import loss as gloss
loss = gloss.L2Loss() # 平⽅损失⼜称L2范数损失

# # # 3.3.6 定义优化算法
from mxnet import gluon
trainer = gluon.Trainer(net.collect_params(), 'sgd', {'learning_rate': 0.03})
# # # 3.3.7 训练模型
num_epochs = 3
for epoch in range(1, num_epochs + 1):
    for X, y in data_iter:
        with autograd.record():
            l = loss(net(X), y)
        l.backward()
        trainer.step(batch_size)#不一样
    l = loss(net(features), labels)
    print('epoch %d, loss: %f' % (epoch, l.mean().asnumpy()))
# print('epoch %d, loss %f' % (epoch + 1, train_l.mean().asnumpy()))

# # ⽐较学到的参数和⽤来⽣成训练集的真实参数
dense = net[0]

print(true_w, dense.weight.data())
print(true_b, dense.bias.data())


