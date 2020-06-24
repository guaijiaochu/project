puts "-访问文件------------------检查文件是否存在-------------"

fp="D:/readme.txt"
fpnew="D:/config.ini"
e1=FileTest.exist?(fp)
e2=FileTest.exists?(fpnew)

if (e1) 
puts  "文件#{fp}存在"
else
  puts "文件#{fp}不存在"
end


if (e2) 
puts  "文件#{fpnew}存在"
else
  puts "文件#{fpnew}不存在"
end
puts "-访问文件--------------查看文件大小-------"

puts "文件大小为："+FileTest.size?(fp).to_s
puts "文件大小为0嘛？："+FileTest.zero?(fp).to_s
puts "文件实际大小为："+FileTest.size(fp).to_s

puts "-访问文件------------------获取设置文件时间戳-------------"

m1=File.mtime(fp)
a1=File.atime(fp)
c1=File.ctime(fp)

File.utime(Time.now,Time.now,fp)

f=File.new(fp)
m2=f.mtime
a2=f.atime
c2=f.ctime


puts "#{fp}文件时间戳："
puts "最后修改+#{m1}"
puts "最后读取+#{a1}"
puts "最后创建+#{c1}"

puts "修改后#{fp}文件时间戳："
puts "最后修改+#{m2}"
puts "最后读取+#{a2}"
puts "最后创建+#{c2}"



































































