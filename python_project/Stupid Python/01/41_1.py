# 习题 41_1:
class Animal (object):
#     pass占位语句不做任何事
    pass

class Dog(Animal):
    def __init__(self,name):
        self.name=name
        
class Cat(Animal):
    def __init__(self,name):
        self.name=name

class Person(object):
    def __init__(self,name):
        self.name=name   
        #人拥有宠物
        self.pet = None

class Employee(Person):
    def __init__(self, name, salary):
        super(Employee, self).__init__(name)
        self.salary = salary

class Fish(object):
    pass

class Salmon(Fish):#三文鱼
    pass

class Halibut(Fish):#大比目鱼
    pass

rover = Dog("Rover")
satan = Cat("Satan")
mary = Person("Mary")












