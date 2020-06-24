
puts "----*******操作路径***************---"


fp1="D:/newme.txt"
puts File.dirname(fp1)
puts File.basename(fp1)
puts File.basename(fp1,".txt")
puts "----************---"

puts File.expand_path(fp1)
puts File.join("readme","newme.txt")
puts "----************---"

fp1="D:/newme.txt"
fp2="D:/readme/newme1.txt"
File.rename(fp1,fp2)
