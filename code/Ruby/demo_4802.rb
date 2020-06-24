

puts "-读取文件------移动文件指针------"

fp="D:/readme.txt"
f=File.new(fp)
puts f.read(6)
puts "文件指针的位置为：#{f.pos}"


f.pos=2
puts f.read(6)
puts "文件指针的位置为：#{f.pos}"
f.close





































