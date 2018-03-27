# 采用pageobject设计模式，改进new5 

# 导入必要的包，打开xx浏览器，并最大化，输入目标网址

# 导入必要的包
#coding:utf-8
require "selenium-webdriver"
require "irb"



#打开火狐浏览器
# @dr= Selenium::WebDriver.for :chrome


def browser browser

	if browser == "ie"
		@dr= Selenium::WebDriver.for :ie

	elsif browser == "ff"
		@dr= Selenium::WebDriver.for :ff

	elsif browser == "chrome"
		@dr= Selenium::WebDriver.for :chrome
	else
		@dr= Selenium::WebDriver.for :chrome
		
		
	end
	max

end



# browser "chrome"



def max
#浏览器窗口最大化
@dr.manage.window.maximize
end




def openwebsite openwebsite
	# 打开目标网址
	@dr.get openwebsite

	#为了方便查看结果，等待
	sleep 1

	# 关闭本次执行打开的页面
	#@dr.close

	# 关闭所有页面
	@dr.quit

end




