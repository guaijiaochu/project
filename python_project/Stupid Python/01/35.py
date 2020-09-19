# 习题 35: 分支和函数
from sys import exit
def gold_room():
    print( "This room is full of gold. How much do you take?这个房间里装满了金子。你带多少钱")
    next = input(">")
    if  "0" in next or "1" in next:
        how_much=int(next)
    else:
        dead("Man, learn to type a number.伙计，学着打数字吧")
        
    if how_much<50:
        print("Nice, you're not greedy, you win!不错，你不贪心，你赢了!")
        exit(0)
    else:
        dead("You greedy bastard!你贪婪的混蛋!")
def bear_room():
    print ("There is a bear here.这里有一只熊。")
    print ("The bear has a bunch of honey.熊有一堆蜂蜜。")
    print ("The fat bear is in front of another door.那只胖熊在另一扇门前。")
    print ("How are you going to move the bear?你打算怎么移动这只熊?")
    bear_moved = False
    while True:
        next = input("> ")
        if next == "take honey":
            dead("The bear looks at you then slaps your face off.熊看了看你，然后把你的脸打了下来。")
        
        elif next == "taunt bear" and not bear_moved:#奚落熊
            print ("The bear has moved from the door. You can go through it now.熊已经离开了门。你现在可以办理了")
            bear_moved = True
        
        elif next == "taunt bear" and bear_moved:
            dead("The bear gets pissed off and chews your leg off.熊生气了，咬掉了你的腿。")
        
        elif next == "open door" and bear_moved:
            gold_room()
        
        else:
            print ("I got no idea what that means.我不知道那是什么意思")
def cthulhu_room():
    print ( "Here you see the great evil Cthulhu.这里你看到的是巨大的邪恶的克苏鲁。")
    print ( "He, it, whatever stares at you and you go insane.他、它、任何东西盯着你看，然后你就疯了")
    print ( "Do you flee for your life or eat your head?你为自己的性命逃跑呢，还是吃自己的头呢?")
    next = input("> ")
    if "flee" in next:
        start()
    elif "head" in next:
        dead("Well that was tasty!嗯，那很美味!")
    else:
        cthulhu_room()
        
def dead(why):
    print (why, "Good job!")
#     exit(0)


def start():
    print ("You are in a dark room.你在一个黑暗的房间里。")
    print ("There is a door to your right and left.你的左右两边都有一扇门。")
    print ("Which one do you take?你要哪一个?:left/right")
    next = input("> ")
    if next == "left":
        bear_room()
    elif next == "right":
        cthulhu_room()
    else:
        dead("You stumble around the room until you starve.你在房间里跌跌撞撞，直到饿死。")
start()











