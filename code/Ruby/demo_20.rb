#操作字符串

puts"0合并字符串--------------------"
a="我爱"
b="我家"
puts a+b

puts"1--------------------"
puts a
puts b

puts"2--------------------"
a<<b
puts a
puts b
puts"3--------------------"

puts "#{a}#{b}"

puts"4--------------------"

puts (a+b+"!")*3

puts"5替换字符串--------------------"
a="张三"
b=a
a.replace("李四")

puts a
puts b


puts"6复制字符串--------------------"
v="123456sdff"
puts v.dup
puts v.clone


puts"7改变字符串--------------------"
l="qwertyuiop"
puts l.upcase

puts"8-获取字符和子字符串------------------"
str="asd.fgh.jkl.zxc.vbn."
puts str[2]
puts str[4,6]
puts str[8].ord
puts str[-2]

puts"9比较字符串------------------"
s="123456"
q="321654"
w="123456"
if (s==q) then
  puts "s\q字符串内容相等"
else
  puts "s\q字符串内容不相等"
  
end




