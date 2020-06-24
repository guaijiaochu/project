puts "---加载其他文件----------------------include extend-----"

module First
  def say
    puts "Hello"
  end
end

class Second
  extend First
end

p=Second.new
p.extend(First)
p.say