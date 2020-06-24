
puts "----***********************---"

fp="D:/readme.txt"
f=File.new(fp)
f.each_byte do |b|
print "#{b}"
end
puts
f.close











