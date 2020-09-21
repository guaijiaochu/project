# 习题 44: 继承(Inheritance) VS 合成(Composition)
# 练习三种方法
class Parent(object):
    def override(self):
        print("parent override")
    
    def implicit(self):
        print("parent implicit")
    
    def altered(self):
        print("parent altered")

class Child(Parent):
    def override(self):
        print("child override")
    
#     def implicit(self): 
#         print("child implicit")
    
    def altered(self):
        print("child  before parent altered")
        super(Child,self).altered()
        print("child  after parent altered")
        
dad = Parent()     
son = Child()

dad.implicit()
son.implicit()

dad.override()
son.override()

dad.altered()
son.altered()

        
        
        
        
        