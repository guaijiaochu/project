# 习题 44: 继承(Inheritance) VS 合成(Composition)

# 为什么用super()
# 多重继承# 创建一个叫 SuperFun 的类，让它同时继承 Child 和 BadStuff
class Child(object):
    def hair(self):
        print("孩子黑头发")

class BadStuff(object):
    def eat(self):
        print("孩子吃糖")

class SuperFun(Child,BadStuff):
    pass

lihua  = SuperFun()

lihua.hair()
lihua.eat()

        
        