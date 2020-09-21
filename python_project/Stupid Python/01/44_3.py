# 习题 44: 继承(Inheritance) VS 合成(Composition)
# super() 和 __init__ 搭配使用
# 最常见的 super() 的用法是在基类的 __init__ 函数中使用。通常这也是唯一可以进行这种操作的地方，
# 在这里你在子类里做了一些事情，然后完成对父类的初始化。

# class Parent():
#     def work(self):
#         print("成人要工作")
class Child(Parent):
    def __init__(self,stuff):
        self.stuff=stuff
        super(Child,stuff)._init_()
#         
# limin = Child()
# limin.work()
    















        