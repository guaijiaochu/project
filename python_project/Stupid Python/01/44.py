# 习题 44: 继承(Inheritance) VS 合成(Composition)118页
# 继承：父类和子类有三种交互方式：
# 1. 子类上的动作完全等同于父类上的动作
# 2. 子类上的动作完全改写了父类上的动作
# 3. 子类上的动作部分变更了父类上的动作 


# 隐式继承（Implicit Inheritance）：父类里定义了一个函数，但没有在子类中定义的例子
print("---------------------隐式继承（Implicit Inheritance）")
class Parent(object):
    def implicit(self): #implicit含蓄、隐式
        print("parent implicit")

class Child(Parent):
    pass

dad = Parent()
son = Child()

dad.implicit()
son.implicit()


# 显式覆写（Explicit Override）:让子类里的函数有一个不同的行为，只要在子类 Child 中定义一个相同名称的函数就可以了
print("---------------------显式覆写（Explicit Override）")
class Parent(object):
    def override(self): #override推翻
        print("parent overrive")

class Child(Parent):
    def override(self):
        print("child overrive")

dad = Parent()
son = Child()

dad.override()
son.override()

# 在运行前或运行后覆写:你想在父类中定义的内容运行之前或者之后再修改行为。
# 首先你像上例一样覆写函数，不过接着你用 Python 的内置函数 super 来调用父类 Parent 里的版本。
print("---------------------在运行前或运行后覆写")

class Parent(object):
    def altered(self):
        print("parent altered")
    
class Child (Parent):
    def altered(self):
        print("chile before parent altered")
        super(Child,self).altered()#在子类中调用父类
        print("child after parent altered")

dad = Parent()
son = Child()

dad.altered()
son.altered()










