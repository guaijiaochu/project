#############################################
#业务：百度搜索目标数据
#
#版本v1.1 
#修改时间2017.10.27
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
	# 关闭本次执行打开的页面
	#dr.close

	# 关闭所有页面
	dr.quit
}
#***********************************************************************



# 输入网址打开百度搜索引擎，搜索目标数据
dr.get "http://www.baidu.com"

#定义一个变量n
n=0

# 将输入的值参数化，通过for循环遍历输出
for line in open('data.txt',encoding:'utf-8').readlines()
	
	n=n+1

	print "第#{n}次搜索\n" 
	
	# 清空输入框，输入数据 
	dr.find_element(:id,"kw").clear
	dr.find_element(:id,"kw").send_keys line
	dr.find_element(:id,"su").click 

	# 必须等待0.5秒，否则执行太快，获取到的url和title不是当前页面的
	sleep 0.5

	# 返回当前页面的url
	curl =dr.current_url
	puts "<1>当前页面的url是：[#{curl}]"

	# 返回当前页面的title
	title=dr.title
	puts "<2>当前页面的title是:[#{title}]"


	# 截图
	puts "<3>截图"
	dr.save_screenshot "D:/githubproject/project/ruby_project/save_screenshot/new3_1/baidu#{n}.png"

	
	
begin
	# 查看浏览器的名字
	bname=dr.name
	puts "<4>浏览器的名字为：[#{bname}]"
	
rescue Exception => e
	
	puts "<4>查看浏览器名字时出现异常：
	#{e.message}"

	# Logger.error("【name is not found】")
	dr.save_screenshot "D:/githubproject/project/ruby_project/save_screenshot/new3_1/logger#{n}.png"
ensure
	puts "第#{n}次搜索完毕"
end


# 打印浏览器的版本号
print "浏览器的版本号为："
puts dr.capabilities.version

puts '**************************************************'

end











=begin






#可以直接换行
puts '123'
print '456
789
'

decode的作用是将其他编码的字符串转换成unicode编码，
如str1.decode('gb2312')，表示将gb2312编码的字符串转换成unicode编码。

encode的作用是将unicode编码转换成其他编码的字符串，
如str2.encode('gb2312')，表示将unicode编码的字符串转换成gb2312编码。

把TXT文件的编码改成utf-8即可，open('data.txt').readlines()

String sss=open('data.txt',dncoding:'utf-8').readlines()
puts sss


=end