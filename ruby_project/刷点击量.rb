# 在浏览器输入框输入待刷的网址，打开页面
# require 'watir-webdriver'
require 'watir'
require 'irb'

# 定义函数
def shua
	for i in 1..10
		@browser.goto "http://baoding.offcn.com/html/2020/03/47748.html"
		 puts "浏览器内执行的第 #{i} 次"
		sleep 3
	end
end


# 循环次数
for i in 1..10
	# 打开浏览器
	@browser=Watir::Browser.new :chrome
	 puts "第 #{i} 次打开浏览器"
	   shua()
	# 退出浏览器
	@browser.quit
end
