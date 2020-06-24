
a=0..59
b=60...100
c=b.to_a

puts "a范围中的最小值："+(a.min).to_s
puts "b范围中的最大值："+(b.max).to_s
puts "a范围中的第一个值："+(a.first).to_s
puts "b范围中的最后一个值："+(b.end).to_s

puts b.include?100
puts b.include?99
puts "数组c的长度"+(c.size).to_s