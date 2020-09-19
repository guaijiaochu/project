# 习题 15: 读取文件41页
from sys import argv
script,filename = argv
txt = open(filename)
print("Here's your file %s:" %filename)
print(txt.read())


#需要打开的文件尽量让用户输入
print ("请输入你要打开的文件名:")
file_again = input("> ")
print("你输入的是%s"  %file_again)
txt_again = open(file_again)
print (txt_again.read())


#此处没有关闭文件
# quit()







