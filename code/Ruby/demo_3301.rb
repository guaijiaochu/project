puts "-模块的定义和使用--------混含操作--------------"

module ModuleName
  def moduleinfo
    puts "我是模块里面的方法成员"
  end
end

class ClassMoudleName
  include ModuleName
end
p=ClassMoudleName.new
p.moduleinfo





 