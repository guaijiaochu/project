puts "---eval----------------------"


puts "---eval 动态执行的代码---"
count=Array.new
startTime=Time.now
puts "eval 动态执行的代码的开始时间为;"+startTime.to_s

s="12345679"

for qwe in 1..100100
 eval( "count<<s")
end
endTime=Time.now

puts "eval 动态执行的代码的结束时间为;"+endTime.to_s
puts "eval 动态执行的代码的时间间隔为;"+(endTime-startTime).to_s





puts"---正常执行的代码----"


count=Array.new
startTime=Time.now
puts "正常执行的代码的开始时间为;"+startTime.to_s

s="12345679"

for qwe in 1..100100
  count<<s
end
endTime=Time.now

puts "正常执行的代码的结束时间为;"+endTime.to_s
puts "正常执行的代码的时间间隔为;"+(endTime-startTime).to_s






