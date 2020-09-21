# 习题 44: 继承(Inheritance) VS 合成(Composition)
# 合成
# 继承是一种有用的技术，不过还有一种实现相同功能的方法，就是直接使用别的类和模块，而非依赖于
# 继承。如果你回头看的话，我们有三种继承的方式，但有两种会通过新代码取代或者修改父类的功能。
# 这其实可以很容易地用调用模块里的函数来实现。我们再来个例子：

class  Other(object):
    def override(self):
        print("other override")
    def implicit(self):
        print("other implicit")
    def altered(self):
        print("other altered")

# 直接使用别的类和模块
# zzz直接调用了Other()类，而不是继承Other()，这种方法叫做合成
class Child(object):
    def __init__(self):
        self.zzz=Other()
    def implicit(self):
        self.zzz.implicit()
    def override(self):
        print("child override")
    def altered(self):
        print("child,before other altered")
        self.zzz.altered()
        print("child,after other altered")
son = Child()
son.implicit()
son.override()
son.altered()


# 继承和合成的应用场合
# “继承 vs 合成”的问题说到底还是关于代码重用的问题。
#         继承可以让你在基类里隐含父类的功能，从而解决了这个问题。
#         而合成则是利用模块和别的类中的函数调用实现了相同的目的。

# 如果两种方案都能解决重用的问题，那什么时候该用哪个呢？（多用合成）
#     1. 不惜一切代价地避免多重继承，它带来的麻烦比能解决的问题都多。
#     2. 如果你有一些代码会在不同位置和场合应用到，那就用合成来把它们做成模块。
#     3. 只有在代码之间有清楚的关联，可以通过一个单独的共性联系起来的时候使用继承

# 少用继承的原因：
# 用到继承时候肯定会有覆写（多态）。继承的耦合的很高，一处修改会导致处处修改。从而后期维护是灾难性的的。
# 合成（组合）耦合度较低。是一个类里有另一个类的引用。而只要类接口不变就不会出现 一处修改导致处处修改。因为知识调用，而不是覆写。
#合成（组合）将功能模块化，提取到外部，而不是像继承一样提取到父类






        