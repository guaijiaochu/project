puts "-模块的定义和使用----------------------"

module ModuleName
  def moduleinfo
    puts "我是模块里面的方法成员"
  end
  
  def self.info
    puts "我是模块里面的类方法成员"
  end
end

ModuleName.info







 