# 习题 17: 更多文件操作45页
from sys import argv
from os.path import exists
script, from_file, to_file = argv
print ("Copying from %s to %s" % (from_file, to_file))
# we could do these two on one line too, how?
in_file = open(from_file)
indata = in_file.read()
print ("The input file is %d bytes long" % len(indata))

#我们 import 了又一个很好用的命令 exists。这个命令将文件名字符串作为参
# 数，如果文件存在的话，它将返回 True，否则将返回 False。
print ("Does the output file exist? %r" % exists(to_file))
print ("现在写入文件.")
out_file = open(to_file, 'a+')
out_file.write(indata)
print ("Alright, all done.")

print ("原文件内容是：")
print (indata)



out_file.close()
in_file.close()













