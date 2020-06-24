puts "---proc-----------------------"

def callpro(ab)
  a="我是在方法内部声明的变量"
  puts a
  ab.call
end

a="我是 在方法外部声明的变量"
pr=Proc.new{puts a }
pr.call
callpro(pr)


