
puts "----*******写入文件****************---"

fp="D:/readme.txt"
f=File.new(fp,"w+")
$\="\n"
f.puts("qwe")
f.puts("qwe")
f.write("asd")
f.write("asd")
f.print("zxc")
f.print("zxc")
f.close



fp="D:/readme.txt"
f=File.new(fp,"a")
$\="\n"
f.puts("战法")

f.close







