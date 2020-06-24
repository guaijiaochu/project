puts "-属性---------------设置器--------------"
class Person
  def name=(val)
       @name=val
  end
  def show
    puts "#@name"
  end
end


p=Person.new
p.name="李四"
p.show