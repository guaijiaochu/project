# 习题 14: 提示和传递39页
from sys import argv
script,user_name = argv
prompt = '请输入：'

print ("Hi %s, I'm the %s script." % (user_name, script))
print ("Do you like me %s?" % user_name)
likes = input(prompt)
print ("Where do you live %s?" % user_name)
lives = input(prompt)
print ("What kind of computer do you have?")
computer = input(prompt)
print ("""
Alright, so you said %r about liking me.
You live in %r. Not sure where that is.
And you have a %r computer. Nice.
""" % (likes, lives, computer))
# 三个引号 """ 可以定义多行字符串





