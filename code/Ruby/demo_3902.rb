puts "---proc-----------------------"


def procall(&a)
  a.call
  
end

procall{puts "我是proc对象"}