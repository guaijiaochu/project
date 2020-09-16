# 导入webdriver包
from selenium import webdriver
# 导入time函数
import time

def shua( ):
	for i in  range(1,3):
		# 转到目标网址
		dr.get("http://baoding.offcn.com/html/2020/03/47748.html")

		# 等待时间
		time.sleep(1)

		# 输出
		print("第",i,"次打开网址")


# d打开浏览器次数
for i in  range(1,3):
	# 打开浏览器
	# dr = webdriver.Firefox()
	dr = webdriver.Chrome()
	# dr = webdriver.Ie()
	# 输出
	print("第",i,"次打开浏览器")

	# 执行函数
	shua()
	# 退出浏览器
	dr.quit()


