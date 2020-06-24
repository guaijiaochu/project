puts "-读取文件----------打开文件---"

fp="D:/readme.txt"
f=File.new(fp)
f=File.new(fp,"r+")

File.open(fp) do |file|
  #file 参数是打开的文件对象
end

f=open(fp)


open(fp) do |file|
  #file 参数是打开的文件对象
end
puts "-读取文件----------关闭文件---"
file.close



















































