#循环语句
puts"1-while--------------------"
i=1
while (i<5)do
  puts "第"+i.to_s+"次被打印的是"+i.to_s
    i+=1
end


puts"2-until--------------------"
i=1
until(i>5)do
  puts "第"+i.to_s+"次被打印的是"+i.to_s
    i+=1
end


puts"3-for-in--------------------"
num=[1,2,3,4,5,6]
for n in num
  puts n
end

puts"4-迭代器--------------------"

 num=["数据1","数据2","数据3","数据4","数据5"]
 num.each do|num|
   puts num
 end