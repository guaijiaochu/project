puts "-模块的定义和使用--------使用模块实现命名空间--------------"

module ModulePlace
  class First
    def place
      puts "first"
    end
  end
end

module ModulePlace2
  class First
    def place
      puts "second"
    end
  end
end

p1=ModulePlace::First.new
p1.place
p2=ModulePlace2::First.new
p2.place
 