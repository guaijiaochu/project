puts "---别名和定义------------------------"

def name
  puts "我定义的是name方法"
end

alias namenew name

def name
  puts "我是重新定义的name方法"
end

puts name
puts namenew

puts "---判断表达式是否定义------------------------"
class Return
  def Replay
    puts "123456789"
    puts defined?"你是优秀的"
  end
end

p=Return.new
puts defined?p.Replay
p.Replay

puts "---释放定义------------------------"
class Fly
  def run
    puts "猪会跑"
  end
end

fly=Fly.new
#undef run
puts defined?fly.run
fly.run



