#条件语句
puts"1-if--------------------"
puts "请输入分数"
 score= gets.to_i

if (score<60)then
  puts "不及格"
else
  puts "及格"
end

puts"2-unless--------------------"
puts "请输入分数"
 score= gets.to_i
unless (score>=60)then
  puts "不及格"
else
  puts "及格"
end

puts"3-case--------------------"
puts "请输入分数"
 score= gets.to_i
case score
  when 0..60then
  puts"不及格"
  when 60...80then
  puts"及格" 
  when 80...90then
  puts"良好"
  when 90..100
   puts"优秀"
else
   puts "输入有误"
end
 