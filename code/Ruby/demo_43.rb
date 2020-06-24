puts "--正则表达式---------------"




if /[a-z]/.match("qwe")
  puts "匹配"
else
  puts "不匹配"
  
end


if "Aq".match(/[A-Z]/)
  puts "匹配"
else
  puts "不匹配"
end

puts "helloworld"=~/hello*/
puts "worldhello"=~/hello*/
#puts "helloworld"=~/ASAS/


puts "****************"
a=/([a-z]+),([A-Za-z]+)/
b="qer,Aqwe"
a.match(b)
puts"匹配第一个#{$1}"
puts"匹配第二个#{$2}"





