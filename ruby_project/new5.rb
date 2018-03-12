#############################################
#业务：淘宝搜索目标数据
#
#版本v1.1 
#修改时间2018.3.12
############################################


#**********BEGIN块：导入必要的包，打开火狐浏览器，并最大化*************
BEGIN{
	# 导入必要的包
	require 'rubygems'
	require 'irb'
	require 'selenium-webdriver'

	#打开火狐浏览器
	dr= Selenium::WebDriver.for :ff

	#浏览器窗口最大化
	dr.manage.window.maximize
	sleep 0.5
}
#***********************************************************************



#***********END块：关闭页面*********************************************
END {
	#为了方便查看结果，等待
	sleep 0.5
	
	# 关闭本次执行打开的页面
	#dr.close

	# 关闭所有页面
	dr.quit
}
#***********************************************************************


# 打开淘宝网
dr.get "http://www.taobao.com"

# 输入华为手机，点击搜索
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



# ****************************将文字信息输出到new5*****************************************
# 以写入模式打开文件
aFile = File.new("new5.txt", "r+")

# 遍历前10个数据
for i in 0...10
	sleep 0.05
	i=i+1
	# puts "
	# "
	# 文字信息赋给phone
	phone= dr.find_element(:xpath,".//*[@id='spulist-grid']/div/div/div[#{i}]/div/div[2]/div[1]/a").text
	
	# 输出文字信息及其编码
	puts "文字信息#{i}：#{phone}"
	puts phone.encoding


	# 将文字信息输出到new5.txt
	if aFile
	   aFile.syswrite("提取文字信息#{i}: #{phone}
")

	else
	   puts "Unable to open file!"
	end


end
# *************************************************************************************

