puts "-实例变量和类变量-------------------------------"
puts "-类变量-------------------------------"
@@name="Tom"
class Cat
  puts "#@@name 是一只小猫"
end

class Dog
  puts "#@@name 是一只小狗"
end

cat=Cat.new
dog=Dog.new