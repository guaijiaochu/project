
puts "----*******操作目录***************---"

puts Dir.pwd
puts Dir.getwd



puts "----*******改变目录***************---"
puts Dir.pwd
puts Dir.getwd

puts "----************---"
Dir.chdir("G:/")
puts Dir.pwd

puts "----**************---"
Dir.chdir
puts Dir.pwd

puts "----*******遍历目录内容**************---"
Dir.chdir("G:/1study/code/Ruby")
puts Dir.pwd


puts "----*******s删除指定目录*************---"