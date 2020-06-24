puts "-读取文件----------读取文件---"

fp="D:/readme.txt"
f=File.new(fp,"r+")
puts f.read(19)

b=""
puts f.read(20,b)
puts b
#puts f.read

f.close

































