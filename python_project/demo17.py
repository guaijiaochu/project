# coding:utf-8

class Animal:
	def eat(self):
		print ("吃")
	def move(self):
		print("动")


a = Animal()
a.eat()
a.move()

class Dog(Animal):
	def eat(self):
		print ("狗吃肉")

	def move(self):
		print ("狗会跑")

b = Dog()
b.eat()
b.move()