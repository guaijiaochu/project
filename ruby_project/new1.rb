$DEBUG=1
# selenium 的 ruby 实现有一个小后门，在代码前加上$DEBUG=1 ，再运行脚本的过程中，
# 就可以看到客户端请求的信息与服务器端返回的数据；可以帮助理解 webdriver 的运行原理。
####################################################################
#业务：自动化测试河北教育考试院官网首页
#
#版本v1.1 
#修改时间2017.10.23
####################################################################

END{
#****************截图并关闭页面***********************************************
puts "<n>截图"
@dr.save_screenshot "D:/project/ruby_project/save_screenshot/hbjyksy#{Time.new.strftime("%Y-%m-%d %H.%M.%S")}.png"

sleep 2
# 关闭本次执行打开的页面
#@dr.close

# 关闭所有页面
@dr.quit
#***********************************************************************
}



BEGIN{	
##############打开浏览器进入百度界面，搜索“河北教育考试院”####################################
# 导入必要的包
require 'rubygems'
require 'irb'
require 'selenium-webdriver'


#打开火狐浏览器
@dr= Selenium::WebDriver.for :ff


#****************设置浏览器尺寸***************************
#浏览器窗口最大化
@dr.manage.window.maximize

#将浏览器设置为600*800
# @dr.manage.window.resize_to(600,800)

#浏览器最小化
#@dr.manage.window.resize_to(0,0)
# *********************************************************
}


# *********************************************************
# 输入网址打开百度搜索引擎
# @dr.navigate.to "http://www.baidu.com"
@dr.get "http://www.baidu.com"


#修改百度一下内容
@dr.execute_script("arguments[0].value = '帮忙百度一下';",@dr.find_element(:id,"su"))
sleep 1 


# 清空输入框内容并输入河北省教育考试院
@dr.find_element(:id,"kw").clear
@dr.find_element(:id,"kw").send_keys "河北省教育考试院"
# @dr.find_element(:id,"kw").set "河北省教育考试院"


#修改百度一下内容
@dr.execute_script("arguments[0].value = '不给你百度';",@dr.find_element(:id,"su"))
sleep 1


#点击按钮“百度一下”
@dr.find_element(:id,"su").click

=begin
**************************************************************
js =<<JS
 var button = document.getElementById("su");
 button.setAttribute("su","你猜一下");

JS
@dr.execute_script js


# sleep 3
# @dr.find_element(:id,"su").click
# 或者直接给value属性赋值
# document.getElementById("su").value = "你猜一下";
**************************************************************

=end

#******************返回信息*************************************
sleep 1
# 返回当前页面的url
curl =@dr.current_url
puts "<1>当前页面的url是：[#{curl}]"

# 返回当前页面的title
title=@dr.title
puts "<2>当前页面的title是:[#{title}]"

#获取1标签的名字
tn=@dr.find_element(:id,"1")
puts "<3>标签的tagname是："+tn.tag_name
# ***********************************************************



#*************执行一段JS脚本：找到id=1的div，并高亮显示红色*****************
# 元素q的id为"1"
# 元素q的样式为"4红色"
js = <<JS
	q = document.getElementById("1");
	q.style.border = "4px solid red";
JS
@dr.execute_script js
# **************************************************************************


#*************执行一段JS脚本：找到id=2的div，并高亮显示绿色*****************
=begin

#定义方法高亮显示绿色
def highlight
	e_id = self.attribute('id')
	puts "#{e_id} = e_id"
	js = <<JS
	document.getElementById("#{e_id}").style.border = "3px solid green"
JS
@bridge.executeScript(js) if e_id

end
@dr.find_element(:id,"2").highlight
=end

#**********************************************************************


#*************自动focus到页面上的第三个盒子***********************
=begin
自动focus到页面上的第三个盒子
jss = <<JS
	q=document.getElementById("3");
	q.focus()

JS
@dr.execute_script jss
=end 
#********************************************************************



#********************************************************************
# 定位页面上所有的 link 对象
# all_links = driver.find_elements(:tag_name, 'a')
# all_links.each do {|l| puts l.class}
#********************************************************************



# 点击链接河北教育考试院
@dr.find_element(:link_text,"河北省教育考试院").click
sleep 0.5

#######################以下是在新选项卡（河北教育考试院）进行的#######################################################

def yggk
	sleep 0.5
	# 滚动条拉到底部
	# js="var q=document.documentElement.scrollTop=10000"
js = <<JS
	var q=document.documentElement.scrollTop=10000
JS
	# 谷歌
	# var q=document.body.scrollTop=10000

	@dr.execute_script(js)
	sleep 0.5

	# 阳光高考信息平台
	@dr.find_element(:link_text,"阳光高考信息平台").click
	sleep 1
	# 返回当前页面的title   由于没有切换窗口，所以输出结果仍然为河北省教育考试院
	title=@dr.title
	puts "<6>当前页面的title是:[#{title}]"
end



# 转换选项卡到河北省教育考试院主页
inum=@dr.window_handles.length
  # puts inum
  if inum>1
    handle=@dr.window_handles
    handle.each do |d|
      @dr.switch_to.window(d)
      # puts d
      stitle=@dr.title
      # puts stitle
      if stitle=="河北省教育考试院"
        puts ("<5>当前标题为：#{stitle},跳出循环")
		
		# 执行方法
		yggk

        
        break 
      end
        puts ("<4>当前标题为：#{@dr.title},继续=>>>")
    end
  end



#***************操作句柄**********************************
# 返回当前所有打开浏览器的窗口句柄
# window_handles

# 返回当前的浏览器的窗口句柄
# puts window_handle 

# 返回当前页面的源码
# page_source 

  # //设置隐性等待时间  
  #       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

#******************************************************

