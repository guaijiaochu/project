# 淘宝网执行相关操作
# 导入必要的包
require 'rubygems'
require 'irb'
require 'selenium-webdriver'

# 打开火狐浏览器
dr=Selenium::WebDriver.for :ff

# 窗口最大化
dr.manage.window.maximize

# 打开淘宝网
dr.get "http://www.taobao.com"

dr.find_element(:id,'q').send_key "华为手机"
dr.find_element(:class,'search-button').click

# 选择 移动4G/联通4G/电信4G
dr.find_element(:xpath,".//*[@id='J_NavCommonRowItems_2']/a[1]/span[2]").click

# 点击运行内存RAM
dr.find_element(:xpath,".//*[@id='spulist-nav']/div/div[2]/div/div[5]/div[2]/div/span").click

# 此处需要等待0.5秒
sleep 0.5

# 点击6G
dr.find_element(:xpath,".//*[@id='spulist-nav']/div/div[2]/div/div[5]/div[3]/div/a[2]").click

# 截图
dr.save_screenshot "D:/githubproject/project/ruby_project/save_screenshot/new5/华为手机#{Time.new.strftime("%Y-%m-%d %H.%M.%S")}.png"


for i in 0...10
	sleep 0.1
	i=i+1
	puts "
	"
	phone= dr.find_element(:xpath,".//*[@id='spulist-grid']/div/div/div[#{i}]/div/div[2]/div[1]/a").text
	puts "文字信息#{i}：#{phone}"

end




# 退出
#为了方便查看结果，等待2秒
sleep 1
dr.quit