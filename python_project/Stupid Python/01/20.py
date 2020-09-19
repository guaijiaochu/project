# 习题 20: 函数和文件52页
from sys import argv
script,input_file = argv
def print_all(f):
    print(f.read())

# Python中的seek函数
# file.seek(off, whence=0)：
# 从文件中移动off个操作标记（文件指针），正往结束方向移动，负往开始方向移动。
# 如果设定了whence参数，就以whence设定的起始位为准，0代表从头开始，1代表当前位置，2代表文件最末尾位置。 

def rewind(f):
    f.seek(2)

def print_a_line(line_count,f):
    print (line_count,f.readline())
    
current_file=open(input_file)

# 输出全部文件
print ("输出全部文件First let's print the whole file:")
print_all(current_file)


print ("Now let's rewind, kind of like a tape.")
rewind(current_file)


print ("输出三行内容Let's print three lines:")
current_line = 1
# print_a_line(current_line, current_file)

# current_line = current_line + 1
# print_a_line(current_line, current_file)
# current_line = current_line + 1
# print_a_line(current_line, current_file)


for i in range(0,3) :   
    print_a_line(current_line, current_file)
#     
# range(start, stop[, step])包头不包尾
# 参数说明：
# start: 计数从 start 开始。默认是从 0 开始。例如range（5）等价于range（0， 5）;
# stop: 计数到 stop 结束，但不包括 stop。例如：range（0， 5） 是[0, 1, 2, 3, 4]没有5
# step：步长，默认为1。例如：range（0， 5） 等价于 range(0, 5, 1)




