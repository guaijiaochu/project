# coding:utf-8

# 导入webdriver包
from selenium import webdriver

# 导入time函数
import time

# 打开浏览器
dr = webdriver.Firefox()

# 设置浏览器宽550、高600显示
# dr.set_window_size(550, 600) 
# time.sleep(1)

#将浏览器最大化显示
dr.maximize_window() 
time.sleep(1)

# 转到百度主页
dr.get("http://www.baidu.com")
time.sleep(1)

# partial_link_text定位，用“贴”，找到了"贴 吧"
dr.find_element_by_partial_link_text("贴").click()

# 打印title
print (dr.title)

#智能等待10秒
dr.implicitly_wait(10)

# 后退
dr.get("http://www.baidu.com")
time.sleep(1)

# 输入框输入python，点击搜索
dr.find_element_by_id("kw").send_keys("python")
dr.find_element_by_id("su").click()

# 等待并退出
time.sleep (2)
dr.quit()












'''




#用户名的输入框标红
js="var q=document.getElementById(\"user_name\");q.style.border=\"1px solid
red\";"
#调用 js
dr.execute_script(js)
time.sleep(3)

#滚动条到底部
js="var q=document.documentElement.scrollTop=10000"driver.execute_script(js)
time.sleep(3)












context_click() 右击
double_click() 双击
drag_and_drop() 拖动

# 导入ActionChains包
# from selenium.webdriver.common.action_chains import ActionChains

#定位到要右击的元素
qqq=driver.find_element_by_xpath("/html/body/div/div[2]/div[2]/div/div[3]/table/tbody/tr/td[2]")
#右击
ActionChains(driver).context_click(qqq).perform()


# 鼠标拖放
#定位元素的原位置
element = driver.find_element_by_name("source")
#定位元素要移动到的目标位置
target = driver.find_element_by_name("target")
#移动
ActionChains(driver).drag_and_drop(element, target).perform()
'''