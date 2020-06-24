
class Test
  _info="我是在类中定义的局部变量"
    puts _info
end


module Modeinfo
  _info="我是在模块中定义的局部变量"
  puts _info
  puts"我是模块1:"+_info
  puts"我是模块2:",_info
end


def Definfo()
  _info="我是在方法中定义的局部变量"
  puts _info
end
