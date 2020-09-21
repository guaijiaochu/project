# 习题 40: 模块、类、对象100页
# 要用创建 mystuff 模块的方法来创建一个类

class MyStuff(object):
    def __init__(self):
        self.tang =  "And now a thousand years between"
    def apple(self):
        print("I AM CLASSY APPLES!")

thing = MyStuff()
thing.apple()
print(thing.tang)


