from mxnet import autograd, nd
# MXNet提供autograd模块来⾃动化求导过程。
# MXNet的autograd模块可以对⼀般的命令式程序进⾏求导。
# • MXNet的 运 ⾏ 模 式 包 括 训 练 模 式 和 预 测 模 式。 我 们 可 以 通 过autograd.
# is_training()来判断运⾏模式。

print("2.3.1简单例子**********************************************\n")
# 2.3.1简单例子
# 对函数 y = 2x⊤x 求关于列向量 x 的梯度。我们先创建变量x，并赋初值。
x = nd.arange(4).reshape((4, 1))
print("创建变量x，并赋初值:",x)

# 为了求有关变量x的梯度，我们需要先调⽤attach_grad函数来申请存储梯度所需要的内存。
x.attach_grad()

# 下⾯定义有关变量x的函数。为了减少计算和内存开销，默认条件下MXNet不会记录⽤于求梯度
# 的计算。我们需要调⽤record函数来要求MXNet记录与求梯度有关的计算。
with autograd.record():
    y = 2 * nd.dot(x.T, x)

# 由于x的形状为（4, 1），y是⼀个标量。接下来我们可以通过调⽤backward函数⾃动求梯度。需
# 要注意的是，如果y不是⼀个标量，MXNet将默认先对y中元素求和得到新的变量，再求该变量有
# 关x的梯度。
y.backward()#求梯度

# 函数 y = 2x⊤x 关于x 的梯度应为4x。现在我们来验证⼀下求出来的梯度是正确的。
# assert语句：用以检查某一条件是否为True，若该条件为False则会给出一个AssertionError
assert (x.grad - 4 * x).norm().asscalar() == 0
print("求出来的梯度是:",x.grad)

print("2.3.2 训练模式和预测模式**********************************************\n")
# 2.3.2 训练模式和预测模式
# 从上⾯可以看出，在调⽤record函数后，MXNet会记录并计算梯度。
# 默认情况下autograd还将运⾏模式从预测模式转为训练模式。
# 这可以通过调⽤is_training函数来查看。
print("调⽤is_training函数来查看运⾏模式从预测模式转为训练模式:",autograd.is_training())
with autograd.record():
    print("在有些情况下，同⼀个模型在训练模式和预测模式下的⾏为并不相同:",autograd.is_training())
# 在有些情况下，同⼀个模型在训练模式和预测模式下的⾏为并不相同。我们会在后⾯的章节（如
# “丢弃法”⼀节）详细介绍这些区别。


print(" 2.3.3 对Python控制流求梯度**********************************************\n")
# 2.3.3 对Python控制流求梯度
# 使⽤MXNet的⼀个便利之处是，即使函数的计算图包含了Python的控制流（如条件和循环控制），
# 我们也有可能对变量求梯度。
# 考虑下⾯程序，其中包含Python的条件和循环控制。需要强调的是，这⾥循环（while循环）迭
# 代的次数和条件判断（if语句）的执⾏都取决于输⼊a的值。
def f(a):
    b = a * 2
    while b.norm().asscalar() < 1000:
        b = b * 2
    if b.sum().asscalar() > 0:
        c = b
    else:
        c = 100 * b
    return c

# 我们像之前⼀样使⽤record函数记录计算，并调⽤backward函数求梯度。
a = nd.random.normal(shape=1)
a.attach_grad()
with autograd.record():
    c = f(a)
c.backward()
# 我们来分析⼀下上⾯定义的f函数。事实上，给定任意输⼊a，其输出必然是 f(a) = x * a的
# 形式，其中标量系数x的值取决于输⼊a。由于c = f(a)有关a的梯度为x，且值为c / a，我们
# 可以像下⾯这样验证对本例中控制流求梯度的结果的正确性。
a.grad == c / a
print(a.grad)