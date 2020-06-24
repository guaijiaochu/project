

puts "-读取文件------readchar------"

fp="D:/readme.txt"
f=File.new(fp)
puts f.readchar
f.close
puts "---------------------------------"

fp="D:/readme.txt"
f=File.new(fp)
while line=f.gets
puts line
end
f.close
puts "---------------------------------"

fp="D:/readme.txt"
f=File.new(fp)
f.each do |line|
puts line
end
f.close












































