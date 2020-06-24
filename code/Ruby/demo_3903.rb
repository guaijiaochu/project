puts "---proc-----------------------"


v=proc do |value|
  puts "Proc传递的值是:#{value}"
  
end

v.call("123564")

def info
  yield "proc 对象作为参数传递"
end

info &v