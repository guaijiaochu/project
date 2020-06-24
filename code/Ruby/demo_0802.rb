
$info="我是全局变量"
class Test
  _info="我是在类中定义的局部变量"
    puts _info
    puts $info
    puts "------------------------"
end

    puts "------------------------"

module Modeinfo
  _info="我是在模块中定义的局部变量"
  puts _info
  puts"我是模块1:"+_info
  puts"我是模块2:",_info
  puts $info
end
    puts "------------------------"

  printf("132456789")
def info
  tinfo="我是在方法中定义的局部变量"
  puts tinfo
  puts $info
  printf("132456789")
end
    puts "------------------------"