puts "---异常处理机制--------------显示抛出异常------"


def info
  raise NameError,"方法显示抛出异常"
end

begin

info

rescue NameError
  puts "捕获了NameError异常"


end